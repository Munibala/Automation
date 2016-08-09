package com.exception.handler;

 class Handler implements Thread.UncaughtExceptionHandler {
	
	public void uncaughtException(Thread t, Throwable e){
		System.out.println("Throwable: " + e.getMessage());
		//System.out.println("Throwable: stackTrace" + e.getStackTrace());
		//System.out.println("Throwable: stackTrace" + e.getLocalizedMessage());
		System.out.println(t.toString());
		
	}
}

 class SomeThread implements Runnable {
	public void run(){
		throw new RuntimeException("Thrown from Thread.");
	}
}