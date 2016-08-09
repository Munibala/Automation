package classes;

abstract class Person{  
	  abstract void eat();
	  
	} 
public class TestAnonymousInner {

	public static void main(String[] args) {
		// Anonymous class
		Person p = new Person(){
			void eat(){System.out.println("eat me");}
		};
		
		
		
		p.eat();
		p=null;
	}

	
}
