package bai07_trang9;

public class Hinhtron extends Toado {

	
	private Toado tam;
	private double banKinh;
	
	
	public Hinhtron() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hinhtron(String ten, float x, float y) {
		super(ten, x, y);
		// TODO Auto-generated constructor stub
	}
	
	
	public Hinhtron(Toado tam, double banKinh) {
		super();
		setTam(tam);
		setBanKinh(banKinh);
	}
	
	
	public Toado getTam() {
		return tam;
	}
	
	public void setTam(Toado tam) {
		this.tam = tam;
	}
	
	public double getBanKinh() {
		return banKinh;
	}
	
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public double tinhChuVi() {
		return 2 * 3.14 * banKinh;
	}
	
	public double tinhDienTich() {
		return 3.14 * banKinh * banKinh;
	}
	@Override
	public String toString() {
		return "Hinhtron [tam=" + tam + ", banKinh=" + banKinh + ", tinhChuVi()=" + tinhChuVi() + ", tinhDienTich()="
				+ tinhDienTich() + "]";
	}
	
	
	
}
