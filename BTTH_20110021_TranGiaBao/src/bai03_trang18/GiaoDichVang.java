package bai03_trang18;

public class GiaoDichVang extends GiaoDich {
	
	private String loaiVang;

	public GiaoDichVang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichVang(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		// TODO Auto-generated constructor stub
	}
	
	

	public GiaoDichVang(String loaiVang) {
		super();
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
