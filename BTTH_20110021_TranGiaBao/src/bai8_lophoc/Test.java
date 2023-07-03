package bai8_lophoc;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Management management = new Management(10);
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("----- MENU -----");
			System.out.println("1. Thêm sinh viên");
			System.out.println("2. Thêm nhân viên");
			System.out.println("3. Thêm khách hàng");
			System.out.println("4. Xóa người");
			System.out.println("5. Sắp xếp danh sách");
			System.out.println("6. Xuất danh sách");
			System.out.println("0. Thoát");
			System.out.print("Chọn: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Đọc bỏ ký tự newline (\n)

			switch (choice) {
			case 1:
				System.out.print("Nhập họ và tên sinh viên: ");
				String hoTenSV = scanner.nextLine();
				System.out.print("Nhập địa chỉ sinh viên: ");
				String diaChiSV = scanner.nextLine();
				System.out.print("Nhập điểm môn học 1: ");
				double diemMonHoc1 = scanner.nextDouble();
				scanner.nextLine(); // Đọc bỏ ký tự newline (\n)
				System.out.print("Nhập điểm môn học 2: ");
				double diemMonHoc2 = scanner.nextDouble();
				scanner.nextLine(); // Đọc bỏ ký tự newline (\n)

				Student student = new Student(hoTenSV, diaChiSV, diemMonHoc1, diemMonHoc2);
				boolean themSV = management.them(student);
				if (themSV) {
					System.out.println("Thêm sinh viên thành công!");
				} else {
					System.out.println("Danh sách đã đầy, không thể thêm sinh viên mới!");
				}
				break;
			case 2:
				System.out.print("Nhập họ và tên nhân viên: ");
				String hoTenNV = scanner.nextLine();
				System.out.print("Nhập địa chỉ nhân viên: ");
				String diaChiNV = scanner.nextLine();
				System.out.print("Nhập hệ số lương: ");
				double heSoLuong = scanner.nextDouble();
				scanner.nextLine(); // Đọc bỏ ký tự newline (\n)
				Employee employee = new Employee(hoTenNV, diaChiNV, heSoLuong);
				boolean themNV = management.them(employee);
				if (themNV) {
					System.out.println("Thêm nhân viên thành công!");
				} else {
					System.out.println("Danh sách đã đầy, không thể thêm nhân viên mới!");
				}
				break;
			case 3:
				System.out.print("Nhập họ và tên khách hàng: ");
				String hoTenKH = scanner.nextLine();
				System.out.print("Nhập địa chỉ khách hàng: ");
				String diaChiKH = scanner.nextLine();
				System.out.print("Nhập tên công ty: ");
				String tenCongTy = scanner.nextLine();
				System.out.print("Nhập trị giá hóa đơn: ");
				double triGiaHoaDon = scanner.nextDouble();
				scanner.nextLine(); // Đọc bỏ ký tự newline (\n)
				System.out.print("Nhập đánh giá: ");
				String danhGia = scanner.nextLine();

				Customer customer = new Customer(hoTenKH, diaChiKH, tenCongTy, triGiaHoaDon, danhGia);
				boolean themKH = management.them(customer);
				if (themKH) {
					System.out.println("Thêm khách hàng thành công!");
				} else {
					System.out.println("Danh sách đã đầy, không thể thêm khách hàng mới!");
				}
				break;
			case 4:
				System.out.print("Nhập họ và tên người cần xóa: ");
				String hoTenXoa = scanner.nextLine();
				boolean xoa = management.xoa(hoTenXoa);
				if (xoa) {
					System.out.println("Xóa người thành công!");
				} else {
					System.out.println("Không tìm thấy người cần xóa trong danh sách!");
				}
				break;
			case 5:
				management.sapXep();
				System.out.println("Danh sách đã được sắp xếp theo thứ tự họ tên!");
				break;
			case 6:
				management.xuat();
				break;
			case 0:
				System.out.println("Thoát chương trình.");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
				break;
			}
		} while (choice != 0);

		scanner.close();
	}

}
