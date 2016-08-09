package Basics;

public class Test1 extends Master{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3;
		System.out.println(i);
		System.out.println(Search.i);
		
		Test1 y=new Test1();
		y.display();
	
		Search.myDisplay();
	}

	@Override
	public void searchResult() {
		// TODO Auto-generated method stub
		
	}
	

	void myDisplay(){
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.displayResult();
	}

	@Override
	public void givenInput() {
		// TODO Auto-generated method stub
		
	}

	

}
