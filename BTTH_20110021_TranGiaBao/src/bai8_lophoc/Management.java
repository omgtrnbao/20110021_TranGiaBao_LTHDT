package bai8_lophoc;

import java.util.Arrays;
import java.util.List;

public class Management {
	
	private Person[] danhSach;
	private int count;
	
	public Management(int n) {
	    danhSach = new Person[n];
	    count = 0;
	}

	public boolean them(Person person) {
	    if (count < danhSach.length) {
	        danhSach[count] = person;
	        count++;
	        return true;
	    }
	    return false;
	}

	public boolean xoa(String hoTen) {
	    for (int i = 0; i < count; i++) {
	        if (danhSach[i].toString().contains(hoTen)) {
	            for (int j = i; j < count - 1; j++) {
	                danhSach[j] = danhSach[j + 1];
	            }
	            danhSach[count - 1] = null;
	            count--;
	            return true;
	        }
	    }
	    return false;
	}

	public void sapXep() {
	    Arrays.sort(danhSach, 0, count, (a, b) -> a.toString().compareToIgnoreCase(b.toString()));
	}

	public void xuat() {
	    System.out.println("Danh sách:");
	    for (int i = 0; i < count; i++) {
	        System.out.println("--------------------");
	        System.out.println(danhSach[i].toString());
	    }
	}

}
