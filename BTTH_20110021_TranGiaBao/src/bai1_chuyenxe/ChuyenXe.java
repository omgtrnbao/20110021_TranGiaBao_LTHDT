package bai1_chuyenxe;

public class ChuyenXe {
	
	private String maSo, hoTen, soXe;
	private double doanhThu;
	
	public ChuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}       
	
	public ChuyenXe(String maSo, String hoTen, String soXe, double doanhThu) throws Exception {
		super();
		setMaSo(maSo);
		setHoTen(hoTen);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}
	 
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	@Override
	public String toString() {
		return "ChuyenXe [maSo=" + maSo + ", hoTen=" + hoTen + ", soXe=" + soXe + ", doanhThu=" + doanhThu + "]";
	}
	
}
