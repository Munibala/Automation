package immutable;

import java.util.List;

/*
Note: The String class is immutable, so that once it is created a String object cannot be changed. 
The String class has a number of methods, some of which will be discussed below, 
that appear to modify strings. Since strings are immutable, 
what these methods really do is create and return a new string that contains the result of the operation.
*/
public class TestImmutable {

	public static void main(String[] args) {
		
		ImmutableRGB im=new ImmutableRGB(1,1,1,"muni");
		System.out.println(im.getRGB());
		System.out.println(im.getName());
		System.out.println(im.red);
		
		float floatVar=12.4f;
		int intVar=11;
		String stringVar="hello";
		System.out.printf("The value of the float " +
                "variable is %f, while " +
                "the value of the " + 
                "integer variable is %d, " +
                "and the string is %s\n", 
                floatVar, intVar, stringVar); 


		String fs;
		fs = String.format("The value of the float " +
                 "variable is %f, while " +
                 "the value of the " + 
                 "integer variable is %d, " +
                 " and the string is %s",
                 floatVar, intVar, stringVar);
		System.out.println(fs);
				
		StringBuffer sb= new StringBuffer("hello ");
		sb.append("String Buffer");
		sb.reverse();
		System.out.println(sb);
		
		String[] ss= fs.split("value");
		System.out.println(ss.length);
		
	}

		
}
