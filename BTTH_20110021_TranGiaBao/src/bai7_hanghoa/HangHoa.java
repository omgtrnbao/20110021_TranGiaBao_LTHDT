package bai7_hanghoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class HangHoa {
	private String maHang = "";
	private String tenHang = "xxx";
	private float donGia = 0;
	private int soLuongTon = 0;
	
	public HangHoa(String maHang, String tenHang, float donGia, int soLuongTon) {
		super();
		this.maHang = maHang;
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}
	
	public abstract String danhGiaMucDoBanBuon();
	
	public String formatDDMMYYYY(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String strDate = date.format(formatter);
		return strDate;		
	}
	
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if(tenHang.trim().length() == 0) this.tenHang = "xxx";
		else this.tenHang = tenHang;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		if(donGia > 0) this.donGia = donGia;
		else this.donGia = 0;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		if(soLuongTon > 0) this.soLuongTon = soLuongTon;
		else this.soLuongTon = 0;
	}
	public String getMaHang() {
		return maHang;
	}
}
