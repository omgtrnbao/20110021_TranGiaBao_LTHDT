package bai6_khachsan;

public class HoaDon {
	
	protected String maHoaDon;
    protected String ngayHoaDon;
    protected String tenKhachHang;
    protected String maPhong;
    protected double donGia;

    public HoaDon(String maHoaDon, String ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public double tinhThanhTien() {
        return 0; // Hàm này sẽ được ghi đè ở các lớp con
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HoaDon hoaDon = (HoaDon) obj;
        return maHoaDon.equals(hoaDon.maHoaDon);
    }

}
