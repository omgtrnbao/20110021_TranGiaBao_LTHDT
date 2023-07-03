package bai6_khachsan;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        DanhSachHoaDon danhSach = new DanhSachHoaDon(10);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Xuất danh sách hóa đơn");
            System.out.println("3. Thống kê số lượng hóa đơn theo giờ");
            System.out.println("4. Thống kê số lượng hóa đơn theo ngày");
            System.out.println("5. Tính tổng thành tiền theo tháng và năm");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự newline (\n)

            switch (choice) {
                case 1:
                    themHoaDon(scanner, danhSach);
                    break;
                case 2:
                    danhSach.xuat();
                    break;
                case 3:
                    int countTheoGio = danhSach.thongKeSoLuongHDTheoGio();
                    System.out.println("Số lượng hóa đơn theo giờ: " + countTheoGio);
                    break;
                case 4:
                    int countTheoNgay = danhSach.thongKeSoLuongHDTheoNgay();
                    System.out.println("Số lượng hóa đơn theo ngày: " + countTheoNgay);
                    break;
                case 5:
                    System.out.print("Nhập tháng: ");
                    int thang = scanner.nextInt();
                    System.out.print("Nhập năm: ");
                    int nam = scanner.nextInt();
                    double tongThanhTien = danhSach.tinhTongThanhTien(thang, nam);
                    System.out.println("Tổng thành tiền trong tháng " + thang + " năm " + nam + ": " + tongThanhTien);
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);
    }

    public static void themHoaDon(Scanner scanner, DanhSachHoaDon danhSach) {
        System.out.print("Nhập mã hóa đơn: ");
        String maHoaDon = scanner.nextLine();

        System.out.print("Nhập ngày hóa đơn (dd/mm/yyyy): ");
        String ngayHoaDon = scanner.nextLine();

        System.out.print("Nhập tên khách hàng: ");
        String tenKhachHang = scanner.nextLine();

        System.out.print("Nhập mã phòng: ");
        String maPhong = scanner.nextLine();

        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ ký tự newline (\n)

        System.out.println("Loại hóa đơn: ");
        System.out.println("1. Hóa đơn theo giờ");
        System.out.println("2. Hóa đơn theo ngày");
        System.out.print("Chọn loại hóa đơn: ");
        int loaiHoaDon = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự newline (\n)

        switch (loaiHoaDon) {
            case 1:
                System.out.print("Nhập số giờ thuê: ");
                int soGioThue = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ ký tự newline (\n)

                HoaDonTheoGio hoaDonTheoGio = new HoaDonTheoGio(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia, soGioThue);
                if (danhSach.them(hoaDonTheoGio)) {
                    System.out.println("Thêm hóa đơn theo giờ thành công.");
                } else {
                    System.out.println("Thêm hóa đơn theo giờ không thành công. Mã hóa đơn đã tồn tại.");
                }
                break;
            case 2:
                System.out.print("Nhập số ngày thuê: ");
                int soNgayThue = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ ký tự newline (\n)

                HoaDonTheoNgay hoaDonTheoNgay = new HoaDonTheoNgay(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia, soNgayThue);
                if (danhSach.them(hoaDonTheoNgay)) {
                    System.out.println("Thêm hóa đơn theo ngày thành công.");
                } else {
                    System.out.println("Thêm hóa đơn theo ngày không thành công. Mã hóa đơn đã tồn tại.");
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }
}

