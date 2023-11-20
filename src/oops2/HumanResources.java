package oops2;

public class HumanResources extends Organisation{
	
	public static void main(String[] args) {
		
		HumanResources hr=new HumanResources();
		hr.setEmpname("demo");
		hr.setEmpid(127);
		
		
		System.out.println(hr.getEmpid());
		System.out.println(hr.getEmpname());
		
	}
	
	
	
	
}
