package loops;

public class Prime {

	public static void main(String[] args) {
		
		int num=21;   
		
		int count =0;
		
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) { //count = 2
				
				count++;  //3 
			}	
			
		}
		
		if(count==2) {
			System.out.println("prime");
		}
		else
			System.out.println("not a prime");
	}
	
}
