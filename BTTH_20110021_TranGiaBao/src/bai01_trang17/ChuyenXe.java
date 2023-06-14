package bai01_trang17;

public class ChuyenXe {
	private String maSo;
	private String hoTenTX;
	private String soXe;
	private double doanhThu;
	
	public ChuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChuyenXe(String maSo, String hoTenTX, String soXe, double doanhThu) throws Exception {
		super();
		setMaSo(maSo);
		this.hoTenTX = hoTenTX;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	@Override
	public String toString() {
		return "ChuyenXe [maSo=" + maSo + ", hoTenTX=" + hoTenTX + ", soXe=" + soXe + ", doanhThu=" + doanhThu + "]";
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) throws Exception  {
		if(maSo != null || maSo.trim().length() > 0) this.maSo = maSo;
		else System.out.println(new Exception("Ma so khong hop le"));
	}

	public String getHoTenTX() {
		return hoTenTX;
	}

	public void setHoTenTX(String hoTenTX) {
		this.hoTenTX = hoTenTX;
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
}
