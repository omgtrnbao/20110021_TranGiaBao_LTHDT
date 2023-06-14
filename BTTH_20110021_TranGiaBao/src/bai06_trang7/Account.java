package bai06_trang7;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long soTK;
	private String tenTK;
	private double soTien;
	private String trangThai = "";
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
		this.soTK = 999999;
		this.tenTK = "Chưa xác định";
		this.soTien = 50;
	}

	public Account(long soTK, String tenTK, double soTien) {
		super();
		setSoTK(soTK);
		setTenTK(tenTK);
		setSoTien(soTien);
	}
	
	public String napTien(double soTienCanNap) {
		if(soTienCanNap > 0) {
			soTien += soTienCanNap;
			return "Giao dịch nạp tiền thành công!";
		}
		else return "Giao dịch nạp tiền thất bại!";
	}
	
	public String rutTien(double soTienCanRut) {
		if(soTienCanRut > 0 && soTienCanRut < soTien) {
			soTien -= soTienCanRut;
			return "Giao dịch rút tiền thành công!";
		}
		else return "Giao dịch rút tiền thất bại!";
	}
	
	public String chuyenTien(double soTienCanChuyen, Account tkNhan) {
		if(tkNhan != null) {
			if(rutTien(soTienCanChuyen) == "Giao dịch rút tiền thành công!") {
				tkNhan.napTien(soTienCanChuyen);
				return "Giao dịch chuyển tiền thành công!";
			}
			
			return "Giao dịch chuyển tiền thất bại!";
		}
		
		return "Giao dịch chuyển tiền thất bại!";
	}
	
	@Override
	public String toString() {
		Locale local= new Locale("vi", "vn");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
		
		//System.out.println(formatter(45645.121f));
		
		return String.format("| %-15d | %-20s | %,20.0f | %-50s |", soTK, tenTK, soTien, trangThai);
	}

	public long getSoTK() {
		return soTK;
	}

	public void setSoTK(long soTK) {
		if(soTK > 0 && soTK != 9999) {
			this.soTK = soTK;
		}
		else {
			this.soTK = 999999;
			trangThai += "Số tài khoản không hợp lệ, ";
		}
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		if(tenTK != null && tenTK != "") {
			this.tenTK = tenTK;
		}
		else {
			this.tenTK = "Chưa xác định";
			trangThai += "Tên tài khoản không hợp lệ, ";
		}
	}

	public double getSoTien() {
		return soTien;
	}

	public void setSoTien(double soTien) {
		if(soTien >= 50) {
			this.soTien = soTien;
		}
		else {
			this.soTien = 50;
			trangThai += "Số tiền không hợp lệ, ";
		}
	}

	public String getTrangThai() {
		return trangThai;
	}
}
