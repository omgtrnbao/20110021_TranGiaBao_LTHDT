package bai6_khachsan;

public class DanhSachHoaDon {
	private HoaDon[] danhSach;
    private int count;

    public DanhSachHoaDon(int n) {
        danhSach = new HoaDon[n];
        count = 0;
    }

    public boolean them(HoaDon hd) {
        if (count >= danhSach.length) {
            return false; // Không còn chỗ trống trong danh sách
        }
        for (int i = 0; i < count; i++) {
            if (danhSach[i].equals(hd)) {
                return false; // Hóa đơn đã tồn tại trong danh sách
            }
        }
        danhSach[count] = hd;
        count++;
        return true; // Thêm thành công
    }

    public void xuat() {
        System.out.println("DANH SACH HOA DON");
        System.out.println("------------------");
        System.out.printf("%-15s %-12s %-15s %-10s %-10s\n", "Mã HĐ", "Ngày HĐ", "Tên KH", "Mã Phòng", "Thành tiền");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < count; i++) {
            HoaDon hd = danhSach[i];
            double thanhTien = hd.tinhThanhTien();
            System.out.printf("%-15s %-12s %-15s %-10s %-10.2f\n",
                    hd.getMaHoaDon(), hd.getNgayHoaDon(), hd.getTenKhachHang(), hd.getMaPhong(), thanhTien);
        }
        System.out.println("--------------------------------------------");
    }

    public int thongKeSoLuongHDTheoGio() {
        int countTheoGio = 0;
        for (int i = 0; i < count; i++) {
            if (danhSach[i] instanceof HoaDonTheoGio) {
                countTheoGio++;
            }
        }
        return countTheoGio;
    }

    public int thongKeSoLuongHDTheoNgay() {
        int countTheoNgay = 0;
        for (int i = 0; i < count; i++) {
            if (danhSach[i] instanceof HoaDonTheoNgay) {
                countTheoNgay++;
            }
        }
        return countTheoNgay;
    }

    public double tinhTongThanhTien(int thang, int nam) {
        double tongThanhTien = 0;
        for (int i = 0; i < count; i++) {
        	HoaDon hd = danhSach[i];
            String ngayHoaDon = hd.getNgayHoaDon();
            int thangHoaDon = Integer.parseInt(ngayHoaDon.substring(3, 5));
            int namHoaDon = Integer.parseInt(ngayHoaDon.substring(6, 10));

            if (thangHoaDon == thang && namHoaDon == nam) {
                double thanhTien = hd.tinhThanhTien();
                tongThanhTien += thanhTien;
            }
        }
        return tongThanhTien;
    }
}

