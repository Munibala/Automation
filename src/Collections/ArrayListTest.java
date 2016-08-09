package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
	
		ArrayList<Integer> vals=new ArrayList<Integer>();
		vals.add(10);
		vals.add(20);
		vals.add(30);
		/*
		for (int i:vals){
			System.out.println(i);
		}*/
		
		vals.remove(1);
		for (int i=0;i<vals.size();i++)
		{
			System.out.println(vals.get(i));
		}
	}

}
