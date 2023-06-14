package bai02_trang17;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Sach {
	private String maSach;
	private LocalDate ngayNhap;
	private float donGia;
	private int soLuong;
	private String nXB;
	
	public abstract float tinhThanhTien();

	public Sach(String maSach, LocalDate ngayNhap, float donGia, int soLuong, String nXB) {
		super();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nXB = nXB;
	}

	@Override
	public String toString() {		
		return String.format(" %-15s | %-15s | %,15.2f | %,15d | %-15s", maSach, formatDDMMYYYY(ngayNhap).toString(), donGia, soLuong, nXB); 
	}
	
	public String formatDDMMYYYY(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String strDate = date.format(formatter);
		return strDate;		
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public LocalDate getNgayNhap() {		
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getnXB() {
		return nXB;
	}

	public void setnXB(String nXB) {
		this.nXB = nXB;
	}
}
