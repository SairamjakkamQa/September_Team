package test;

public class Unary {

	public static void main(String[] args) {

		int x=100;
		int y=150;
		int z=200;
		
		int maximum=(x<z)? ((x>y)?x:y) : ((z>y)? z : y);
		

		System.out.println(maximum);
	}

}
