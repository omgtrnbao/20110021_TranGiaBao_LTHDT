package bai09_trang10;

import java.util.ArrayList;
import java.util.Arrays;

public class CongnhanList {


	private Congnhan[] danhSach;
	private int count;


	public CongnhanList (int n) {
		danhSach = new Congnhan [n];
		count = 0;
	}


	public boolean themCongnhan (Congnhan congNhan) {
		if (count < danhSach.length)  {
			danhSach[count] = congNhan;
			count++;
			return true;
		}
		else {
			System.out.println("Danh sach cong nhan da day");
			return false;
		}
	}


	public void xuatTTCN() {
		for (int i = 0; i < count; i++) {
			System.out.println(danhSach[i]);
		}
	}


	public int demSLCN() {
		return count;
	}


	public void xuatCNLamTren200SP() {
		System.out.println("Công nhân làm trên 200 sản phẩm:");
		for (int i = 0; i < count; i++) {
			if (danhSach[i].getmSoSP() > 200) {
				System.out.println(danhSach[i]);
			}
		}
	}


	public void sapXepCongNhanTheoSoSPGiamDan() {
		Arrays.sort(danhSach, 0, count, (cn1, cn2) -> Integer.compare(cn2.getmSoSP(), cn1.getmSoSP()));
	}

}

