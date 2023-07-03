package bai3_tienvang;

public class GiaoDich {
	
	private String maGD, ngayGD;
	protected double donGia;
	protected int soLuong;
	
	public GiaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GiaoDich(String maGD, String ngayGD, double donGia, int soLuong) {
		super();
		setMaGD(maGD);
		setNgayGD(ngayGD);
		setDonGia(donGia);
		setSoLuong(soLuong);
	}
	
	public double thanhTien() {
		return soLuong * donGia;
	}
	
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	public String getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(String ngayGD) {
		this.ngayGD = ngayGD;
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
	@Override
	public String toString() {
		return "Giaodich [maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + ", soLuong=" + soLuong + "]";
	}

}
