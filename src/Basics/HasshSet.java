package Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HasshSet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] names={"muni","bala","chandra","bala","chittoor"};
		
		System.out.println("List...............");
		
		List<String> n= Arrays.asList(names);
		System.out.println(n);
		System.out.println();
		
		System.out.println("HashSet................");
		Set <String> s=new HashSet<String>(n);
		System.out.println(s);
		System.out.println();
		
		System.out.println("HashMap.....................");
		Map<String,Set<String>> m=new HashMap<>();
		m.put("cmbc", s);
		System.out.println(m);
		System.out.println();
		
		Map<String,String> mm =new HashMap<>();
		mm.put("c", "a");
		mm.put(null, "b");
		mm.put(null,"c");
		mm.put("a",null);
		System.out.println(mm);
		
	}

}
