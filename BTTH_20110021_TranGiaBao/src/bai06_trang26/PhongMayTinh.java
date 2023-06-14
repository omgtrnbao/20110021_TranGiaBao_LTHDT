package bai06_trang26;

public class PhongMayTinh extends PhongHoc{
	private int soLuongMayTinh;
		
	public PhongMayTinh(String maPhong, eDayNha dayNha, double dienTich, int soBongDen, int soLuongMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soLuongMayTinh = soLuongMayTinh;
	}
	
	public String phongDatChuan() {
		String ketQua = "Phòng không đạt chuẩn";
		
		if(getDienTich()/getSoBongDen() <= 10)
			if(getDienTich()/soLuongMayTinh >= 1.5f) ketQua = "Phòng đạt chuẩn";
		
		return ketQua;
	}

	@Override
	public String toString() {
		return String.format("| %-20s | %-15s | %15.1f | %15d | %-20d | %-30s |", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen(), soLuongMayTinh, phongDatChuan());
	}
	
	public int getSoLuongMayTinh() {
		return soLuongMayTinh;
	}

	public void setSoLuongMayTinh(int soLuongMayTinh) {
		this.soLuongMayTinh = soLuongMayTinh;
	}
}
