package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MyExceptionHandle extends PrintStream{
    public MyExceptionHandle(File file) throws FileNotFoundException {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public static void main(String a[]){
        try{
            for(int i=5;i>=0;i--){
                System.out.println(10/i);
            }
            System.out.println("continued...");
        } catch(Exception ex){
            System.out.println("Exception Message: "+ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("After for loop...");
        
    }
}

