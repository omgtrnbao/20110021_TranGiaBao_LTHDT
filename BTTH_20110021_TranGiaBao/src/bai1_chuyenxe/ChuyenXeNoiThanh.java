package bai1_chuyenxe;

public class ChuyenXeNoiThanh extends ChuyenXe {
	
	private int soTuyen, soKM;

	public ChuyenXeNoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChuyenXeNoiThanh(String maSo, String hoTen, String soXe, double doanhThu, int soTuyen, int soKM) throws Exception {
		super(maSo, hoTen, soXe, doanhThu);
		setSoTuyen(soTuyen);
		setSoKM(soKM);
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

	@Override
	public String toString() {
		return "ChuyenXeNoiThanh [soTuyen=" + soTuyen + ", soKM=" + soKM + "]";
	}
	
}
