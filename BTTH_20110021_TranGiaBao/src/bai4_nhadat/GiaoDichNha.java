package bai4_nhadat;

public class GiaoDichNha extends GiaoDich {
	
	protected String loaiNha, diaChi;
	protected double dienTich;
	
	public GiaoDichNha() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GiaoDichNha(String maGD, String ngayGD, double donGia, String loaiNha, String diaChi, double dienTich) {
		super(maGD, ngayGD, donGia);
		setLoaiNha(loaiNha);
		setDiaChi(diaChi);
		setDienTich(dienTich);
	}
	
	public double thanhTien() {
		if (loaiNha.equals("Cao cap"))
			return dienTich * donGia;
		else 
			return dienTich * donGia * 0.9;
	}
	
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	
	@Override
	public String toString() {
		return "GiaoDichNha [loaiNha=" + loaiNha + ", diaChi=" + diaChi + ", dienTich=" + dienTich + "]";
	}

}
