package bai07_trang20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HangSanhSu extends HangHoa implements Interface_XuLy {
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	public HangSanhSu(String maHang, String tenHang, float donGia, int soLuongTon, String nhaSanXuat,
			LocalDate ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		setNgayNhapKho(ngayNhapKho);
	}

	public float tinhTienThueVAT() {
		float tienThue = 0f;
		tienThue = getSoLuongTon() * getDonGia() * VAT10;
		
		return tienThue;
	}
	
	public String danhGiaMucDoBanBuon() {
		String ketQua = "";
		if(getSoLuongTon() > 50 && ChronoUnit.DAYS.between(getNgayNhapKho(), LocalDate.now()) > 10) ketQua = "Bán chậm";
		
		return ketQua;
	}
	
	@Override
	public String toString() {
		return String.format("| %-15s | %-30s | %,15.1f | %,15d | %-20s | %-20s | %-20s |", getMaHang(), getTenHang(), getDonGia(), getSoLuongTon()
				, nhaSanXuat, formatDDMMYYYY(ngayNhapKho), danhGiaMucDoBanBuon());
	}
	
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho.isBefore(LocalDate.now())) this.ngayNhapKho = ngayNhapKho;
		else this.ngayNhapKho = LocalDate.now();
	}
}
