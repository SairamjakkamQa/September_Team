package loops;

public class Fiblonacci {

	public static void main(String[] args) {
		  
		int a=0;
		int b=1;
		int range =5;
		
		for(int i=0;i<=range;i++) {
			
			System.out.print(a+" ");  // 0 1 1 2 
			
			int next=a+b;       // 1 2 3  5
			a=b; // a=1 1  2   3
			b=next; // b=1 2 3 5
			
			
			
		}
		
		
	}
	
	
	
	
}
