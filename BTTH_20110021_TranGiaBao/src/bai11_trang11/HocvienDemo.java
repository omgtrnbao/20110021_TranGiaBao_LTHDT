package bai11_trang11;

public class HocvienDemo {
	
	    public static void main(String[] args) {
	        // Tạo danh sách học viên trong lớp học
	        Hocvien[] hocVienList = new Hocvien[5];
	        hocVienList[0] = new Hocvien("Bao", 1995, new double[]{8, 7, 9, 8, 7});
	        hocVienList[1] = new Hocvien("Hoang", 1996, new double[]{6, 7, 8, 5, 7});
	        hocVienList[2] = new Hocvien("An", 1997, new double[]{7, 6, 8, 9, 6});
	        hocVienList[3] = new Hocvien("Tan", 1998, new double[]{5, 6, 5, 4, 5});
	        hocVienList[4] = new Hocvien("Thien", 1999, new double[]{7, 8, 6, 7, 8});

	        // Đếm số người làm luận văn tốt nghiệp, thi tốt nghiệp và số người phải thi lại
	        int soLuongLamLuanVan = 0;
	        int soLuongThiTotNghiep = 0;
	        int soLuongThiLai = 0;
	        boolean monThiLai = "" != null;

	        for (Hocvien hocVien : hocVienList) {
	            if (hocVien.lamLuanVan()) {
	                soLuongLamLuanVan++;
	            } else if (hocVien.thiTotNghiep()) {
	                soLuongThiTotNghiep++;
	            } else {
	                soLuongThiLai++;
	                monThiLai = hocVien.thiLai();
	            }
	        }

	        System.out.println("Số người làm luận văn tốt nghiệp: " + soLuongLamLuanVan);
	        System.out.println("Số người thi tốt nghiệp: " + soLuongThiTotNghiep);
	        System.out.println("Số người phải thi lại: " + soLuongThiLai);
	        System.out.println("Các môn thi lại: " + monThiLai);

	    }
}

