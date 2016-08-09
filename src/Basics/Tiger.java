package Basics;

import java.io.PrintStream;

public class Tiger extends Animal{
	
	 static void run(){
		System.out.println("Static method in Tiger");
	}

	public static void main(String[] args){
		
		Tiger.run();
		System.out.println(Animal.cruiel);
		Animal.cruiel=false;
		System.out.println(Animal.cruiel);
		System.out.println(Animal.cruiel);
		
	}
}
