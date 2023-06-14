package bai07_trang26;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class SoftwareHouse {
	private String theName;
	private ArrayList<Employee> dsNV;
	public enum eLoaiNV {ALL, Programmer, ProjectLeader, Administrator};
	
	public SoftwareHouse(String theName) {
		super();
		this.theName = theName;
		dsNV = new ArrayList<Employee>();
	}
	
	public void addStaff(Employee nv) {
		boolean flag = true;
		for(Employee emp : dsNV) {
			if(emp.getThePayrollNumber() == nv.getThePayrollNumber()) {
				flag = false;
				System.out.println("Mã nhân viên đã tồn tại!");
				break;
			}
		}
		
		if(flag == true) {
			dsNV.add(nv);
			System.out.println("Thêm thành công!");
		}
	}
	
	public void displayAllStaff(eLoaiNV loai) {
		switch(loai) {
		case ALL:
			inTieuDe(eLoaiNV.ALL);
			for(Employee emp : dsNV) {
				System.out.println(emp.toString());
			}
			break;
		case Programmer:
			inTieuDe(eLoaiNV.Programmer);
			for(Employee emp : dsNV) {
				if(emp instanceof Programmer) System.out.println(emp.toString());
			}
			break;
		case ProjectLeader:
			inTieuDe(eLoaiNV.ProjectLeader);
			for(Employee emp : dsNV) {
				if(emp instanceof ProjectLeader) System.out.println(emp.toString());
			}
			break;
		case Administrator:
			inTieuDe(eLoaiNV.Administrator);
			for(Employee emp : dsNV) {
				if(emp instanceof Administrator) System.out.println(emp.toString());
			}
			break;
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void getMonthlySalaryBill(eLoaiNV loai) {
		float tongTien = 0;
		
		switch(loai) {
			case ALL:
				for(Employee emp : dsNV) {
					tongTien += emp.getMonthlySalary();
				}
				break;
			case Programmer:
				for(Employee emp : dsNV) {
					if(emp instanceof Programmer) tongTien += emp.getMonthlySalary();
				}
				break;
			case ProjectLeader:
				for(Employee emp : dsNV) {
					if(emp instanceof ProjectLeader) tongTien += emp.getMonthlySalary();
				}
				break;
			case Administrator:
				for(Employee emp : dsNV) {
					if(emp instanceof Administrator) tongTien += emp.getMonthlySalary();
				}
				break;
		}
		
		System.out.println("Tổng tiền phải trả cho " + loai + " là: " + formatUSD(tongTien));
	}
	
	public void sortAllStaffByName() {
		dsNV.sort(Comparator.comparing(Employee::getTheName));
		displayAllStaff(eLoaiNV.ALL);
	}
	
	public void updateDepartmentForAdmin(int aPayrollNo, String deptNew) {
		boolean flag = true;
		
		if(aPayrollNo == 0) {
			System.out.println("Cập nhật thất bại!\nMã nhân viên phải > 0");
			flag = false;
		}
		if(deptNew.trim().length() == 0){
			System.out.println("Cập nhật thất bại!\nBộ phận mới phải có giá trị");
			flag = false;
		}
		
		if(flag == true) {
			for(Employee emp : dsNV) {
				if(emp instanceof Administrator && emp.getThePayrollNumber() == aPayrollNo) {
					((Administrator)emp).setTheDepartment(deptNew);
					System.out.println("Cập nhật thành công phòng ban " + deptNew + " cho nhân viên " + aPayrollNo);
				}
			}
		}
	}
	
	public void deleteEmployee(int aPayrollNo) {
		boolean flag = true;
		
		if(aPayrollNo == 0) {
			System.out.println("Cập nhật thất bại!\nMã nhân viên phải > 0");
			flag = false;
		}
		
		if(flag == true) {
			for(Employee emp : dsNV) {
				if(emp.getThePayrollNumber() == aPayrollNo) {
					dsNV.remove(emp);
					System.out.println("Xóa thành công nhân viên có mã " + aPayrollNo);
					break;
				}
			}
		}
	}
	
	public String formatUSD(float money) {
		String str = "";
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	    str = currencyFormat.format(money);
	    return str;
	}
	
	public void inTieuDe(eLoaiNV loai) {
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
		switch(loai) {
			case ALL:
				System.out.println(String.format("| %-20s | %-20s | %-30s | %-30s | %-30s |", "PayrollNumber", "TheName", "TheBasicMonthlySalary", "MonthlySalary", "Department      -     Language"));
				break;
			case Programmer:
				System.out.println(String.format("| %-20s | %-20s | %-30s | %-30s | %-30s |", "PayrollNumber", "TheName", "TheBasicMonthlySalary", "MonthlySalary", "Language"));
				break;
			case ProjectLeader:
				System.out.println(String.format("| %-20s | %-20s | %-30s | %-30s | %-30s |", "PayrollNumber", "TheName", "TheBasicMonthlySalary", "MonthlySalary", "Language"));
				break;
			case Administrator:
				System.out.println(String.format("| %-20s | %-20s | %-30s | %-30s | %-30s |", "PayrollNumber", "TheName", "TheBasicMonthlySalary", "MonthlySalary", "Department"));
				break;
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}
}
