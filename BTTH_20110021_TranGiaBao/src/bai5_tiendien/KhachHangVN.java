package bai5_tiendien;

public class KhachHangVN extends KhachHang {
	
	private String doiTuongKhachHang;
    private int soKWTieuThu;
    private double donGia;
    private int dinhMuc;
    
	public KhachHangVN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHangVN(String maKhachHang, String hoTen, String ngayLapHoaDon, 
			String doiTuongKhachHang, int soKWTieuThu, double donGia, int dinhMuc) {
		super(maKhachHang, hoTen, ngayLapHoaDon);
		setDoiTuongKhachHang(doiTuongKhachHang);
		setSoKWTieuThu(soKWTieuThu);
		setDonGia(donGia);
		setDinhMuc(dinhMuc);
	}
	
	public double tinhThanhTien() {
        double thanhTien;
        if (soKWTieuThu <= dinhMuc) {
            thanhTien = soKWTieuThu * donGia;
        } else {
            thanhTien = soKWTieuThu * donGia * dinhMuc + (soKWTieuThu - dinhMuc) * donGia * 2.5;
        }
        return thanhTien;
    }
	
	public String getDoiTuongKhachHang() {
		return doiTuongKhachHang;
	}
	public void setDoiTuongKhachHang(String doiTuongKhachHang) {
		this.doiTuongKhachHang = doiTuongKhachHang;
	}
	public int getSoKWTieuThu() {
		return soKWTieuThu;
	}
	public void setSoKWTieuThu(int soKWTieuThu) {
		this.soKWTieuThu = soKWTieuThu;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	
	@Override
	public String toString() {
		return "KhachHangVN [doiTuongKhachHang=" + doiTuongKhachHang + ", soKWTieuThu=" + soKWTieuThu + ", donGia="
				+ donGia + ", dinhMuc=" + dinhMuc + "]";
	}

}
