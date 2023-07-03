package bai5_tiendien;

public class KhachHangNuocNgoai extends KhachHang {
	
	private String quocTich;
    private int soKWTieuThu;
    private double donGia;
    
	public KhachHangNuocNgoai() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayLapHoaDon,
			String quocTich, int soKWTieuThu, double donGia) {
		super(maKhachHang, hoTen, ngayLapHoaDon);
		setQuocTich(quocTich);
		setSoKWTieuThu(soKWTieuThu);
		setDonGia(donGia);
	}
	
	public double tinhThanhTien() {
        return soKWTieuThu * donGia;
    }

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public int getSoKWTieuThu() {
		return soKWTieuThu;
	}

	public void setSoKWTieuThu(int soKWTieuThu) {
		this.soKWTieuThu = soKWTieuThu;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		return "KhachHangNN [quocTich=" + quocTich + ", soKWTieuThu=" + soKWTieuThu + ", donGia=" + donGia + "]";
	}
	
    

}
