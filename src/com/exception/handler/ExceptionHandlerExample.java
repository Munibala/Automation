package com.exception.handler;


public class ExceptionHandlerExample {

	public static void main (String[] args) throws InterruptedException{
		
		Addition m = new Addition();
		System.out.println(m.add(1,2,3,4,5,6,7,8,9,10));
		System.out.println(m.add(1.7f,2,3.4f,4,5,6.2f,7,8,9,10.5f));
	    Handler handler = new Handler();
	    Thread.setDefaultUncaughtExceptionHandler(handler);

	    Thread t = new Thread(new SomeThread(), "Some Thread");
	    t.start();
	    
	    int a=10,b;
	    b=a/0;
	    
	    
	    Thread.sleep(100);

	    throw new RuntimeException("Thrown from Main");
	}

}

