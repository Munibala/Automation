package classes;

public class Maruthi extends Car {

	Maruthi(String brand,String color){
		super(brand,color);
	}
	public static void main(String[] args) {
		
		/*
		 Is A relationship: it is a relationship between the parent class and 
		 child class, and the child class always has a is-a relationship to its parent class.
		 java inheritance is-a relationship. 
		 Implementation of inheritance(is-a relationship)
		 
		 Has-A relationship: relationship between two classes, where one class has initiated another class.
		 Car has engine object
		 Object composition (has-a relationship)
		 
		 */
		
		Maruthi m = new Maruthi("Maruthi","Silver");
		m.setGear(4);
		m.setSpeed(75);
		m.display();
		m.decreaseSpeed(75);
		m.display();
		Engine e=new Engine();
		e.start();
		e.stop();
	}

}
