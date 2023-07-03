package bai1_chuyenxe;

import java.util.ArrayList;
import java.util.List;

public class ChuyenXeDemo {
	
	public static void main(String[] args) throws Exception {
		
		ArrayList<ChuyenXe>danhSachChuyenXe = new ArrayList<>();
		
		//Noi thanh
		ChuyenXeNoiThanh noT1 = new ChuyenXeNoiThanh("NoT1", "Ti", "59S1", 30000, 14, 5);
		ChuyenXeNoiThanh noT2 = new ChuyenXeNoiThanh("NoT2", "Teo", "59S2", 40000, 53, 9);
		
		//Ngoai thanh
		ChuyenXeNgoaiThanh ngT1 = new ChuyenXeNgoaiThanh("Ngt1", "Tin", "55s1", 70000, "Vung Tau", 1);
		ChuyenXeNgoaiThanh ngT2 = new ChuyenXeNgoaiThanh("Ngt2", "Tung", "55s2", 80000, "Da Lat", 2);
		
		//add
		danhSachChuyenXe.add(noT1);
		danhSachChuyenXe.add(noT2);
		danhSachChuyenXe.add(ngT1);
		danhSachChuyenXe.add(ngT2);
		
		//tinh tong doanh thu
		int tongDoanhthu = 0;
		for (ChuyenXe chuyenXe : danhSachChuyenXe) {
			tongDoanhthu += chuyenXe.getDoanhThu();
		}
		
		//xuat tong doanh thu
		System.out.println("Tong doanh thu: " + tongDoanhthu);
		
		//tong doanh thu tung loai
		int tongDTNoithanh = 0;
		int tongDTNgoaithanh = 0;
		for (ChuyenXe chuyenXe : danhSachChuyenXe) {
			if (chuyenXe instanceof ChuyenXeNoiThanh) {
				tongDTNoithanh += chuyenXe.getDoanhThu();
			}
			else if (chuyenXe instanceof ChuyenXeNgoaiThanh) {
				tongDTNgoaithanh += chuyenXe.getDoanhThu();
			}
		}
		
		System.out.println("Tong doanh thu noi thanh: " + tongDTNoithanh);
		System.out.println("Tong doanh thu ngoai thanh: " + tongDTNgoaithanh);
		
	}

}
