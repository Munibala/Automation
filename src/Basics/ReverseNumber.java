package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		long num= in.nextInt();
		System.out.println("num=" + num);
		String temp = "";
		while(num%10!=0 || num!=0){
			temp=temp+num % 10;
			num=num/10;
		}
		System.out.println(temp);
		
		List c1=new ArrayList();
		c1.add("muni");
		c1.add(1);
		c1.add("bala");
		System.out.println(c1);
		
		for(int i=0;i<c1.size();i++){
			System.out.println(c1.get(i));
		}
		
		String s="muni bala chandra";
		String tem="";
		for (int j=s.length();j>=1;j--){
			//System.out.println(j);
			tem=tem+s.substring(j-1,j);
		}
		
		System.out.println(tem);
		//System.out.println(s.substring(16, 17));
			
	}	
	

	
	
}
