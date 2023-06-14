package bai03_trang5;

public class Triangle {

	private double canhA;
	private double canhB;
	private double canhC;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(double ma, double mb, double mc) {
		if (ma <= 0 || mb <= 0 || mc <= 0 || !isValidTriangle(ma, mb, mc)) {
			canhA = 0;
			canhB = 0;
			canhC = 0;
		}
		else {
			canhA = ma;
			canhB = mb;
			canhC = mc;
		}
	}

	public double getCanhA() {
		return canhA;
	}

	public void setCanhA(double canhA) {
		if (canhA > 0 && isValidTriangle(canhA, canhB, canhC)) {
			this.canhA = canhA;
		}
	}

	public double getCanhB() {
		return canhB;
	}

	public void setCanhB(double canhB) {
		if (canhB > 0 && isValidTriangle(canhA, canhB, canhC)) {
			this.canhB = canhB;
		}
	}

	public double getCanhC() {
		return canhC;
	}

	public void setCanhC(double canhC) {
		if (canhC > 0 && isValidTriangle(canhA, canhB, canhC)) {
			this.canhC = canhC;
		}
	}
	
	public double getPerimeter() {
		return canhA + canhB + canhC;
	}

	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - canhA) * (s - canhB) * (s - canhC));
	}
	
	public String getType() {
		if (canhA == canhB && canhB == canhC) {
			return "Deu";
		}
		else if (canhA == canhB || canhB == canhC || canhC == canhA) {
			return "Can";
		}
		else if (isValidTriangle(canhC, canhB, canhA)){
			return "Thuong";
		}
		else {
			return "Khong phai tam giac";
		}
	}
	
	private boolean isValidTriangle (double a, double b, double c) {
		return a + b > c && b + c > a && c + a > b;
	}

	@Override
	public String toString() {
		return "Canh a: " + canhA + 
				", Canh b: " + canhB + 
				", Canh c: " + canhC + 
				", Kieu tam giac: " + getType() +
				", Chu vi: " + getPerimeter() +
				", Dien tich: " + getArea();
	} 
	
}
