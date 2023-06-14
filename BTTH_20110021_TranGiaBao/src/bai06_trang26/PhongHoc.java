package bai06_trang26;

public abstract class PhongHoc {
	public enum eDayNha {A, B, E, V, X, D, C, H, F};
	private String maPhong;
	private eDayNha dayNha;
	private double dienTich;
	private int soBongDen;
	
	public abstract String phongDatChuan();
	
	public PhongHoc(String maPhong, eDayNha dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public eDayNha getDayNha() {
		return dayNha;
	}

	public void setDayNha(eDayNha dayNha) {
		this.dayNha = dayNha;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
}
