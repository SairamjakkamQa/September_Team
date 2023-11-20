package abstraction;

public class Ecommerce implements Demo {

	@Override
	public void Login() {
		System.out.println("Login functionality is working fine");
	}

	@Override
	public void Signup() {
		System.out.println("Signup functionality is working fine");
	}

	@Override
	public void Cart_functionality() {
		System.out.println("Cart functionality is working fine");
	}

	@Override
	public void Wishlist() {
		
	}

	@Override
	public void Search() {
		
	}

	public static void main(String[] args) {
		
		Ecommerce e=new Ecommerce();
		e.Login();
		e.Signup();
		e.Cart_functionality();
		e.Search();
		e.Wishlist();
	}
	
	
	
	
}



