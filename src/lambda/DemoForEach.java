package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class DemoForEach extends Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		values.forEach(i -> System.out.println(i)); // lambda
		String[] names={"muni","bala","chandra",
									"nalini","ushasri","durga shankar"};
		
		int iSize= names.length;
		for(int i=0;i<iSize;i++){
			System.out.println("names["+i+"]="+names[i].toLowerCase()+" ; hashCode= "+names[i].hashCode());
			
			List<String> Names=Arrays.asList(names);
			
			Names.forEach(name -> System.out.println(name));
			
		}
		
	}

}
