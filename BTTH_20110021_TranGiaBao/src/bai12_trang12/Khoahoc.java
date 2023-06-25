package bai12_trang12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Khoahoc {

	
	private String tenKhoaHoc;
    private Date ngayMoKhoaHoc;
    private String thoiGianHoc;
    private List<Hocvien> danhSachHocVien;

    
    public void KhoaHoc(String tenKhoaHoc, Date ngayMoKhoaHoc, String thoiGianHoc) {
    	setTenKhoaHoc(tenKhoaHoc);
    	setNgayMoKhoaHoc(ngayMoKhoaHoc);
    	setThoiGianHoc(thoiGianHoc);
        this.danhSachHocVien = new ArrayList<>();
    }
    
    
    public String getTenKhoaHoc() {
		return tenKhoaHoc;
	}

	public void setTenKhoaHoc(String tenKhoaHoc) {
		this.tenKhoaHoc = tenKhoaHoc;
	}

	public Date getNgayMoKhoaHoc() {
		return ngayMoKhoaHoc;
	}

	public void setNgayMoKhoaHoc(Date ngayMoKhoaHoc) {
		this.ngayMoKhoaHoc = ngayMoKhoaHoc;
	}

	public String getThoiGianHoc() {
		return thoiGianHoc;
	}

	public void setThoiGianHoc(String thoiGianHoc) {
		this.thoiGianHoc = thoiGianHoc;
	}

	public List<Hocvien> getDanhSachHocVien() {
		return danhSachHocVien;
	}

	public void setDanhSachHocVien(List<Hocvien> danhSachHocVien) {
		this.danhSachHocVien = danhSachHocVien;
	}

	
	public void themHocVien(Hocvien hocVien) {
        if (danhSachHocVien.size() < 20) {
            danhSachHocVien.add(hocVien);
        } else {
            System.out.println("Không thể thêm học viên. Số lượng học viên đã đạt tối đa.");
        }
    }


	@Override
	public String toString() {
		return "Khoahoc [tenKhoaHoc=" + tenKhoaHoc + ", ngayMoKhoaHoc=" + ngayMoKhoaHoc + ", thoiGianHoc=" + thoiGianHoc
				+ ", danhSachHocVien=" + danhSachHocVien + "]";
	}
	
}

