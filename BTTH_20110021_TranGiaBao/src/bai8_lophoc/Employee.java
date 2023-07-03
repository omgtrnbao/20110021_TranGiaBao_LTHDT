package bai8_lophoc;

public class Employee extends Person {
    private double heSoLuong;

    public Employee(String hoTen, String diaChi, double heSoLuong) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return heSoLuong * 1000;
    }

    public String danhGia() {
        if (heSoLuong >= 1.5) {
            return "Tốt";
        } else if (heSoLuong >= 1) {
            return "Khá";
        } else {
            return "Yếu";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nHệ số lương: " + heSoLuong + "\nTiền lương: " + tinhLuong() + "\nĐánh giá: "
                + danhGia();
    }
}
