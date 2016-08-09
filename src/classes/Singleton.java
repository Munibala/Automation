package classes;

public class Singleton {
	
	private Singleton(){
		System.out.println("private constructor");
	}

	public static void main(String[] args) {
		Singleton st=new Singleton();
		Singleton stt=new Singleton();
	}

	
}

class testt{
	
}
/*
We can make constructor as private. So that We can not create an object outside of the class.
This property is useful to create singleton class in java.
Singleton pattern helps us to keep only one instance of a class at any time.
The purpose of singleton is to control object creation by keeping private constructor.
- See more at: http://www.java2novice.com/java_constructor_examples/singleton/#sthash.r8geWKPN.dpuf
*/