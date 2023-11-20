package strings;

public class Differenc {

	
	public static void main(String[] args) {
		
		String str1=new String("car");
		
		String str2=new String("Car");
		
		System.out.println(str1==str2); //false
		
		System.out.println(str1.equalsIgnoreCase(str2)); //true
		
	}
	
	
}
