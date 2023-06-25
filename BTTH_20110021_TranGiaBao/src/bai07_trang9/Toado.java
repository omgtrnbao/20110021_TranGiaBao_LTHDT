package bai07_trang9;

public class Toado {
	
	
	private String ten;
	private float x, y;
	
	
	public Toado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Toado(String ten, float x, float y) {
		super();
		setTen(ten);
		setX(x);
		setY(y);
	}


	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Toado [ten=" + ten + ", x=" + x + ", y=" + y + "]";
	}
	
}
