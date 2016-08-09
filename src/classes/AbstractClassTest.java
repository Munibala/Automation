package classes;

abstract class Employee {
	public abstract void display();
	static int i;
	static void disp(){
		System.out.println("disp");
	}
	abstract void add();
	void substraction(){
		System.out.println("jhgjhgj");
	}
}

public class AbstractClassTest extends Employee {

	public static void main(String[] args) {
		AbstractClassTest e= new AbstractClassTest();
		e.display();
		e.disp();
		
		Employee e1=new AbstractClassTest();
		e1.display();
		e1.disp();
		
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e.equals(e1));
		
		
	}

	@Override
	public void display() {
		System.out.println("display");
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}

	
}
