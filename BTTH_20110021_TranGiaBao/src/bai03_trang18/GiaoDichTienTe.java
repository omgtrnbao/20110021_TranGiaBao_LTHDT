package bai03_trang18;

public class GiaoDichTienTe extends GiaoDich {
	
	private double tiGia;
    private String loaiTienTe;

    public GiaoDichTienTe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichTienTe(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, double tiGia, String loaiTienTe) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		// TODO Auto-generated constructor stub
	}

	public GiaoDichTienTe(double tiGia, String loaiTienTe) {
		super();
		setTiGia(tiGia);
		setLoaiTienTe(loaiTienTe);
	}
	

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}

	public String getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(String loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}

	@Override
    public double tinhThanhTien() {
        if (loaiTienTe.equals("USD") || loaiTienTe.equals("Euro")) {
            return soLuong * donGia * tiGia;
        } else if (loaiTienTe.equals("VND")) {
            return super.tinhThanhTien();
        } else {
            return 0;
        }
    }

	@Override
	public String toString() {
		return "GiaoDichTienTe [tiGia=" + tiGia + ", loaiTienTe=" + loaiTienTe + ", tinhThanhTien()=" + tinhThanhTien()
				+ "]";
	}

    

}
