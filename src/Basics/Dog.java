package Basics;
import java.time.LocalDateTime;

import contracts.Animal;
import contracts.Vehicle;
public class Dog implements Animal, Vehicle {

	public void eat(){
		System.out.println("eat");
	}
	
	public void walk(){
		System.out.println("walk");
		
	}
	
	public void disp(){
		System.out.println(Animal.i);
		System.out.println(Vehicle.i);
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		dog.walk();
		//System.out.println(dog.age);
		//dog.age=10;
		dog.disp();
		dog.printWork();
		System.out.println("tostring :"+ dog.toString());
		
		
	}

	@Override
	public LocalDateTime getLocalDateTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
