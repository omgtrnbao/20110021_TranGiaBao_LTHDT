package bai02_trang4;

public class SVDemo {
	
	public static void main(String[] args) {
		
		SV sv1 = new SV(35, "Bao", 5, 7);
		SV sv2 = new SV(35, "", 15, 7);
		
		System.out.println(String.format("%4s| %-20s| %5s| %5s| %5s|", "Ma SV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB"));
		System.out.println("-------------------------------------------------------");
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		
	}

}
