package oops2;

public class Childs extends Parents {

	public String dog = "lab";

	public void display() {
		System.out.println(super.dog);
	}

	public static void main(String[] args) {

		Childs ch = new Childs();
		ch.display();

	}

}
