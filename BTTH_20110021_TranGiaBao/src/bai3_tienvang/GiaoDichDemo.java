package bai3_tienvang;

import java.util.ArrayList;
import java.util.List;

public class GiaoDichDemo {
	
	public static void main(String[] args) {
		
		ArrayList<GiaoDich>danhSachGD = new ArrayList<>();
		
		//gd vang
		GiaoDichVang gdV1 = new GiaoDichVang("V01", "01/01/2021", 400000, 5, "24K");
		GiaoDichVang gdV2 = new GiaoDichVang("V02", "02/02/2022", 700000, 3, "18K");
		
		//gd tien te
		GiaoDichTienTe gdT1 = new GiaoDichTienTe("T01", "03/03/2023", 500, 2, 0.3, "USD");
		GiaoDichTienTe gdT2 = new GiaoDichTienTe("T02", "04/04/2024", 600, 8, 0.4, "EURO");
		GiaoDichTienTe gdT3 = new GiaoDichTienTe("T03", "05/05/2025", 100000, 8, 1, "VND");
		
		//add
		danhSachGD.add(gdV1);
		danhSachGD.add(gdV2);
		danhSachGD.add(gdT1);
		danhSachGD.add(gdT2);
		danhSachGD.add(gdT3);
		
		// Tính tổng số lượng cho từng loại giao dịch
	    int tongSoLuongGiaoDichVang = 0;
	    int tongSoLuongGiaoDichTienTe = 0;
	    for (GiaoDich giaoDich : danhSachGD) {
	        if (giaoDich instanceof GiaoDichVang) {
	            tongSoLuongGiaoDichVang += giaoDich.soLuong;
	        } else if (giaoDich instanceof GiaoDichTienTe) {
	            tongSoLuongGiaoDichTienTe += giaoDich.soLuong;
	        }
	    }
	    
	 // Tính trung bình thành tiền của giao dịch tiền tệ
	    double tongThanhTienGiaoDichTienTe = 0;
	    int soLuongGiaoDichTienTe = 0;
	    for (GiaoDich giaoDich : danhSachGD) {
	        if (giaoDich instanceof GiaoDichTienTe) {
	            tongThanhTienGiaoDichTienTe += giaoDich.thanhTien();
	            soLuongGiaoDichTienTe++;
	        }
	    }
	    
	    double trungBinhThanhTienGiaoDichTienTe = tongThanhTienGiaoDichTienTe / soLuongGiaoDichTienTe;
	    
	  //xuat tong so luong tung loai
	    System.out.println("Tong so luong gd vang: " + tongSoLuongGiaoDichVang);
	    System.out.println("Tong so luong gd tien te: " + tongSoLuongGiaoDichTienTe);
	    
	    //xuat trung binh cong sach tk
	    System.out.println("Trung binh thanh tien cua gd tien te: " + trungBinhThanhTienGiaoDichTienTe);
	    
	 // Xuất ra các giao dịch có đơn giá > 1 tỷ
	    System.out.println("Các giao dịch có đơn giá > 1 tỷ:");
	    for (GiaoDich giaoDich : danhSachGD) {
	        if (giaoDich.donGia > 1000000000) {
	            giaoDich.toString();
	            System.out.println("--------------------");
	        }
	    }
	}
}
