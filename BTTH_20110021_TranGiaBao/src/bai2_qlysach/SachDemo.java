package bai2_qlysach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SachDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Sach>danhSachSach = new ArrayList<>();
		
		//sgk
		SachGK sachGK1 = new SachGK("GK01", "1/1/2021", 17000, 5, "GK1", "Moi");
		SachGK sachGK2 = new SachGK("GK02", "2/2/2022", 50000, 7, "GK2", "Cu");
		
		//stk
		SachTK sachTK1 = new SachTK("TK01", "3/3/2023", 90000, 1, "TK1", 0.2);
		SachTK sachTK2 = new SachTK("TK02", "4/4/2024", 40000, 8, "TK2", 0.1);
		
		//add
		danhSachSach.add(sachGK1);
		danhSachSach.add(sachGK2);
		danhSachSach.add(sachTK1);
		danhSachSach.add(sachTK2);
		
		//tong thanh tien tung loai
		double thanhTienSachGK = 0;
		double thanhTienSachTK = 0;
		for (Sach sach : danhSachSach) {
			if (sach instanceof SachGK) {
				thanhTienSachGK += sach.thanhTien();
			}
			else if (sach instanceof SachTK) {
				thanhTienSachTK += sach.thanhTien();
			}
		}
		
		//trung binh cong sach tk
		double tongDonGiaSachTK = 0;
	    int soLuongSachTK = 0;
	    for (Sach sach : danhSachSach) {
	        if (sach instanceof SachTK) {
	            tongDonGiaSachTK += sach.donGia;
	            soLuongSachTK++;
	        }
	    }
	    double trungBinhCongDonGiaSachTK = tongDonGiaSachTK / soLuongSachTK;
	    
	    //xuat tong thanh tien cho tung loai sach
	    System.out.println("Tổng thành tiền sách giáo khoa: " + thanhTienSachGK);
	    System.out.println("Tổng thành tiền sách tham khảo: " + thanhTienSachTK);
	    
	    //xuat trung binh cong sach tk
	    System.out.println("Trung bình cộng đơn giá sách tham khảo: " + trungBinhCongDonGiaSachTK);
	    
	    
	}
}


