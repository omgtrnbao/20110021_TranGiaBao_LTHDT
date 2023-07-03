package bai8_lophoc;

public class Person {
	private String hoTen;
    private String diaChi;
    

    public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

	@Override
    public String toString() {
        return "Họ và tên: " + hoTen + "\nĐịa chỉ: " + diaChi;
    }
}


