package immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<MutablePoint> startloc=new ArrayList<MutablePoint>();
		List<MutablePoint> endloc=new ArrayList<MutablePoint>();
		
		MutablePoint mylocation = new MutablePoint(1,1);
		MutablePoint yourlocation = new MutablePoint(10,20);
		
		startloc.add(mylocation);
		startloc.add(yourlocation);
		
		System.out.println("start locations: "+ Arrays.toString(startloc.toArray()));
		
		mylocation.setx(100);
		mylocation.sety(100);
		
		yourlocation.setx(-10);
		yourlocation.sety(-20);
		
		endloc.add(mylocation);
		endloc.add(yourlocation);
		
		System.out.println("end locations: "+ Arrays.toString(endloc.toArray()));
		
		System.out.println("start locations: "+ Arrays.toString(startloc.toArray()));
	}

}
