package bai12_trang12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
        Trungtamdaotao trungTam = new Trungtamdaotao();

        // Tạo danh sách học viên
        Hocvien hocVien1 = new Hocvien("Bao", "Cu xa Thanh Da", "0932163534");
        Hocvien hocVien2 = new Hocvien("Tran Thi B", "456 XYZ Street", "987654321");

        // Tạo khóa học
        Khoahoc khoaHoc1 = new Khoahoc();
        khoaHoc1.themHocVien(hocVien1);
        khoaHoc1.themHocVien(hocVien2);

        Khoahoc khoaHoc2 = new Khoahoc();
        khoaHoc2.themHocVien(hocVien1);

        // Thêm khóa học vào trung tâm đào tạo
        trungTam.themKhoaHoc(khoaHoc1);
        trungTam.themKhoaHoc(khoaHoc2);

        // Tìm kiếm khóa học
        List<Khoahoc> ketQua = trungTam.timKhoaHocChuaKetThuc();
        System.out.println("Các khóa học chưa kết thúc:");
        for (Khoahoc khoaHoc : ketQua) {
            System.out.println(Khoahoc.getTenKhoaHoc());
            		for (Khoahoc khoahoc : ketQua) {
                        System.out.println(khoaHoc.getTenKhoaHoc());
                    }

                    // Tìm kiếm khóa học chưa bắt đầu
                    ketQua = trungTam.timKhoaHocChuaBatDau();
                    System.out.println("Các khóa học chưa bắt đầu:");
                    for (Khoahoc khoaHoc : ketQua) {
                        System.out.println(khoaHoc.getTenKhoaHoc());
                    }

                    // Tìm khóa học theo học viên
                    Khoahoc khoaHoc = trungTam.timKhoaHocTheoHocVien(hocVien1);
                    if (khoaHoc != null) {
                        System.out.println("Học viên " + hocVien1.getHoTen() + " đã từng học khóa học: " + khoaHoc.getTenKhoaHoc());
                    } else {
                        System.out.println("Học viên " + hocVien1.getHoTen() + " chưa từng học khóa học nào.");
                    }
                }
            }
}
