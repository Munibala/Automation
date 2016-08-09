import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.google.common.hash.HashCode;


public class InputReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Scanner
		
		/*Scanner sn = new Scanner(System.in);
		System.out.println(sn.next());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());*/
		
		InputStreamReader i=new InputStreamReader(System.in);
		System.out.println(i.read());
		
		/*String myName="muni";
		int thash=myName.hashCode();
		System.out.println(thash);
		myName="bala";
		int ahash=myName.hashCode();
		System.out.println(ahash);*/
		
	}

}
