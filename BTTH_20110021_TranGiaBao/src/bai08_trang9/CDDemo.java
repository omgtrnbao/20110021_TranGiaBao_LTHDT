package bai08_trang9;

public class CDDemo {
	
	
	public static void main(String[] args) {
		CDList cdList = new CDList(5);
	    CD cd1 = new CD(20110021, 5, "Di vang nhat nhoa", 50000);
	    CD cd2 = new CD(20110021, 8, "Go cua trai tim", 50000);
	    CD cd3 = new CD(20110021, 10, "Le da", 50000);
	    CD cd4 = new CD(20110021, 3, "Con tuoi nao cho em", 50000);
	    CD cd5 = new CD(20110021, 7, "Trinh Nam Son - Tinh khuc bat hu", 50000);

	    cdList.addCD(cd1);
	    cdList.addCD(cd2);
	    cdList.addCD(cd3);
	    cdList.addCD(cd4);
	    cdList.addCD(cd5);

	    System.out.println("Số lượng CD trong danh sách: " + cdList.getCDCount());
	    System.out.println("Tổng giá thành của các CD: " + cdList.getTotalPrice());

	    System.out.println("\nDanh sách CD trước khi sắp xếp:");
	    cdList.displayCDs();

	    cdList.sortCDsByPriceDescending();
	    System.out.println("\nDanh sách CD sau khi sắp xếp giảm dần theo giá thành:");
	    cdList.displayCDs();

	    cdList.sortCDsByTitleAscending();
	    System.out.println("\nDanh sách CD sau khi sắp xếp tăng dần theo tựa CD:");
	    cdList.displayCDs();
	}

}
