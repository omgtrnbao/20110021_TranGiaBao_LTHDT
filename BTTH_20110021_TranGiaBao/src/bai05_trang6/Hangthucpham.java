package bai05_trang6;
import java.time.LocalDate;
import java.util.Random;

public class Hangthucpham {
	
	
	private int maHang;
	private String tenHang;
	private double gia;
	private LocalDate ngaySX;
	private LocalDate ngayHH;
	
	
	public Hangthucpham() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Hangthucpham(int maHang, String tenHang, double gia, LocalDate ngaySX, LocalDate ngayHH) {
		super();
		setMaHang();
		setTenHang(tenHang);
		setGia(gia);
		setNgaySX(ngaySX);
		setNgayHH(ngayHH);
	}
	
	
	private void setMaHang() {
		maHang = new Random().nextInt();
	}

	
	public int getMaHang() {
		return maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (tenHang.equals(""))
			this.tenHang = "xxx";
		else 
			this.tenHang = tenHang;
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

	public LocalDate getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(LocalDate ngaySX) {
		if (ngaySX.isAfter(LocalDate.now()))
			this.ngaySX = LocalDate.now();
		else 
			this.ngaySX = ngaySX;
	}

	public LocalDate getNgayHH() {
		return ngayHH;
	}

	public void setNgayHH(LocalDate ngayHH) {
		if (ngayHH.isBefore(getNgaySX()))
			this.ngayHH = ngaySX;
		else
			this.ngayHH = ngayHH;
	}
	
	
	public String checkDate() {
		String result = "Chua het han";
		if (getNgayHH().isBefore(LocalDate.now()))
			result = "Het han";
		return result;
	}


	@Override
	public String toString() {
		return "Hangthucpham [maHang=" + maHang + ", tenHang=" + tenHang + ", gia=" + gia + ", ngaySX=" + ngaySX
				+ ", ngayHH=" + ngayHH + "]";
	}

	
}
