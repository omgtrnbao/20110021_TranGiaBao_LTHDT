package bai5_tiendien;

public class KhachHang {
	
	protected String maKhachHang;
    protected String hoTen;
    protected String ngayLapHoaDon;
    
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public KhachHang(String maKhachHang, String hoTen, String ngayLapHoaDon) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.ngayLapHoaDon = ngayLapHoaDon;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(String ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}

	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", ngayLapHoaDon=" + ngayLapHoaDon + "]";
	}

}
