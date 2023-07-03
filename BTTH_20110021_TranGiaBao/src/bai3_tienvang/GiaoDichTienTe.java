package bai3_tienvang;

public class GiaoDichTienTe extends GiaoDich {
	
	private double tiGia;
	private String loaiTien;
	
	public GiaoDichTienTe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GiaoDichTienTe(String maGD, String ngayGD, double donGia, int soLuong, double tiGia, String loaiTien) {
		super(maGD, ngayGD, donGia, soLuong);
		setTiGia(tiGia);
		setLoaiTien(loaiTien);
	}
	
	public double thanhTien() {
		if (loaiTien.equals("USD") || loaiTien.equals("EURO"))
			return soLuong * donGia * tiGia;
		else if (loaiTien.equals("VND"))
			return soLuong * donGia;
		return 0;
	}
	
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public String getLoaiTien() {
		return loaiTien;
	}
	public void setLoaiTien(String loaiTien) {
		this.loaiTien = loaiTien;
	}

	@Override
	public String toString() {
		return "GiaoDichTienTe [tiGia=" + tiGia + ", loaiTien=" + loaiTien + "]";
	}
	
}
