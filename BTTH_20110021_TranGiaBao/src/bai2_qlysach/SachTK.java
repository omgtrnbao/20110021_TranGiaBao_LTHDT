package bai2_qlysach;

public class SachTK extends Sach {
	
	private double thue;

	public SachTK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachTK(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXB, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		setThue(thue);
	}
	
	public double thanhTien() {
		return soLuong * donGia * thue;
	}

	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}

	@Override
	public String toString() {
		return "SachTK [thue=" + thue + "]";
	}
	
}
