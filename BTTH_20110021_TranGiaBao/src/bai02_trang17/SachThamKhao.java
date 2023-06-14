package bai02_trang17;

import java.time.LocalDate;

import bai02_trang17.SachGiaoKhoa.eTinhTrang;

public class SachThamKhao extends Sach{
	private float thue;
	
	public SachThamKhao(String maSach, LocalDate ngayNhap, float donGia, int soLuong, String nXB, float thue) {
		super(maSach, ngayNhap, donGia, soLuong, nXB);
		this.thue = thue;
	}
	
	public float tinhThanhTien() {
		float thanhTien = 0f;
		
		thanhTien = getSoLuong() * getDonGia() + thue;
		
		return thanhTien;
	}

	@Override
	public String toString() {
		return String.format("| %-15s | %-15s | %,15.2f | %,15d | %-30s | %,20.2f | %,20.2f |", getMaSach(), formatDDMMYYYY(getNgayNhap()), getDonGia(), getSoLuong(), getnXB()
				, thue, tinhThanhTien()); 
	}
	
	public float getThue() {
		return thue;
	}

	public void setThue(float thue) {
		this.thue = thue;
	}
}
