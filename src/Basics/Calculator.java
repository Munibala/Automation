package Basics;

public class Calculator {

	public int add(int a, int b){
		return a+b;
	}
	
	public float add(float a,int b){
		return a+b;
	}
	
	public double add(double a, double b){
		return a+b;
	}
	
	
	public static void main (String[] args){
		Calculator c1=new Calculator();
		System.out.println(c1.add(10, 20));
		System.out.println(c1.add(10.5, 10.4));
		System.out.println(c1.add(2.6f, 5.4f));
		
	}
	
}
