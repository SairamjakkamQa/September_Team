package oops2;

public class Cons {

	int empid;
	String empname;
	static String empcompany;

	public Cons(int empid, String empname, String empcompany) { // explicit

		this.empid = empid;
		this.empname = empname;
		this.empcompany = empcompany;

	}

//	public Cons() { //implicit 
//		
//	}

	public void display() {

		System.out.println(empid + " " + empname + " " + empcompany);
	}

	public static void main(String[] args) {

		Cons c1 = new Cons(100, "vinod", "marolix");

		c1.display();

		Cons c2 = new Cons(101, "Mourya", empcompany);
		c2.display();
		Cons c3 = new Cons(102, "Divya", empcompany);
		c3.display();

	}

}
