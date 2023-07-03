package bai1_chuyenxe;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	
	private String noiDen;
	private int soNgay;
	
	public ChuyenXeNgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ChuyenXeNgoaiThanh(String maSo, String hoTen, String soXe, double doanhThu, String noiDen, int soNgay) throws Exception {
		super(maSo, hoTen, soXe, doanhThu);
		setNoiDen(noiDen);
		setSoNgay(soNgay);
	}

	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	@Override
	public String toString() {
		return "ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgay=" + soNgay + "]";
	}

}
