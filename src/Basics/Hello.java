package Basics;

import contracts.InterfaceA;
import contracts.InterfaceB;

public class Hello implements InterfaceA, InterfaceB {
	
	public static void disp(){
		System.out.println("Static method in Hello class");
	}

	public static void main(String[] args){
		
		Hello.disp();
	}
}
