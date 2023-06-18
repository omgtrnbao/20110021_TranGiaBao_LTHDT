package bai11_trang11;

import java.util.Arrays;

public class Hocvien {
	
	    private String hoTen;
	    private int namSinh;
	    private double[] diemMonHoc;

	    public Hocvien() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		public Hocvien(String hoTen, int namSinh, double[] diemMonHoc) {
			super();
			this.hoTen = hoTen;
			this.namSinh = namSinh;
			this.diemMonHoc = diemMonHoc;
		}

	    public boolean lamLuanVan() {
	        double diemTrungBinh = tinhDiemTrungBinh();
	        for (double diem : diemMonHoc) {
	            if (diem < 5) {
	                return false;
	            }
	        }
	        return diemTrungBinh > 7;
	    }

	    public boolean thiTotNghiep() {
	        double diemTrungBinh = tinhDiemTrungBinh();
	        for (double diem : diemMonHoc) {
	            if (diem < 5) {
	                return false;
	            }
	        }
	        return diemTrungBinh <= 7;
	    }

	    public boolean thiLai() {
	        for (double diem : diemMonHoc) {
	            if (diem < 5) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private double tinhDiemTrungBinh() {
	        double sum = 0;
	        for (double diem : diemMonHoc) {
	            sum += diem;
	        }
	        return sum / diemMonHoc.length;
	    }

		@Override
		public String toString() {
			return "Hocvien [hoTen=" + hoTen + ", namSinh=" + namSinh + ", diemMonHoc=" + Arrays.toString(diemMonHoc)
					+ "]";
		}

	    
}



