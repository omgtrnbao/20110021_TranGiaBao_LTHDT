package bai01_trang17;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private int soKM;
	
	public ChuyenXeNoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChuyenXeNoiThanh(String maSo, String hoTenTX, String soXe, double doanhThu, int soTuyen, int soKM)
			throws Exception {
		super(maSo, hoTenTX, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}

	@Override
	public String toString() {
		return super.toString() + " ChuyenXeNoiThanh [soTuyen=" + soTuyen + ", soKM=" + soKM + "]";
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKM() {
		return soKM;
	}

	public void setSoKM(int soKM) {
		this.soKM = soKM;
	}
}
