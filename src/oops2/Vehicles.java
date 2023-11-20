package oops2;

public class Vehicles {

	
	int empid=127;
	
	public void car() {  //non-static
		System.out.println("Cars");
	}
	
	static void m1() { //static 
		
		System.out.println("My name is John");
		
		
		
	}

	public void demo() {  //non static method
		m1();
		car();
		
	}
	
	
	
	public static void main(String[] args) {
		
	m1();
	
		
	}
	
	
	
}
