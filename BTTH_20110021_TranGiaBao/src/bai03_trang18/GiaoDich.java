package bai03_trang18;

import java.util.ArrayList;
import java.util.List;

public class GiaoDich {
    private String maGiaoDich;
    private String ngayGiaoDich;
    protected double donGia;
    protected int soLuong;
  
    public GiaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong) {
		super();
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setSoLuong(soLuong);
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public String getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(String ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public double tinhThanhTien() {
        return soLuong * donGia;
    }

	@Override
	public String toString() {
		return "GiaoDich [maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia
				+ ", soLuong=" + soLuong + ", tinhThanhTien()=" + tinhThanhTien() + "]";
	}
	
	
    
}
