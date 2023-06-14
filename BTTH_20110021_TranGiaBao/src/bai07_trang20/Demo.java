package bai07_trang20;

import java.time.LocalDate;

import bai07_trang20.QLHangHoa.eLoaiHang;
import bai07_trang20.QLHangHoa.eTieuChi;

public class Demo {
	public static void main(String[] args) {
		QLHangHoa quanLy = new QLHangHoa();
		
		HangThucPham hangThucPham1 = new HangThucPham("TP0010", "Đùi gà", 15000, 150, "Việt GAP", LocalDate.of(2022, 10, 15), LocalDate.of(2022, 10, 30));
		HangThucPham hangThucPham2 = new HangThucPham("TP0020", "Đuôi heo", 73000, 34, "Việt GAP", LocalDate.of(2022, 11, 1), LocalDate.of(2022, 11, 7));
		HangThucPham hangThucPham3 = new HangThucPham("TP0030", "Ổi", 18000, 320, "Việt GAP", LocalDate.of(2022, 11, 5), LocalDate.of(2022, 12, 1));
		
		HangSanhSu hangSanhSu1 = new HangSanhSu("SS0010", "Chén kiểu xưa", 123000, 432, "Việt Nam", LocalDate.of(2022,4,1));
		HangSanhSu hangSanhSu2 = new HangSanhSu("SS0020", "Ly uống rượu", 66000, 58, "Italy", LocalDate.of(2022,6,21));
		HangSanhSu hangSanhSu3 = new HangSanhSu("SS0030", "Bình thủy tinh", 790000, 40, "Việt Nam", LocalDate.of(2022,9,1));
		
		HangDienMay hangDienMay1 = new HangDienMay("DT0010", "Máy ảnh Nikon", 23500000, 19, 36, 10);
		HangDienMay hangDienMay2 = new HangDienMay("DT0020", "iPhone 14 Pro Max 256GB", 34500000, 10, 12, 7);
		HangDienMay hangDienMay3 = new HangDienMay("DT0030", "Máy giặt LG inverter", 12900000, 2, 24, 21);
		
		quanLy.themHang(hangDienMay1);
		quanLy.themHang(hangDienMay2);
		quanLy.themHang(hangDienMay3);
		quanLy.themHang(hangSanhSu1);
		quanLy.themHang(hangSanhSu2);
		quanLy.themHang(hangSanhSu3);
		quanLy.themHang(hangThucPham1);
		quanLy.themHang(hangThucPham2);
		quanLy.themHang(hangThucPham3);
		
		System.out.println("\n__ Xuất tất cả thông tin hàng hóa __");
		quanLy.xuatThongTinHangHoa(eLoaiHang.ALL);
		System.out.println("\n__ Xuất thông tin hàng thực phẩm __");
		quanLy.xuatThongTinHangHoa(eLoaiHang.ThucPham);
		System.out.println("\n__ Xuất thông tin hàng sành sứ __");
		quanLy.xuatThongTinHangHoa(eLoaiHang.SanhSu);
		System.out.println("\n__ Xuất thông tin hàng điện máy __");
		quanLy.xuatThongTinHangHoa(eLoaiHang.DienMay);
		
		System.out.println("\n__ Xuất thông mức độ bán buôn của hàng điện máy __");
		quanLy.xuatThongTinMucDoBanBuon(eLoaiHang.ThucPham);
		
		System.out.println("\n__ Tìm kiếm hàng hóa có mã: SS0020 __");
		quanLy.timKiemTheoMaHang("SS0020");
		
		System.out.println("\n__ Cập nhật đơn giá 89.000 cho hàng hóa có mã: DT0030 __");
		quanLy.suaThongTinDonGia("DT0030", 89000);
		
		System.out.println("\n__ Sắp xếp danh sách theo số lượng giảm dần __");
		quanLy.sapXepHangHoa(eTieuChi.SoLuongTon);
		quanLy.xuatThongTinHangHoa(eLoaiHang.ALL);
	}
}
