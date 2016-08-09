package Initializers;

public class Instance {
	int a,b,c,d;
	//Initializer block
	{
		a=1;
		b=2;
		c=-1;
	}

	Instance(){
		c=a+b;
		
	}
	Instance(int a){
		d=c+a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Instance i=new Instance();
			System.out.println(i.c);
			Instance j=new Instance(10);
			System.out.println(j.d);
	}

}
