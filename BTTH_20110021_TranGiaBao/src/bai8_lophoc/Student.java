package bai8_lophoc;

public class Student extends Person {
    private double diemMonHoc1;
    private double diemMonHoc2;

    public Student(String hoTen, String diaChi, double diemMonHoc1, double diemMonHoc2) {
        super(hoTen, diaChi);
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
    }

    public double tinhDiemTrungBinh() {
        return (diemMonHoc1 + diemMonHoc2) / 2;
    }

    public String danhGia() {
        double diemTrungBinh = tinhDiemTrungBinh();
        if (diemTrungBinh >= 8) {
            return "Giỏi";
        } else if (diemTrungBinh >= 6.5) {
            return "Khá";
        } else if (diemTrungBinh >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nĐiểm môn học 1: " + diemMonHoc1 + "\nĐiểm môn học 2: " + diemMonHoc2
                + "\nĐiểm trung bình: " + tinhDiemTrungBinh() + "\nĐánh giá: " + danhGia();
    }
}
