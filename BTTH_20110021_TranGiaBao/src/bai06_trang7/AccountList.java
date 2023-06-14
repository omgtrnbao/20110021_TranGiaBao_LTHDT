package bai06_trang7;

public class AccountList {
	private Account listTK[];
	private int count = 0;

	public AccountList() {
		listTK = new Account[10];
	}
	
	public AccountList(int soPhanTu) {
		if(soPhanTu > 0) listTK = new Account[soPhanTu];
		else listTK = new Account[10];
	}
	
	public String addAccount(Account tk) {
		if(count < listTK.length) {
			listTK[count] = tk;
			count++;
			return "Thêm tài khoản thành công!";
		}
		
		return "Thêm tài khoản thất bại!";
	}
	
	public void xuatAllPhanTu() {
		for(int i = 0; i < count; i++) {
			System.out.println(listTK[i].toString());
		}
	}
}
