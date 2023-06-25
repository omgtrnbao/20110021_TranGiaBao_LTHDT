package bai08_trang9;

public class CD {
	
	private int maCD, soBH;
	private String tuaCD;
	private double gia;
	
	
	public CD() {
		this.maCD = 999999;
		this.soBH = 0;
		this.tuaCD = "Chua xac dinh";
		this.gia = 0;
		// TODO Auto-generated constructor stub
	}
	
	
	public CD(int maCD, int soBH, String tuaCD, double gia) {
		super();
		setMaCD(maCD);
		setSoBH(soBH);
		setTuaCD(tuaCD);
		setGia(gia);
	}

	
	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if (maCD < 0)
			this.maCD = 0;
		else 
			this.maCD = maCD;
	}

	public int getSoBH() {
		return soBH;
	}

	public void setSoBH(int soBH) {
		if (soBH < 0)
			this.soBH = 0;
		else
			this.soBH = soBH;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		if (tuaCD.equals(""))
			this.tuaCD = "Khong duoc de rong";
		else
			this.tuaCD = tuaCD;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		if (gia < 0)
			this.gia = 0;
		else
			this.gia = gia;
	}


	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", soBH=" + soBH + ", tuaCD=" + tuaCD + ", gia=" + gia + "]";
	}


}
