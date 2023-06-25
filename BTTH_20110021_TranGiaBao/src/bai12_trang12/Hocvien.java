package bai12_trang12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hocvien {
	
	
	    private String hoTen;
	    private String diaChi;
	    private String soDienThoai;
	    
	    
	    public Hocvien() {
			super();
			// TODO Auto-generated constructor stub
		}

	    
		public Hocvien(String hoTen, String diaChi, String soDienThoai) {
	        setHoTen(hoTen);
	        setDiaChi(diaChi);
	        setSoDienThoai(soDienThoai);
	    }

		
	    public String getHoTen() {
	        return hoTen;
	    }

	    public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}

		public String getDiaChi() {
	        return diaChi;
	    }

		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}

		public String getSoDienThoai() {
	        return soDienThoai;
	    }
		
		public void setSoDienThoai(String soDienThoai2) {
			this.soDienThoai = soDienThoai2;
		}


		@Override
		public String toString() {
			return "Hocvien [hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + "]";
		}

	    
	}


