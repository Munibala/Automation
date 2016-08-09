package lambda;

interface A {
	void show();
}

class xyz implements A{

	@Override
	public void show() {
		System.out.println("interface show method from concrete class");
	}
	
}
public class LambdaDemo {

	public static void main(String[] args) {
	
	// normal way
		A a0 = new xyz();
		a0.show();
		System.out.println(a0.hashCode());
	// anonymous class
		A a = new A(){
			public void show(){
				System.out.println("interface show method from anonymous class");
			}
		};
		a.show();
		
	// lamba expression
		
		A a1 = () -> System.out.println("lambda expression");
		a1.show();
	}

}
