package bai06_trang26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyPhong {
	public enum eLoaiPhong {ALL, PhongLyThuyet, PhongMayTinh, PhongThiNghiem};
	public enum eTieuChi {DayNha, DienTich, SoBongDen};
	private ArrayList<PhongHoc> dsPhong;

	public QuanLyPhong() {
		dsPhong = new ArrayList<PhongHoc>();
	}
	
	public boolean themPhong(PhongHoc phongMoi) {
		for(PhongHoc phong : dsPhong) {
			if(phong.getMaPhong() == phongMoi.getMaPhong()) return false;
		}
		
		dsPhong.add(phongMoi);
		return true;
	}
	
	public void timKiemPhong(String maPhong) {
		boolean flag = false;
		for(PhongHoc phong : dsPhong) {
			if(phong.getMaPhong() == maPhong) {
				System.out.println("Tìm thấy thông tin phòng có mã: " + maPhong);
				
				if(phong instanceof PhongLyThuyet) inTieuDe(eLoaiPhong.PhongLyThuyet);
				if(phong instanceof PhongMayTinh) inTieuDe(eLoaiPhong.PhongMayTinh);
				if(phong instanceof PhongThiNghiem) inTieuDe(eLoaiPhong.PhongThiNghiem);
				
				System.out.println(phong.toString());
				flag = true;
			}
		}
		
		if(!flag) System.out.println("Không tìm thấy thông tin phòng có mã: " + maPhong);
	}
	
	public void xuatThongTinPhong(eLoaiPhong loaiPhong) {		
		switch(loaiPhong) {
		case ALL:
			inTieuDe(eLoaiPhong.ALL);			
			for(PhongHoc phong : dsPhong) {			
				System.out.println(phong.toString());
			}
			break;
		case PhongLyThuyet:
			inTieuDe(eLoaiPhong.PhongLyThuyet);
			for(PhongHoc phong : dsPhong) {
				if(phong instanceof PhongLyThuyet)	System.out.println(phong.toString());
			}
			break;
		case PhongMayTinh:
			inTieuDe(eLoaiPhong.PhongMayTinh);
			for(PhongHoc phong : dsPhong) {
				if(phong instanceof PhongMayTinh)	System.out.println(phong.toString());
			}
			break;
		case PhongThiNghiem:
			inTieuDe(eLoaiPhong.PhongThiNghiem);
			for(PhongHoc phong : dsPhong) {
				if(phong instanceof PhongThiNghiem)	System.out.println(phong.toString());
			}
			break;
		}
	}
	
	public void sapXepDanhSach(eTieuChi tieuChi) {
		switch(tieuChi){
			case DayNha:
				dsPhong.sort(Comparator.comparing(PhongHoc::getDayNha));
				break;
			case DienTich:
				dsPhong.sort(Comparator.comparing(PhongHoc::getDienTich).reversed());
				break;
			case SoBongDen:
				dsPhong.sort(Comparator.comparing(PhongHoc::getSoBongDen));
				break;
		}
	}
	
	public void capNhatSoMayTinh(String maPhong, int soLuongMay) {
		boolean flag = false;
		
		for(PhongHoc phong : dsPhong) {
			if(phong instanceof PhongMayTinh && phong.getMaPhong() == maPhong) {
				if(soLuongMay >= 0) {
					((PhongMayTinh)phong).setSoLuongMayTinh(soLuongMay);
					System.out.println("Cập nhật thành công số lượng máy là " + soLuongMay + " cho phòng có mã " + maPhong);
					flag = true;
				}
				else {
					System.out.println("Số lượng máy phải >= 0");
					flag = false;
				}
			}
		}
		
		if(!flag) System.out.println("Không tìm thấy mã phòng cần cập nhật!");
	}
	
	public void xoaPhongHoc(String maPhong) {
		boolean flag = false;
		
		for(PhongHoc phong : dsPhong) {
			if(phong.getMaPhong() == maPhong) {
				System.out.println("Bạn thật sự muốn xóa thông tin phòng " + maPhong + "? (Y/N)");
				Scanner input = new Scanner(System.in);
				char luaChon = input.nextLine().charAt(0); //Lấy ký tự đầu tiên trong chuỗi String từ input
				input.close();
				
				if(Character.compare(luaChon, 'Y') == 0) {
					dsPhong.remove(phong);
					System.out.println("Xóa thành công thông tin phòng có mã " + maPhong);
					flag = true;
					break;
				}
				else {
					System.out.println("Xóa thất bại");
					flag = true;
				}
			}
		}
		
		if(!flag) System.out.println("Không tìm thấy thông tin phòng có mã " + maPhong);
	}
	
	public void tongSoPhongHoc() {
		System.out.println("Tổng số phòng học: " + dsPhong.size());
	}
	
	public void xuatSLPhongMayTinh(int soLuongMay) {
		inTieuDe(eLoaiPhong.PhongMayTinh);
		for(PhongHoc phong : dsPhong) {
			if(phong instanceof PhongMayTinh && ((PhongMayTinh)phong).getSoLuongMayTinh() >= soLuongMay) {
				System.out.println(phong.toString());
			}
		}
	}
	
	public void inTieuDe(eLoaiPhong loaiPhong) {
		switch(loaiPhong) {
			case ALL:
				System.out.println(String.format("| %-20s | %-15s | %15s | %15s |", "Mã phòng", "Dãy nhà", "Diện tích", "Số bóng đèn"));
				break;
			case PhongLyThuyet:
				System.out.println(String.format("| %-20s | %-15s | %15s | %15s | %-20s | %-30s |", "Mã phòng", "Dãy nhà", "Diện tích", "Số bóng đèn", "Máy chiếu", "Kiểm định"));
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
				break;
			case PhongMayTinh:
				System.out.println(String.format("| %-20s | %-15s | %15s | %15s | %-20s | %-30s |", "Mã phòng", "Dãy nhà", "Diện tích", "Số bóng đèn", "Số lượng máy", "Kiểm định"));
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
				break;
			case PhongThiNghiem:
				System.out.println(String.format("| %-20s | %-15s | %15s | %15s | %-20s | %-15s | %-20s | %-30s |", "Mã phòng", "Dãy nhà", "Diện tích", "Số bóng đèn", "Chuyên ngành"
													, "Sức chứa", "Bồn rửa", "Kiểm định"));
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				break;
		}
	}
}
