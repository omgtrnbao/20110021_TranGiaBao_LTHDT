package bai02_trang17;

import java.util.ArrayList;

public class QuanLySach {
	public enum eLoaiSach {ALL, SGK, STK};
	private ArrayList<Sach> dsSach;

	public QuanLySach() {
		super();
		// TODO Auto-generated constructor stub
		dsSach = new ArrayList<Sach>();
	}
	
	public void themSach(Sach sach) {
		String ketQua = "Thêm thành công!";
		if(dsSach.contains(sach)) ketQua = ("Thêm thất bại! (đối tượng sách đã tồn tại)");
		else dsSach.add(sach);
			
		System.out.println(ketQua);
	}
	
	public float tinhTongThanhTien(eLoaiSach loaiSach) {
		float tongTien = 0f;
		switch(loaiSach) {
			case ALL:{
				for(Sach sach : dsSach) {
					tongTien += sach.tinhThanhTien();
				}
				break;
			}
			case SGK:{
				for(Sach sach : dsSach) {
					if(sach instanceof SachGiaoKhoa) tongTien += sach.tinhThanhTien();
				}
				break;
			}
			case STK:{
				for(Sach sach : dsSach) {
					if(sach instanceof SachThamKhao) tongTien += sach.tinhThanhTien();
				}
				break;
			}
		}
		
		return tongTien;
	}
	
	public float timThanhTienCaoNhat() {
		float max = 0f;
		
		for(Sach sach : dsSach) {
			if(max < sach.tinhThanhTien()) max = sach.tinhThanhTien();
		}
		
		return max;
	}
	
	public void xuatThongTinSach(eLoaiSach loaiSach) {
		System.out.println(String.format("\n| %-15s | %-15s | %-15s | %-15s | %-30s | %-20s | %-20s |", "Mã sách", "Ngày nhập", "Đơn giá", "Số lượng", "Nhà xuất bản", "Tình trạng/ Thuế", "Thành tiền"));
		System.out.println(String.format("| %-15s | %-15s | %-15s | %-15s | %-30s | %-20s | %-20s |", "---------------", "---------------", "---------------", "---------------", "------------------------------"
				, "--------------------", "--------------------"));
		switch(loaiSach) {
			case ALL:{
				for(Sach sach : dsSach) {
					 System.out.println(sach.toString());
				}
				break;
			}
			case SGK:{
				for(Sach sach : dsSach) {
					if(sach instanceof SachGiaoKhoa) System.out.println(sach.toString());
				}
				break;
			}
			case STK:{
				for(Sach sach : dsSach) {
					if(sach instanceof SachThamKhao) System.out.println(sach.toString());
				}
				break;
			}
		}
	}
}
