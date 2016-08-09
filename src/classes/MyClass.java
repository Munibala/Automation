package classes;

import classes.MyClass.myInterface.interfaceClass;

public class MyClass {
	{
		System.out.println("initialize block..........");
	}
	static void staticMethod(){
		System.out.println("static method");
	}
	MyClass(){
		System.out.println("Constructor with no parameters.");
		
	}
	MyClass(int i){
		this();
		System.out.println("Constructor with one parameter.");
		
	}
	MyClass(int i,int j){
		this(i);
		System.out.println("Constructor with 2 parameters integer.");
	}
	MyClass(int i, int j,int k){
		this(i,j);
		System.out.println("Constructor with 3 parameters integer.");
		
	}
	
	public void mMethod(){
		System.out.println("mMethod");
		class methodClass{
			void localMethod(){
				System.out.println("local method");
			}
		}
		
		methodClass mmm= new methodClass();
		mmm.localMethod();
	}
	
	
	interface myInterface{
		String var="interface inside a class";
		void display();
		default void myDefault(){
			System.out.println("default method in interface");
		}
		static void staticMethod(){
			System.out.println("static method in interface");
		}
		
		class interfaceClass{
			void printn(){
				System.out.println("Class inside interface inside class");
			}
		}

	}
	
	static class Stinnerclass{
		void display(){
			System.out.println("its a static inner class!");
		}
	}
	
	class innerclass{
		void display(){
			System.out.println("its an inner class!");
		}
	}
	
	public static void main(String...args){
		
		MyClass m=new MyClass(1,2,3);
		MyClass.staticMethod();
		MyClass.Stinnerclass nn= new MyClass.Stinnerclass();
		nn.display();
		
		MyClass.innerclass nnn = m.new innerclass();
		nnn.display();
		
		checkTest test1=new checkTest();
		test1.display();
		test1.myDefault();
		MyClass.myInterface.staticMethod();
		MyClass.myInterface.interfaceClass jj = new interfaceClass();
		jj.printn();
		
		MyClass.innerclass kj = m.new innerclass();
		m.mMethod();
	}
}
class checkTest implements MyClass.myInterface {
	@Override
	public void display() {
		System.out.println("checkTest class implemented MyClass.myInterface");
	}
}

