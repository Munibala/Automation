package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

interface Search {
	public static final int i=2;
	
	default void display(){
		System.out.println("default method: display in interface");
	}
	static void myDisplay(){
		System.out.println("static method in Search interface");
	}
	interface searcyByInput{
		void feed();
	}
	
	void givenInput();
}


class Searching extends ChromeDriver {
	private WebElement findElement(WebDriver webDriver, By by, int timeout){
		return null;
		
	}
}
