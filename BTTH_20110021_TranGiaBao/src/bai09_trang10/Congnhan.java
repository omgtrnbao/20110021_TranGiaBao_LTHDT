package bai09_trang10;

public class Congnhan {
	
	private int maCN, mSoSP;
	private String mHo, mTen;
	
	
	public Congnhan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Congnhan(int maCN, int mSoSP, String mHo, String mTen) {
		super();
		setMaCN(maCN);
		setmSoSP(mSoSP);
		setmHo(mHo);
		setmTen(mTen);
	}

	
	public int getMaCN() {
		return maCN;
	}

	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		if (mSoSP < 0)
			this.mSoSP = 0;
		else
			this.mSoSP = mSoSP;
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		this.mHo = mHo;
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	
	
	public double tinhLuong() {
		double donGia;
		if (mSoSP >= 600)
			donGia = 0.65;
		else if (mSoSP >= 400)
			donGia = 0.6;
		else if (mSoSP >= 200)
			donGia = 0.55;
		else
			donGia = 0.5;
		return mSoSP * donGia;
	}


	@Override
	public String toString() {
		return "Congnhan [maCN=" + maCN + ", mSoSP=" + mSoSP + ", mHo=" + mHo + ", mTen=" + mTen + "]";
	}
	
	
	
}
