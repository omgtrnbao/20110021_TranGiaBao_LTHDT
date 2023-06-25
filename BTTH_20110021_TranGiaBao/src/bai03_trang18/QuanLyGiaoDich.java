package bai03_trang18;

import java.util.ArrayList;
import java.util.List;

public class QuanLyGiaoDich {
	
	public static void main(String[] args) {
        // Tạo danh sách các giao dịch
        List<GiaoDich> danhSachGiaoDich = new ArrayList<>();

        // Tạo sẵn 3 giao dịch vàng
        danhSachGiaoDich.add(new GiaoDichVang("GD001", "2023-06-01", 200000, 10, "24K"));
        
        // Thêm 3 giao dịch tiền tệ vào danh sách
        danhSachGiaoDich.add(new GiaoDichTienTe("GD002", "2023-06-02", 300000, 5, 23000, "USD"));
        danhSachGiaoDich.add(new GiaoDichTienTe("GD003", "2023-06-03", 150000, 8, 27000, "Euro"));
        danhSachGiaoDich.add(new GiaoDichTienTe("GD004", "2023-06-04", 100000, 12, 1, "VND"));

        // Tính tổng số lượng cho từng loại giao dịch
        int tongSoLuongVang = 0;
        int tongSoLuongTienTe = 0;

        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichVang) {
                tongSoLuongVang += giaoDich.getSoLuong();
            } else if (giaoDich instanceof GiaoDichTienTe) {
                tongSoLuongTienTe += giaoDich.getSoLuong();
            }
        }

        System.out.println("Tổng số lượng giao dịch vàng: " + tongSoLuongVang);
        System.out.println("Tổng số lượng giao dịch tiền tệ: " + tongSoLuongTienTe);

        // Tính trung bình thành tiền của giao dịch tiền tệ
        double tongThanhTienTienTe = 0;
        int soLuongTienTe = 0;

        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichTienTe) {
                tongThanhTienTienTe += giaoDich.tinhThanhTien();
                soLuongTienTe++;
            }
        }

        double trungBinhThanhTienTienTe = tongThanhTienTienTe / soLuongTienTe;
        System.out.println("Trung bình thành tiền giao dịch tiền tệ: " + trungBinhThanhTienTienTe);

        // Xuất ra các giao dịch có đơn giá > 1 tỷ
        System.out.println("Các giao dịch có đơn giá > 1 tỷ:");

        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.getDonGia() > 1000000000) {
                System.out.println("Mã giao dịch: " + giaoDich.getMaGiaoDich());
                System.out.println("Ngày giao dịch: " + giaoDich.getNgayGiaoDich());
                System.out.println("Đơn giá: " + giaoDich.getDonGia());
                System.out.println("--------------------------");
            }
        }
    }
}



