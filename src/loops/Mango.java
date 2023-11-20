package loops;

public class Mango {

	
	public static void main(String[] args) {
		
		int range =50;
		
		for(int i=1;i<=range;i++) {
			
			if((i%3==0) &&(i%5!=0)) { //15
				
				System.out.println(i+" "+"mango");
			}
			
			if((i%5==0) && (i%3!=0)){
				System.out.println(i+" "+"Orange");
			}
			
			
			if((i%3==0) && (i%5==0)) {
				System.out.println(i+" "+"mangoorange");
				
			}
			
		}
		
		
	}
	
	
}
