package oops2;

public class OverLoad {
int a=10;
int b=10;
int c;
	
	public void Add() {
		
		System.out.println(a+b);
		
	}
	
	public void Add(int a ,int b) {
		System.out.println(a*b);
	}
	
	public void Add(int a ,int b,int c) {
		
		System.out.println(a+b+c);
	}
	
	
	public void Add(int a ,long b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		OverLoad over=new OverLoad();
		over.Add(10, 20, 30);
		over.Add(50, 70);
		over.Add();
	}
}
