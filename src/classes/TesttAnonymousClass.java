package classes;

class ProgrammerInterview {
	void practice(){
		System.out.println("normal class");
	}
	 void display(){
		System.out.println("hello class");
	}
}
public class TesttAnonymousClass {

	public static void main(String[] args) {
		ProgrammerInterview p;
		try{
		 p = new ProgrammerInterview(){
			public void display(){
				System.out.println("hello anonymous class");
			}
		};

		p.practice();
		p.display();
		}catch(Exception e){
			
		}finally{
			
		}
	}
	
}
/*
What is the purpose of an anonymous inner class?

You have seen now that by creating an anonymous inner class, 
we can override one or more methods of a superclass. 
In our example above, the superclass is the ProgrammerInterview class, 
and the method being overridden is the read() method.

But, we could have easily done the same thing by just creating a separate class, 
having it extend the ProgrammerInterview class, and then just override the read() method. 
So, what is the need to create an anonymous inner class when we could have done the same thing using a normal, 
separate class?

Well, the main thing is that it is quicker to just create an anonymous inner class rather than 
create a new separate class. Anonymous inner classes are especially useful when 
you only need to override a small amount of functionality (like just one method) in a superclass, 
and don’t want to deal with the overhead of creating an entire class for something so simple.
*/