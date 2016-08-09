package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class jsEg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.navigate().to("http://money.rediff.com/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement we = driver.findElement(By.className("senstab_sel"));
		
		
		fnHighlightMe(driver,we);
		WebElement we1 = driver.findElement(By.className("senstab_normal"));
		fnHighlightMe(driver,we1);
		
		
		List<WebElement> lst= driver.findElements(By.className("shcatlink"));
		
		for(int i=0;i<lst.size();i++)
		{
			fnHighlightMe(driver,lst.get(i));
		}
		WebElement more=driver.findElement(By.className("blue curhand"));
		fnHighlightMe(driver,more);
		
		more.click();
		if (driver.findElement(By.className("moremoney")).isDisplayed()){
			System.out.println("more links displayed");
		}
		else
			System.out.println("more links not displayed.");
		
		
		
		/*List<WebElement> lst1= driver.findElements(By.className("boxcol"));
		
		for(int i=0;i<lst.size();i++)
		{
			fnHighlightMe(driver,lst1.get(i));
		}*/
		
		
		
		
	}

	
	public static void fnHighlightMe(WebDriver driver,WebElement element) throws InterruptedException{
		  //Creating JavaScriptExecuter Interface
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   for (int iCnt = 0; iCnt < 2; iCnt++) {
		      //Execute javascript
			   js.executeScript("arguments[0].scrollIntoView(true);", element);
			   	
		         js.executeScript("arguments[0].style.border='2px groove green'", element);
		         js.executeScript("arguments[0].style.background='#009966'", element);
		         
		         Thread.sleep(200);
		         js.executeScript("arguments[0].style.border=''", element);
		         js.executeScript("arguments[0].style.background=''", element);
		   }
		 }
	
}
