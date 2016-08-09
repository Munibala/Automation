package contracts;

interface xyz {
	default void display(){
		System.out.println("xyz default method");
	}
	static void disp()
	{
		System.out.println("xyz static method");
	}
}
interface abc {
	default void display(){
		System.out.println("abc default method");
	}
	static void disp()
	{
		System.out.println("abc static method");
	}
}
interface gk {
	default void display(){
		System.out.println("gk default method");
	}
	static void disp()
	{
		System.out.println("gk static method");
	}
}

public class InterfaceDefaultMethods implements xyz,abc,gk {
	
	
	public void display(){
		xyz.super.display();
		abc.super.display();
		gk.super.display();
		System.out.println("concrete default method");
		
		xyz.disp();
		abc.disp();
		gk.disp();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDefaultMethods t = new InterfaceDefaultMethods();
		t.display();
		
		
	}

}
