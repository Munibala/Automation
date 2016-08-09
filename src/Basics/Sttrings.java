package Basics;

public class Sttrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"muni","bala","chandra"};
		String[] temp=names;
		for(String s:temp){
			if(s.startsWith("c"))
			System.out.println(s.toUpperCase());
			if(s.endsWith("a"))
				System.out.println(s.toUpperCase());
		}
		System.out.println(names.toString());
		String name="munibalachandra";
		System.out.println("substring.........");
		System.out.println(name.substring(0, 4));
		System.out.println(name.indexOf('c'));
		
	}

}
