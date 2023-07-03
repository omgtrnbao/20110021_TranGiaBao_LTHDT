package bai7_hanghoa;

import java.util.ArrayList;
import java.util.Comparator;

public class QLHangHoa {
	public enum eLoaiHang {ALL, ThucPham, SanhSu, DienMay};
	public enum eTieuChi{TenHang, SoLuongTon};
	private ArrayList<HangHoa> dsHangHoa;

	public QLHangHoa() {
		dsHangHoa = new ArrayList<HangHoa>();
	}
	
	public boolean themHang(HangHoa hang) {
		boolean flag = true;
		
		for(HangHoa hangHoa : dsHangHoa) {
			if(hangHoa.getMaHang() == hang.getMaHang()) flag = false;
		}
		
		if(flag == true) dsHangHoa.add(hang);
		
		return flag;
	}
	
	public void xuatThongTinHangHoa(eLoaiHang loaiHang) {
		switch(loaiHang) {
			case ALL:
				inTieuDe(eLoaiHang.ALL);
				for(HangHoa hang : dsHangHoa) {
					System.out.println(hang.toString());
				}
				break;
			case ThucPham:
				inTieuDe(eLoaiHang.ThucPham);
				for(HangHoa hang : dsHangHoa) {
					if(hang instanceof HangThucPham) System.out.println(hang.toString());
				}
				break;
			case SanhSu:
				inTieuDe(eLoaiHang.SanhSu);
				for(HangHoa hang : dsHangHoa) {
					if(hang instanceof HangSanhSu) System.out.println(hang.toString());
				}
				break;
			case DienMay:
				inTieuDe(eLoaiHang.DienMay);		
				for(HangHoa hang : dsHangHoa) {
					if(hang instanceof HangDienMay) System.out.println(hang.toString());
				}
				break;
		}
	}
	
	public void timKiemTheoMaHang(String maHang) {
		boolean flag = false;
		for(HangHoa hang : dsHangHoa) {
			if(hang.getMaHang() == maHang) {
				System.out.println("--Tìm thấy thông tin hàng hóa có mã: " + maHang);
				
				if(hang instanceof HangSanhSu) inTieuDe(eLoaiHang.SanhSu);
				else if(hang instanceof HangDienMay) inTieuDe(eLoaiHang.DienMay);
				else if(hang instanceof HangThucPham) inTieuDe(eLoaiHang.ThucPham);
				
				System.out.println(hang.toString());
				flag = true;
			}
		}
		
		if(flag == false) System.out.println("Không tìm thấy thông tin hàng hóa với mã hàng: " + maHang);
	}
	
	public void sapXepHangHoa(eTieuChi tieuChi) {
		switch(tieuChi) {
			case TenHang:
				dsHangHoa.sort(Comparator.comparing(HangHoa::getTenHang));
				break;
			case SoLuongTon:
				dsHangHoa.sort(Comparator.comparing(HangHoa::getSoLuongTon).reversed());
				break;
		}
	}
	
	public void xuatThongTinMucDoBanBuon(eLoaiHang loaiHang) {
		switch(loaiHang) {
			case ALL:
				inTieuDe(eLoaiHang.ThucPham);
				for(HangHoa hang : dsHangHoa) {
					if(hang.danhGiaMucDoBanBuon() != "") System.out.println(hang.toString());
				}
				break;
			case ThucPham:
				inTieuDe(eLoaiHang.ThucPham);
				for(HangHoa hang : dsHangHoa) {
					if(hang instanceof HangThucPham && ((HangThucPham)hang).danhGiaMucDoBanBuon() != "") System.out.println(hang.toString());
				}
				break;
			case SanhSu:
				inTieuDe(eLoaiHang.SanhSu);
				for(HangHoa hang : dsHangHoa) {
					if(hang instanceof HangSanhSu && ((HangSanhSu)hang).danhGiaMucDoBanBuon() != "") System.out.println(hang.toString());
				}
				break;
			case DienMay:
				inTieuDe(eLoaiHang.DienMay);		
				for(HangHoa hang : dsHangHoa) {
					if(hang instanceof HangDienMay && ((HangDienMay)hang).danhGiaMucDoBanBuon() != "") System.out.println(hang.toString());
				}
				break;
		}
	}
	
	public boolean xoaHangHoaTheoMa(String maHang) {
		for(HangHoa hang : dsHangHoa) {
			if(hang.getMaHang() == maHang) {
				dsHangHoa.remove(hang);
				return true;
			}
		}
		return false;
	}
	
	public void suaThongTinDonGia(String maHang, float donGiaMoi) {
		boolean flag = true;
		if(donGiaMoi < 0) {
			flag = false;
			System.out.println("Đơn giá phải >= 0");
		}
		
		if(flag == true) {
			for(HangHoa hang : dsHangHoa) {
					if(hang.getMaHang() == maHang) {
						hang.setDonGia(donGiaMoi);
						System.out.println("Cập nhật thành công đơn giá " + donGiaMoi + " cho sản phẩm có mã hàng " + maHang);
				}
			}
		}
	}
	
	public void inTieuDe(eLoaiHang loaiHang) {
		switch(loaiHang) {
			case ALL:
				System.out.println(" __________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(String.format("| %-15s | %-30s | %15s | %15s |", "Mã hàng", "Tên hàng", "Đơn giá", "Số lượng", "Nhà cung cấp", "Ngày sản xuất", "Ngày hết hạn", "Mức độ bán buôn"));
				System.out.println(String.format("| %-15s | %-30s | %15s | %15s |", "---------------", "------------------------------", "---------------", "---------------"));
				break;
			case ThucPham:
				System.out.println(" __________________________________________________________________________________________________________________________________________________________________________________");
				System.out.println(String.format("| %-15s | %-30s | %15s | %15s | %-20s | %-20s | %-20s | %-20s |", "Mã hàng", "Tên hàng", "Đơn giá", "Số lượng", "Nhà cung cấp", "Ngày sản xuất", "Ngày hết hạn", "Mức độ bán buôn"));
				System.out.println(String.format("| %-15s | %-30s | %15s | %15s | %-20s | %-20s | %-20s | %-20s |", "---------------", "------------------------------", "---------------", "---------------", "--------------------"
																												,"--------------------","--------------------","--------------------"));
				break;
			case SanhSu:
				System.out.println("_____________________________________________________________________________________________________________________________________________________________");
				System.out.println(String.format("| %-15s | %-30s | %15s | %15s | %-20s | %-20s | %-20s |", "Mã hàng", "Tên hàng", "Đơn giá", "Số lượng", "Nhà sản xuất", "Ngày nhập kho", "Mức độ bán buôn"));
				System.out.println(String.format("| %-15s | %-30s | %15s | %15s | %-20s | %-20s | %-20s |", "---------------", "------------------------------", "---------------", "---------------", "--------------------"
																												,"--------------------","--------------------"));
				break;
			case DienMay:
				System.out.println("___________________________________________________________________________________________________________________________________________________________");
				System.out.println(String.format("| %-15s | %-30s | %15s | %15s | %-15s | %-20s | %-20s |", "Mã hàng", "Tên hàng", "Đơn giá", "Số lượng", "Thời gian bảo hành", "Công suất", "Mức độ bán buôn"));
				System.out.println(String.format("| %-15s | %-30s | %15s | %15s | %-15s | %-20s | %-20s |", "---------------", "------------------------------", "---------------", "---------------", "------------------"
																												,"--------------------","--------------------"));
				break;
		}
	}
}
