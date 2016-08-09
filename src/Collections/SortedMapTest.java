package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



public class SortedMapTest {

	public static void main(String[] args) {
		//this will not keep the same order we inserted into HashTable.
		//displays descending order of the key
		Hashtable<Integer,String> ht= new Hashtable<Integer,String>();
		//this will not keep the same order we inserted into HashMap.
		//displays ascending order of the key
		HashMap<Integer, String> hm= new HashMap<Integer,String>();
		//this will  keep the same order we inserted into LinkedHashMap.
		//displays the same order of the key
		LinkedHashMap<Integer, String> lm= new LinkedHashMap<Integer,String>();
		//this will not keep the same order we inserted into HashMap.
		//displays ascending order of the key (natural order)
		TreeMap<Integer, String> tm= new TreeMap<Integer,String>();
		testMap(tm);
	
		hm.put(null, "hello");
		hm.put(1,null);
		hm.put(2,null);
		hm.put(null, "muni");
		
		System.out.println(hm);
	}

	public static void testMap(Map <Integer,String> map){
		map.put(9, "fox");
		map.put(7, "dog");
		map.put(1, "snake");
		map.put(8, "elephant");
		map.put(5, "monkey");
		map.put(3, "cow");
		
		for(Integer key: map.keySet()){
			String val = map.get(key);
			System.out.println("key:  "+key + " and value: "+val);
		}
	}
}
