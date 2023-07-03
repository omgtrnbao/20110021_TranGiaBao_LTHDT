package bai10_xe;

public class Xe {

	protected double giaTriXe;

	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Xe(double giaTriXe) {
		super();
		this.giaTriXe = giaTriXe;
	}
	
	public double tinhThue() {
        return 0; // Không đóng thuế mặc định
    }

	public double getGiaTriXe() {
		return giaTriXe;
	}
	public void setGiaTriXe(double giaTriXe) {
		this.giaTriXe = giaTriXe;
	}

	@Override
	public String toString() {
		return "Xe [giaTriXe=" + giaTriXe + "]";
	}
	
}
