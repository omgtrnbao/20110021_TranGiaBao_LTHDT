package bai6_khachsan;

public class HoaDonTheoGio extends HoaDon {
    private int soGioThue;

    public HoaDonTheoGio(String maHoaDon, String ngayHoaDon, String tenKhachHang, String maPhong, double donGia, int soGioThue) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soGioThue = soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    @Override
    public double tinhThanhTien() {
        if (soGioThue > 30) {
            throw new IllegalArgumentException("Không được dùng hóa đơn theo giờ với số giờ thuê lớn hơn 30.");
        }
        int gioTinhTien = Math.min(soGioThue, 24);
        return gioTinhTien * donGia;
    }
}
