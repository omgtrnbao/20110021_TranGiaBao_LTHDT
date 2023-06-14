package bai06_trang7;

import java.util.Scanner;

public class AccountDemo {
	static AccountList listTK;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int luaChon = -1;
		do {
			luaChon = taoMenu();
			switch(luaChon) {
				case 1: {
					System.out.println("Nhập số lượng tài khoản cần tạo: ");
					taoDanhSachTK(input.nextInt());
				}
				case 2: {
					listTK.xuatAllPhanTu();
				}
			}
			
			}while(luaChon != 9);
		
	}
	
	public static int taoMenu() {
			
		System.out.println("------------Chương Trình Quản Lý Tài Khoản------------");
		System.out.println("1- Tạo danh sách tài khoản");
		System.out.println("2- Xuất tất cả thông tin tài khoản");
		System.out.println("-- Nhấn số 9 để thoát chương trình");
		
		return input.nextInt();
	}
	
	public static void taoDanhSachTK(int soPhanTu) {
		listTK = new AccountList(soPhanTu);
		for(int i = 0; i < soPhanTu; i++) {
			System.out.println("-Nhập thông tin tài khoản thứ " + i + 1);
			listTK.addAccount(taoTaiKhoan());
		}
	}
	
	public static Account taoTaiKhoan() {
		long soTK; String tenTK; double soTien;
		
		System.out.println("Nhập số tài khoản: ");
		soTK = input.nextLong();
		tenTK = input.nextLine();
		System.out.println("Nhập tên tài khoản: ");
		tenTK = input.nextLine();
		
		System.out.println("Nhập số tiền: ");
		soTien = input.nextDouble();
		
		Account acc = new Account(soTK, tenTK, soTien);
		
		return acc;
	}
}
