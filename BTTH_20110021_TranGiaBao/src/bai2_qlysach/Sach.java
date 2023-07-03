package bai2_qlysach;

public class Sach {
	
	private String maSach, ngayNhap;
	protected double donGia;
	protected int soLuong;
	private String nhaXB;
	
	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXB) {
		super();
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXB(nhaXB);
	}
	
	public double thanhTien() {
		return soLuong * donGia;
	}
	
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong
				+ ", nhaXB=" + nhaXB + "]";
	}

}
