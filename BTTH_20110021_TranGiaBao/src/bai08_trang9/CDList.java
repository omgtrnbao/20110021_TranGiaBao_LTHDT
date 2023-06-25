package bai08_trang9;

import java.util.ArrayList;
import java.util.Arrays;

public class CDList {
	private CD[] cds;
	private int count;

	public CDList(int n) {
		cds = new CD[n];
		count = 0;
	}

	public boolean addCD(CD cd) {
		if (count < cds.length) {
			for (int i = 0; i < count; i++) {
				if (cds[i].getMaCD() == cd.getMaCD()) {
					System.out.println("Mã CD đã tồn tại trong danh sách.");
					return false;
				}
			}
			cds[count] = cd;
			count++;
			return true;
		} else {
			System.out.println("Danh sách CD đã đầy.");
			return false;
		}
	}

	public int getCDCount() {
		return count;
	}

	public double getTotalPrice() {
		double totalPrice = 0.0;
		for (int i = 0; i < count; i++) {
			totalPrice += cds[i].getGia();
		}
		return totalPrice;
	}
	public void sortCDsByPriceDescending() {
	    Arrays.sort(cds, 0, count, (cd1, cd2) -> Double.compare(cd2.getGia(), cd1.getGia()));
	}

	public void sortCDsByTitleAscending() {
	    Arrays.sort(cds, 0, count, (cd1, cd2) -> cd1.getTuaCD().compareToIgnoreCase(cd2.getTuaCD()));
	}

	public void displayCDs() {
	    for (int i = 0; i < count; i++) {
	        System.out.println(cds[i]);
	    }
	}

}
