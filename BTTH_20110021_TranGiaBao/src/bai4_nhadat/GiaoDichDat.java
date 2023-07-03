package bai4_nhadat;

public class GiaoDichDat extends GiaoDich {
	
	protected String loaiDat;
	protected double dienTich;
	
	public GiaoDichDat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiaoDichDat(String maGD, String ngayGD, double donGia, String loaiDat, double dienTich) {
		super(maGD, ngayGD, donGia);
		setLoaiDat(loaiDat);
		setDienTich(dienTich);
	}
	
	public double thanhTien() {
		if (loaiDat.equals("A"))
			return dienTich * donGia * 1.5;
		else
			return dienTich * donGia;
	}
	
	public String getLoaiDat() {
		return loaiDat;
	}
	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	
	@Override
	public String toString() {
		return "GiaoDichDat [loaiDat=" + loaiDat + ", dienTich=" + dienTich + "]";
	}

}
