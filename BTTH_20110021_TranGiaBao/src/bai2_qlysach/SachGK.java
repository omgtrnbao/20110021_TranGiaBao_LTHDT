package bai2_qlysach;

public class SachGK extends Sach {
	
	private String tinhTrang;

	public SachGK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachGK(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXB, String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		setTinhTrang(tinhTrang);
	}
	
	public double thanhTien() {
		if (tinhTrang.equals("Moi"))
			return soLuong * donGia;
		else if (tinhTrang.equals("Cu"))
			return soLuong * donGia * 0.5;
		return 0;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public String toString() {
		return "SachGK [tinhTrang=" + tinhTrang + "]";
	}

}
