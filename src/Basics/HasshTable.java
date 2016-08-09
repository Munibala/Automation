package Basics;

import java.util.Hashtable;

public class HasshTable {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		try{
			
		
		Hashtable<Integer, String> t = new Hashtable<Integer, String>();
		t.put(1, "muni");
		t.put(2, "bala");
		t.put(3, "chandra");
		//t.put(3,null);
		//t.put(null,"hello");
		int count=t.size();
		System.out.println("Count "+ count);
		
		for(Object e:t.values())
		{
			System.out.println(e.toString());
		}
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage() + e.getLocalizedMessage());
		}
	}

}
