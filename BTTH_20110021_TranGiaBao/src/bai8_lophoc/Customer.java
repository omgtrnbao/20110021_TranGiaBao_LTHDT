package bai8_lophoc;

public class Customer extends Person {
    private String tenCongTy;
    private double triGiaHoaDon;
    private String danhGia;

    public Customer(String hoTen, String diaChi,String tenCongTy, double triGiaHoaDon, String danhGia) {
    	super(hoTen, diaChi);
    	this.tenCongTy = tenCongTy;
    	this.triGiaHoaDon = triGiaHoaDon;
    	this.danhGia = danhGia;
    }
    @Override
    public String toString() {
        return super.toString() + "\nTên công ty: " + tenCongTy + "\nTrị giá hóa đơn: " + triGiaHoaDon + "\nĐánh giá: " + danhGia;
    }
}
