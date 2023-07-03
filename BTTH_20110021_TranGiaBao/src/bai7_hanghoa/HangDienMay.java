package bai7_hanghoa;

import java.time.LocalDate;

public class HangDienMay extends HangHoa implements Interface_XuLy{
	private int thoiGianBaoHanh;
	private int congSuat;
	
	public HangDienMay(String maHang, String tenHang, float donGia, int soLuongTon, int thoiGianBaoHanh,
			int congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBaoHanh(thoiGianBaoHanh);
		setCongSuat(congSuat);
	}

	public float tinhTienThueVAT() {
		float tienThue = 0f;
		tienThue = getSoLuongTon() * getDonGia() * VAT10;
		
		return tienThue;
	}
	
	public String danhGiaMucDoBanBuon() {
		String ketQua = "";
		if(getSoLuongTon() < 3) ketQua = "Bán được";
		
		return ketQua;
	}
	
	@Override
	public String toString() {
		return String.format("| %-15s | %-30s | %,15.1f | %,15d | %,20d | %,20d | %-20s |", getMaHang(), getTenHang(), getDonGia(), getSoLuongTon()
				, thoiGianBaoHanh, congSuat, danhGiaMucDoBanBuon());
	}
	
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if(thoiGianBaoHanh > 0) this.thoiGianBaoHanh = thoiGianBaoHanh;
		else this.thoiGianBaoHanh = 0;
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(int congSuat) {
		if(congSuat > 0) this.congSuat = congSuat;
		else this.congSuat = 0;
	}
}
