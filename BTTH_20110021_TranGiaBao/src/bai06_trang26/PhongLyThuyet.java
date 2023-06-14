package bai06_trang26;

public class PhongLyThuyet extends PhongHoc{
	private boolean coMayChieu;
	
	public PhongLyThuyet(String maPhong, eDayNha dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}
	
	public String phongDatChuan() {
		String ketQua = "Phòng không đạt chuẩn";
		
		if(getDienTich()/getSoBongDen() <= 10)
			if(coMayChieu) ketQua = "Phòng đạt chuẩn";
		
		return ketQua;
	}

	@Override
	public String toString() {
		return String.format("| %-20s | %-15s | %,15.1f | %15d | %-20s | %-30s |", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen()
				, coMayChieu ? "Có máy chiếu" : "Không có máy chiếu", phongDatChuan());
	}

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}	
}
