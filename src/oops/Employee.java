package oops;

public class Employee {

	String empname;
	int empid;
	int salary;
	
	void display() {
		
		System.out.println(empname+" "+empid+" "+salary);
	}
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.empname="sairam";
		emp1.empid=127;
		emp1.salary=50000;
		emp1.display();
		
		
	}
	
	
	
}
