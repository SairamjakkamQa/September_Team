package oops2;

public class Dogchild extends Dog {

	public void car() {

		System.out.println("Chevrolet");

	}

	public void display() {

		super.car();
	}

	public static void main(String[] args) {
		Dogchild d = new Dogchild();
		d.display();
		d.car();
	}
}
