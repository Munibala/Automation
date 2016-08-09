package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ScrollView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.moneycontrol.com/");
		driver.findElement(By.xpath("//*[@id='navbarSub']/nav/ul/li[1]/a/span")).click();

		WebElement search=driver.findElement(By.id("search_str_cnbc"));
		
		Actions aa=new Actions(driver);
		aa.moveToElement(search).click().build().perform();
		
		JavascriptExecutor jss= JavascriptExecutor(driver);
		
		jss.executeScript("argument[0].ScrollIntoView(true)", search);

		//scroll to webelement using javascript
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", search);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", search);
		Thread.sleep(5000);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", search);

		Select s=new Select(driver.findElement(By.id("search_str_cnbc")));
		s.selectByVisibleText("Street Signs");

		//scroll to webelement using Actions class
		Actions action = new Actions(driver);	
		action.moveToElement(driver.findElement(By.id("search_str_cnbc"))).perform();
	}

	private static JavascriptExecutor JavascriptExecutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
