package bai3_tienvang;

public class GiaoDichVang extends GiaoDich {
	
	private String loaiVang;

	public GiaoDichVang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichVang(String maGD, String ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		setLoaiVang(loaiVang);
	}

	public String getLoaiVang() {
		return loaiVang;
	}
	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	@Override
	public String toString() {
		return "GiaoDichVang [loaiVang=" + loaiVang + "]";
	}
	
}
