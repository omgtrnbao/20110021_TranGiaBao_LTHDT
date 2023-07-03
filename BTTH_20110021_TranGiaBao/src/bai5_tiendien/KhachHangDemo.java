package bai5_tiendien;

import java.util.ArrayList;
import java.util.List;

public class KhachHangDemo {
	
	public static void main(String[] args) {
        // Tạo danh sách khách hàng
        List<KhachHang> danhSachKhachHang = new ArrayList<>();

        // Tạo khách hàng Việt Nam
        KhachHangVN khachHangVN1 = new KhachHangVN("KH001", "Nguyen Van A", "10/09/2018", "sinh hoạt", 120, 2000, 100);
        KhachHangVN khachHangVN2 = new KhachHangVN("KH002", "Tran Thi B", "15/09/2018", "kinh doanh", 250, 2000, 200);
        KhachHangVN khachHangVN3 = new KhachHangVN("KH003", "Pham Van C", "20/09/2018", "sản xuất", 400, 2000, 300);

        // Tạo khách hàng nước ngoài
        KhachHangNuocNgoai khachHangNN1 = new KhachHangNuocNgoai("KH004", "John Smith", "10/09/2018",
                "USA", 150, 2500);
        KhachHangNuocNgoai khachHangNN2 = new KhachHangNuocNgoai("KH005", "Maria Garcia", "15/09/2018",
                "Spain", 180, 2500);
        KhachHangNuocNgoai khachHangNN3 = new KhachHangNuocNgoai("KH006", "Luca Rossi", "20/09/2018",
                "Italy", 200, 2500);

        // Thêm khách hàng vào danh sách
        danhSachKhachHang.add(khachHangVN1);
        danhSachKhachHang.add(khachHangVN2);
        danhSachKhachHang.add(khachHangVN3);
        danhSachKhachHang.add(khachHangNN1);
        danhSachKhachHang.add(khachHangNN2);
        danhSachKhachHang.add(khachHangNN3);

        // Tính tổng số lượng cho từng loại khách hàng
        int soLuongKhachHangVN = 0;
        int soLuongKhachHangNN = 0;

        for (KhachHang khachHang : danhSachKhachHang) {
            if (khachHang instanceof KhachHangVN) {
                soLuongKhachHangVN++;
            } else if (khachHang instanceof KhachHangNuocNgoai) {
                soLuongKhachHangNN++;
            }
        }

        System.out.println("Tổng số lượng khách hàng Việt Nam: " + soLuongKhachHangVN);
        System.out.println("Tổng số lượng khách hàng nước ngoài: " + soLuongKhachHangNN);

        // Tính trung bình thành tiền của khách hàng người nước ngoài
        double tongThanhTienNN = 0;
        int soLuongKhachHangNNCoHoaDon = 0;

        for (KhachHang khachHang : danhSachKhachHang) {
            if (khachHang instanceof KhachHangNuocNgoai) {
                KhachHangNuocNgoai khachHangNN = (KhachHangNuocNgoai) khachHang;
                tongThanhTienNN += khachHangNN.tinhThanhTien();
                soLuongKhachHangNNCoHoaDon++;
            }
        }

        double trungBinhThanhTienNN = tongThanhTienNN / soLuongKhachHangNNCoHoaDon;
        System.out.println("Trung bình thành tiền của khách hàng nước ngoài: " + trungBinhThanhTienNN);

        // Xuất ra các hoá đơn trong tháng 09 năm 2018
        System.out.println("Các hoá đơn trong tháng 09 năm 2018:");
        for (KhachHang khachHang : danhSachKhachHang) {
            String[] ngayLapHoaDon = khachHang.getNgayLapHoaDon().split("/");
            if (ngayLapHoaDon[1].equals("09") && ngayLapHoaDon[2].equals("2018")) {
                System.out.println("Mã khách hàng: " + khachHang.getMaKhachHang());
                System.out.println("Họ tên: " + khachHang.getHoTen());
                System.out.println("Ngày lập hoá đơn: " + khachHang.getNgayLapHoaDon());
                System.out.println();
            }
        }
    }
}


