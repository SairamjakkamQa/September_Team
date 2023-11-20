package oops;

public class Employe {

	String empname;
	int empid;
	int salary;
	
	
	public void setdata(String ename,int id,int sal) {
		
		empname=ename;
		empid=id;
		salary=sal;
	}
	
	public void display() {
		System.out.println(empname+" "+empid+" "+salary);		
	}
	
	public static void main(String[] args) {
		
		Employe emp1=new Employe();
		emp1.setdata("sairam", 127, 5000);
		emp1.display();
		
	}
	
	
}
