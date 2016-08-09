package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.lang.model.type.IntersectionType;

public class SetTest {

	public static void main(String[] args) {
		//doesn't retain order
		//eliminates duplicates and stores unique values
		//no error thrown if try to add duplicate values
			//Set<String> mySet = new HashSet<String>();
		//
		//Set<String> mySet = new LinkedHashSet<String>();
		//natural order
			Set<String> mySet = new TreeSet<String>();
			mySet.add( "fox");
			mySet.add("dog");
			mySet.add("snake");
			mySet.add("elephant");
			mySet.add("fox");
			mySet.add("monkey");
			mySet.add("cow");
			
			System.out.println(mySet);
			
			/////iteration
			for(String element:mySet){
				System.out.println(element);
			}
			
			// contains
			
			System.out.println(mySet.contains("snake"));
			
			//isEmpty
			if (mySet.isEmpty())
				System.out.println("set is empty");
	
			///intersection
			
			Set<String> mySet1 = new TreeSet<String>();
			mySet1.add( "fox");
			mySet1.add("dog");
			mySet1.add("snake");
			mySet.add("giraffe");
			mySet1.add("fox");
			System.out.println(mySet1);
			Set<String> mySet2 = new TreeSet<String>(mySet);
			mySet2.retainAll(mySet1);
			System.out.println(mySet2);
			
	}

}
