package bai6_khachsan;

public class HoaDonTheoNgay extends HoaDon {
    private int soNgayThue;

    public HoaDonTheoNgay(String maHoaDon, String ngayHoaDon, String tenKhachHang, String maPhong, double donGia, int soNgayThue) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }
    @Override
    public double tinhThanhTien() {
        if (soNgayThue > 7) {
            int soNgayGiamGia = soNgayThue - 7;
            double giaGiamGia = donGia * 0.2 * soNgayGiamGia;
            double tongTien = donGia * 7 - giaGiamGia;
            return tongTien;
        } else {
            return donGia * soNgayThue;
        }
    }
}
