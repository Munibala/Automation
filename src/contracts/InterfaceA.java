package contracts;

public interface InterfaceA {
	static int id=7;
	int weight =85;
	
	public static void disp(){
		System.out.println("Static method");
	}
}
 interface InterfaceX{
	int x=10;
	void disp();
}
 interface InterfaceY{
	int x=20;
	void disp();
}
 abstract class abstractClasss implements InterfaceY {
	 
 }
 class Test2 implements InterfaceA,InterfaceX,InterfaceY {
	
	public static void main(String[] args) {
		InterfaceA.disp();
		System.out.println(InterfaceA.id);
		System.out.println(InterfaceA.weight);
		InterfaceX g=new Test2();
		System.out.println(g.x);
		//Derivative dd = new Derivative(6);
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
}