package bai4_nhadat;

import java.util.ArrayList;
import java.util.List;

public class GiaoDichDemo {

	public static void main(String[] args) {

		ArrayList<GiaoDich>danhSachGD = new ArrayList<>();

		// Tạo các giao dịch đất
		GiaoDichDat giaoDichDat1 = new GiaoDichDat("GD001", "01/09/2013", 5000000, "A", 100);
		GiaoDichDat giaoDichDat2 = new GiaoDichDat("GD002", "02/09/2013", 6000000, "B", 150);

		// Tạo các giao dịch nhà
		GiaoDichNha giaoDichNha1 = new GiaoDichNha("GD004", "01/09/2013", 2000000000, "cao cấp", "123 ABC Street", 150);
		GiaoDichNha giaoDichNha2 = new GiaoDichNha("GD005", "02/09/2013", 1500000000, "thường", "456 XYZ Street", 120);
		GiaoDichNha giaoDichNha3 = new GiaoDichNha("GD006", "03/09/2013", 1800000000, "cao cấp", "789 DEF Street", 200);

		// Thêm các giao dịch vào danh sách
		danhSachGD.add(giaoDichDat1);
		danhSachGD.add(giaoDichDat2);
		danhSachGD.add(giaoDichNha1);
		danhSachGD.add(giaoDichNha2);
		danhSachGD.add(giaoDichNha3);

		// Tính tổng số lượng cho từng loại
		int tongSoLuongGiaoDichDat = 0;
		int tongSoLuongGiaoDichNha = 0;

		for (GiaoDich giaoDich : danhSachGD) {
			if (giaoDich instanceof GiaoDichDat) {
				tongSoLuongGiaoDichDat++;
			} else if (giaoDich instanceof GiaoDichNha) {
				tongSoLuongGiaoDichNha++;
			}
		}
		
		//xuat tong so luong tung loai
	    System.out.println("Tong so luong gd dat: " + tongSoLuongGiaoDichDat);
	    System.out.println("Tong so luong gd nha: " + tongSoLuongGiaoDichNha);

		// Tính trung bình thành tiền của giao dịch đất
		double tongThanhTienGiaoDichDat = 0;
		int soLuongGiaoDichDat = 0;

		for (GiaoDich giaoDich : danhSachGD) {
			if (giaoDich instanceof GiaoDichDat) {
				tongThanhTienGiaoDichDat += ((GiaoDichDat) giaoDich).thanhTien();
				soLuongGiaoDichDat++;
			}
		}

		double trungBinhThanhTienGiaoDichDat = tongThanhTienGiaoDichDat / soLuongGiaoDichDat;
		
		System.out.println("Trung binh thanh tien cua gd dat: " + trungBinhThanhTienGiaoDichDat);

		// Xuất ra các giao dịch của tháng 9 năm 2013
		System.out.println("Các giao dịch của tháng 9 năm 2013:");
		for (GiaoDich giaoDich : danhSachGD) {
			if (giaoDich.ngayGD.contains("09/2013")) {
				if (giaoDich instanceof GiaoDichDat) {
					System.out.println("Giao dịch đất:");
					System.out.println("Mã giao dịch: " + giaoDich.maGD);
					System.out.println("Ngày giao dịch: " + giaoDich.ngayGD);
					System.out.println("Đơn giá: " + giaoDich.donGia);
					System.out.println("Loại đất: " + ((GiaoDichDat) giaoDich).loaiDat);
					System.out.println("Diện tích: " + ((GiaoDichDat) giaoDich).dienTich);
					System.out.println("Thành tiền: " + ((GiaoDichDat) giaoDich).thanhTien());
				} else if (giaoDich instanceof GiaoDichNha) {
					System.out.println("Giao dịch nhà:");
					System.out.println("Mã giao dịch: " + giaoDich.maGD);
					System.out.println("Ngày giao dịch: " + giaoDich.ngayGD);
					System.out.println("Đơn giá: " + giaoDich.donGia);
					System.out.println("Loại nhà: " + ((GiaoDichNha) giaoDich).loaiNha);
					System.out.println("Địa chỉ: " + ((GiaoDichNha) giaoDich).diaChi);
					System.out.println("Diện tích: " + ((GiaoDichNha) giaoDich).dienTich);
					System.out.println("Thành tiền: " + ((GiaoDichNha) giaoDich).thanhTien());
				}
				System.out.println("--------------------");
			}
		}
	}
}


