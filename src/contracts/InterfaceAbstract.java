package contracts;

interface A{
	
	void display();
}

abstract class B{
	abstract void display();
}

abstract class C{
	
	void display(){
		abstract class ui {
			
		}
		
	}
}

public class InterfaceAbstract extends B implements A{

	public static void main(String[] args) {
		InterfaceAbstract c = new InterfaceAbstract();
		c.display();
		B b = new InterfaceAbstract();
		b.display();
		
		A a = new InterfaceAbstract();
		a.display();
	}

	public void display() {
		System.out.println("override");
		
	}

	

}
