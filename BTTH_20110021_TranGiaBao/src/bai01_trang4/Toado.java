package bai01_trang4;

public class Toado {
	
	private int x;
	private int y;
	
	public Toado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Toado(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("%5d| %5d|", x, y);
	}

	
}




