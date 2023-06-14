package bai02_trang17;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	public enum eTinhTrang {Moi, Cu};
	private eTinhTrang tinhTrang;
	
	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, float donGia, int soLuong, String nXB,
			eTinhTrang tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nXB);
		this.tinhTrang = tinhTrang;
	}
	
	public float tinhThanhTien() {
		float thanhTien = 0f;
		if(tinhTrang == eTinhTrang.Moi) thanhTien = getSoLuong() * getDonGia();
		else thanhTien = getSoLuong() * getDonGia() * 0.5f;
		
		return thanhTien;
	}
	
	@Override
	public String toString() {		
		return String.format("| %-15s | %-15s | %,15.2f | %,15d | %-30s | %-20s | %,20.2f |", getMaSach(), formatDDMMYYYY(getNgayNhap()), getDonGia(), getSoLuong(), getnXB()
				, tinhTrang == eTinhTrang.Moi ? "Mới" : "Cũ", tinhThanhTien() ); 
	}

	public eTinhTrang getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(eTinhTrang tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
}
