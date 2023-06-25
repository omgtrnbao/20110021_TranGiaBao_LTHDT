package bai12_trang12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trungtamdaotao {
	private List<Khoahoc> danhSachKhoaHoc;

    public void TrungTamDaoTao() {
        this.danhSachKhoaHoc = new ArrayList<>();
    }

    public void themKhoaHoc(Khoahoc khoaHoc) {
        danhSachKhoaHoc.add(khoaHoc);
    }

    public List<Khoahoc> timKhoaHoc(Date ngayBatDau, Date ngayKetThuc) {
        List<Khoahoc> ketQua = new ArrayList<>();
        for (Khoahoc khoaHoc : danhSachKhoaHoc) {
            Date ngayMoKhoaHoc = khoaHoc.getNgayMoKhoaHoc();
            if (ngayMoKhoaHoc.compareTo(ngayBatDau) >= 0 && ngayMoKhoaHoc.compareTo(ngayKetThuc) <= 0) {
                ketQua.add(khoaHoc);
            }
        }
        return ketQua;
    }
    
    public List<Khoahoc> timKhoaHocChuaKetThuc() {
        List<Khoahoc> ketQua = new ArrayList<>();
        Date ngayHienTai = new Date();
        for (Khoahoc khoaHoc : danhSachKhoaHoc) {
            Date ngayMoKhoaHoc = khoaHoc.getNgayMoKhoaHoc();
            if (ngayMoKhoaHoc.compareTo(ngayHienTai) > 0) {
                ketQua.add(khoaHoc);
            }
        }
        return ketQua;
    }

    public List<Khoahoc> timKhoaHocChuaBatDau() {
        List<Khoahoc> ketQua = new ArrayList<>();
        Date ngayHienTai = new Date();
        for (Khoahoc khoaHoc : danhSachKhoaHoc) {
            Date ngayMoKhoaHoc = khoaHoc.getNgayMoKhoaHoc();
            if (ngayMoKhoaHoc.compareTo(ngayHienTai) > 0) {
                ketQua.add(khoaHoc);
            }
        }
        return ketQua;
    }

    public Khoahoc timKhoaHocTheoHocVien(Hocvien hocVien) {
        for (Khoahoc khoaHoc : danhSachKhoaHoc) {
            List<Hocvien> danhSachHocVien = khoaHoc.getDanhSachHocVien();
            if (danhSachHocVien.contains(hocVien)) {
                return khoaHoc;
            }
        }
        return null;
    }

}
