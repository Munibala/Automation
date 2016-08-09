package files.open.read.write;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

public class TextFileManager {

	public static void main(String[] args) throws IOException {
		
		final String filename="C:\\Users\\30410\\Desktop\\cover lettr.txt";
		
		BufferedReader bf = new BufferedReader(new FileReader(filename));
		
		
		//StringBuilder sb = new StringBuilder();
		String line = bf.readLine();
		while(line!=null){
			System.out.println(line);
			line=bf.readLine();
			
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Scanner sc=new Scanner(new FileReader(filename));
		
		while (sc.hasNext()){
			System.out.println(sc.nextLine());
			sc.next();
		}
	
		System.out.println("-------------------------------------------------------------------------------------------");
		
		FileInputStream inputStream = new FileInputStream(filename);
		try {
		    String everything = IOUtils.toString(inputStream);
		} finally {
		    inputStream.close();
		}
	}

}
