package jaswithp;

public class empsalary {
	private double salary;
	
	void setEmployeesalary(double s) {
		salary=s;
	}
	
	double getEmployeesalary(){
		return salary;
	}
	
	
	public static void main(String[] args) {
		empsalary emp=new empsalary();
		emp.setEmployeesalary(100000);
		System.out.println(emp.getEmployeesalary());
		
	}
	
}




