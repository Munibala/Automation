package Basics;

public abstract class Master implements verifySearch{

	public abstract void display();
	void displayResult(){
		System.out.println("display results in abstract class");
		verifySearch.super.display();
	}
	
	
}
