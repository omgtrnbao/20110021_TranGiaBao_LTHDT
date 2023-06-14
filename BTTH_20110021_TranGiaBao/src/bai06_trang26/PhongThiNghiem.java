package bai06_trang26;

public class PhongThiNghiem extends PhongHoc{
	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRua;
	
	public PhongThiNghiem(String maPhong, eDayNha dayNha, double dienTich, int soBongDen, String chuyenNganh,
			int sucChua, boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}
	
	public String phongDatChuan() {
		String ketQua = "Phòng không đạt chuẩn";
		
		if(getDienTich()/getSoBongDen() <= 10)
			if(coBonRua) ketQua = "Phòng đạt chuẩn";
		
		return ketQua;
	}
	
	@Override
	public String toString() {
		return String.format("| %-20s | %-15s | %15.1f | %15d | %-20s | %15d | %-20s | %-30s |", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen(), chuyenNganh, sucChua
																							, coBonRua ? "Có bồn rửa" : "Không có bồn rửa", phongDatChuan());
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isCoBonRua() {
		return coBonRua;
	}
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}
}
