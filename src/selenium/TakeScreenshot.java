package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
	        driver.get("http://www.google.com/");

	        try{
	            //take screenshot and save it in a file
	            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	            //copy the file to the required path
	            FileUtils.copyFile(screenshot,new File("D:\\screenshot.jpeg"));

	        }catch(Exception e){
	            //if it fails to take screenshot then this block will execute
	            System.out.println("Failure to take screenshot "+e);

	        }
	        finally
	        {
	            //Whatever happens with the screenshot, driver will quit.
	            driver.quit();
	        }
	}

}
