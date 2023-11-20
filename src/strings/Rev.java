package strings;

public class Rev {

	public static void main(String[] args) {
		
		
		String str="Marolix";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {   //x
			
			rev=rev+str.charAt(i); // xiloram
		
		}
		
		System.out.println(rev);
	}
	
	
	
	
}
