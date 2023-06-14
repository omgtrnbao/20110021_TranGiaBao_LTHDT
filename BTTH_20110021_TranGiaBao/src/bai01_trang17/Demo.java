package bai01_trang17;

import bai01_trang17.NhaXe.enumLoai;

public class Demo {
	public static void main(String[] args) throws Exception {
		NhaXe nhaXe1 = new NhaXe("Nha Xe IUH");
				
		ChuyenXeNoiThanh chuyenNoiThanh1 = new ChuyenXeNoiThanh("NT01", "Teo", "50A1-123.01", 700000, 300, 10);
		ChuyenXeNoiThanh chuyenNoiThanh2 = new ChuyenXeNoiThanh("NT02", "Ti", "50A1-123.02", 700000, 300, 10);
		
		ChuyenXeNgoaiThanh chuyenNgoaiThanh1 = new ChuyenXeNgoaiThanh("NT03", "Tun", "50A1-123.03", 1200000, "Nha Trang", 4);
		ChuyenXeNgoaiThanh chuyenNgoaiThanh2 = new ChuyenXeNgoaiThanh("NT04", "Tung", "50A1-123.04", 700000, "Vung Tau", 2);
		
		nhaXe1.themChuyenXe(chuyenNgoaiThanh1);
		nhaXe1.themChuyenXe(chuyenNgoaiThanh2);
		nhaXe1.themChuyenXe(chuyenNoiThanh1);
		nhaXe1.themChuyenXe(chuyenNoiThanh2);
		
		System.out.println("--Xuat Tat ca--");
		nhaXe1.xuatChuyenXe(enumLoai.TatCa);
		System.out.println("--Xuat noi thanh--");
		nhaXe1.xuatChuyenXe(enumLoai.ChuyenXeNoiThanh);
		System.out.println("--Xuat ngoai thanh--");
		nhaXe1.xuatChuyenXe(enumLoai.ChuyenXeNgoaiThanh);
		
		System.out.println("--Tong doanh thu--");
		nhaXe1.tinhDoanhThu(enumLoai.TatCa);
		System.out.println("--Doanh thu noi thanh--");
		nhaXe1.tinhDoanhThu(enumLoai.ChuyenXeNoiThanh);
		System.out.println("--Doanh thu ngoai thanh--");
		nhaXe1.tinhDoanhThu(enumLoai.ChuyenXeNgoaiThanh);
	}
}
