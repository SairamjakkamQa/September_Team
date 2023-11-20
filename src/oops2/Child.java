package oops2;

public class Child extends Parent {

	public void Vehicle() {
		System.out.println("car");
	}
	
	public static void main(String[] args) {
		
		Parent ch=new Child();
		
		ch.Vehicle();
		ch.Water();
		
	}
	
}
