package bai09_trang10;

public class CongnhanDemo {
	public static void main(String[] args) {
		CongnhanList congNhanList = new CongnhanList(5);
	    Congnhan cn1 = new Congnhan(55, 135, "To", "Chan Phong");
	    Congnhan cn2 = new Congnhan(55, 300, "To", "Chan Phong");
	    Congnhan cn3 = new Congnhan(55, 450, "To", "Chan Phong");
	    Congnhan cn4 = new Congnhan(55, 700, "To", "Chan Phong");
	    Congnhan cn5 = new Congnhan(55, 54, "To", "Chan Phong");

	    CongnhanList.themCongnhan(cn1);
	    CongnhanList.themCongnhan(cn2);
	    CongnhanList.themCongnhan(cn3);
	    CongnhanList.themCongnhan(cn4);
	    CongnhanList.themCongnhan(cn5);

	    System.out.println("Số lượng công nhân trong danh sách: " + CongnhanList.demSLCN());

	    System.out.println("\nThông tin tất cả công nhân:");
	    CongnhanList.xuatTTCN();

	    System.out.println("\nThông tin công nhân làm trên 200 sản phẩm:");
	    CongnhanList.xuatCNLamTren200SP();

	    System.out.println("\nDanh sách công nhân sau khi sắp xếp theo số sản phẩm giảm dần:");
	    CongnhanList.sapXepCongNhanTheoSoSPGiamDan();
	    CongnhanList.xuatTTCN();
	}

}
