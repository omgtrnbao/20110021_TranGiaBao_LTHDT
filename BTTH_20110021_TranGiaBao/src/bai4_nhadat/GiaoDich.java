package bai4_nhadat;

public class GiaoDich {
	
	protected String maGD, ngayGD;
	protected double donGia;
	
	public GiaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GiaoDich(String maGD, String ngayGD, double donGia) {
		super();
		setMaGD(maGD);
		setNgayGD(ngayGD);
		setDonGia(donGia);
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
	
	@Override
	public String toString() {
		return "GiaoDich [maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + "]";
	}

}
