package bai07_trang20;

import java.time.LocalDate;

public class HangThucPham extends HangHoa implements Interface_XuLy {
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;	

	public HangThucPham(String maHang, String tenHang, float donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaCungCap = nhaCungCap;
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	
	public float tinhTienThueVAT() {
		float tienThue = 0f;
		tienThue = getSoLuongTon() * getDonGia() * VAT5;
		
		return tienThue;
	}
	
	public String danhGiaMucDoBanBuon() {
		String ketQua = "";
		if(getSoLuongTon() > 0 && (getNgayHetHan().isBefore(LocalDate.now()))) ketQua = "H�ng kh� b�n";
		
		return ketQua;
	}

	@Override
	public String toString() {
		return String.format("| %-15s | %-30s | %,15.1f | %,15d | %-20s | %-20s | %-20s | %-20s |", getMaHang(), getTenHang(), getDonGia(), getSoLuongTon()
				, nhaCungCap, formatDDMMYYYY(ngaySanXuat), formatDDMMYYYY(ngayHetHan), danhGiaMucDoBanBuon());
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isBefore(LocalDate.now())) this.ngaySanXuat = ngaySanXuat;
		else this.ngaySanXuat = LocalDate.now();
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isAfter(ngaySanXuat)) this.ngayHetHan = ngayHetHan;
		else this.ngayHetHan = this.ngaySanXuat;
	}
}
