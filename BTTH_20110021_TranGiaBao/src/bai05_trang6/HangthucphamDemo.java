package bai05_trang6;

import java.time.LocalDate;

public class HangthucphamDemo {
	
	
	public static void main(String[] args) {
		
		Hangthucpham hangThucpham = new Hangthucpham();
		hangThucpham.setTenHang("Tabasco");
		hangThucpham.setGia(62000);
		hangThucpham.setNgaySX(LocalDate.of(2023, 3, 15));
		hangThucpham.setNgayHH(LocalDate.of(2023, 5, 22));
		System.out.println(hangThucpham.checkDate());
		System.out.println("");
	}

}
