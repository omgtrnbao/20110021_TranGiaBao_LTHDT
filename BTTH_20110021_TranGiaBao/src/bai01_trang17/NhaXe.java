package bai01_trang17;

import java.util.ArrayList;

public class NhaXe {
	public enum enumLoai {TatCa, ChuyenXe, ChuyenXeNoiThanh, ChuyenXeNgoaiThanh};
	private String tenNhaXe;	
	private ArrayList<ChuyenXe> listChuyenXe;
	
	public NhaXe(String tenNhaXe) {
		super();
		this.tenNhaXe = tenNhaXe;
		listChuyenXe = new ArrayList<ChuyenXe>();
	}
	
	public void themChuyenXe(ChuyenXe chuyen) {
		if(!listChuyenXe.contains(chuyen)) listChuyenXe.add(chuyen);
		else System.out.println("Them that bai. Chuyen xe da ton tai");
	}
	
	public void xoaChuyenXe(ChuyenXe chuyen) {
		if(listChuyenXe.contains(chuyen)) listChuyenXe.remove(chuyen);
		else System.out.println("Xoa that bai. Chuyen xe khong ton tai");
	}
	
	public void xuatChuyenXe (enumLoai loai) {
		if(loai == enumLoai.TatCa) {
			for(ChuyenXe chuyen : listChuyenXe) {
				System.out.println(chuyen.toString());
			}
		}
		if(loai == enumLoai.ChuyenXeNoiThanh) {
			for(ChuyenXe chuyen : listChuyenXe) {
				if(chuyen instanceof ChuyenXeNoiThanh)
					System.out.println(chuyen.toString());
			}
		}
		if(loai == enumLoai.ChuyenXeNgoaiThanh) {
			for(ChuyenXe chuyen : listChuyenXe) {
				if(chuyen instanceof ChuyenXeNgoaiThanh)
					System.out.println(chuyen.toString());
			}
		}
	}
	
	public void tinhDoanhThu(enumLoai loai) {
		double tongDoanhThu = 0;
		if(loai == enumLoai.TatCa) {
			for(ChuyenXe chuyen : listChuyenXe) {
				tongDoanhThu += chuyen.getDoanhThu();
			}
			System.out.println("Tong doanh thu: " + tongDoanhThu);
		}
		if(loai == enumLoai.ChuyenXeNoiThanh) {
			for(ChuyenXe chuyen : listChuyenXe) {
				if(chuyen instanceof ChuyenXeNoiThanh) tongDoanhThu += chuyen.getDoanhThu();
			}
			System.out.println("Doanh thu noi thanh: " + tongDoanhThu);
		}
		if(loai == enumLoai.ChuyenXeNgoaiThanh) {
			for(ChuyenXe chuyen : listChuyenXe) {
				if(chuyen instanceof ChuyenXeNgoaiThanh) tongDoanhThu += chuyen.getDoanhThu();
			}
			System.out.println("Doanh thu ngoai thanh: " + tongDoanhThu);
		}
	}

	public String getTenNhaXe() {
		return tenNhaXe;
	}

	public void setTenNhaXe(String tenNhaXe) {
		this.tenNhaXe = tenNhaXe;
	}
}
