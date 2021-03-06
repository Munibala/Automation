package com.strings;

public class MyArrayCopy {

	public static void main(String[] args) {
		try{
		char ch[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
        /**
         * We can copy a char array to a string by using
         * copyValueOf() method.
         */
        String chStr = String.copyValueOf(ch);
        
        System.out.println(chStr);
        /**
         * We can also copy only range of charactors in a
         * char array by copyValueOf() method.
         */
        String subStr = String.copyValueOf(ch,3,4);
        System.out.println(subStr);

        String subSt = String.copyValueOf(ch,3,12);
        System.out.println(subSt);
        
        System.out.println(chStr.matches("M.*"));
		}catch(Exception e){
			System.out.println(e.toString());
		}finally{
			System.out.println("finally");
		}
	}

}
