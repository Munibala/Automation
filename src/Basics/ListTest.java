package Basics;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

public class ListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Logger log = Logger.getLogger(ListTest.class);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		log.info("System setProperty");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		log.info("set implicitwait");
		
		driver.manage().window().maximize();
		log.info("maximize window");
		
		driver.navigate().to("http://www.moneycontrol.com/");
		log.info("navigate to moneycontrol.com");
		
		WebElement home=driver.findElement(By.xpath("//*[@id='navbarSub']/nav/ul/li[1]/a/span"));
		home.click();
		log.info("click Home link");

		WebElement search=driver.findElement(By.id("search_str_cnbc"));
		log.info("created webelement 'search_str_cnbc'");
		
		//scroll to webelement using javascript
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", search);
		log.info("scroll to webelement 'search_str_cnbc' dropdown");
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", search);
		Thread.sleep(5000);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", search);
		
		log.info("highlighting 'search_str_cnbc' dropdown");
		
		Select s=new Select(driver.findElement(By.id("search_str_cnbc")));
		s.selectByVisibleText("Street Signs");
		
		log.info("select an option from 'search_str_cnbc' dropdown using List....");
		System.out.println("select an option from 'search_str_cnbc' dropdown using List....");
		List<WebElement> opt = s.getOptions();
		//Iterator<WebElement> o = s.getOptions().iterator();
		for (WebElement option:opt){
			System.out.println(option.getText());
			option.click();
			Thread.sleep(1000);
		}
		
	/*	while(o.hasNext()){
			System.out.println(o.next().getText());
			o.next().click();
		}*/
		
		//Using iterator
		log.info("select an option from 'search_str_cnbc' dropdown using iterator.....");
		System.out.println("select an option from 'search_str_cnbc' dropdown using iterator.....");
		WebElement d=driver.findElement(By.id("search_str_cnbc"));
		Iterator<WebElement> ss = d.findElements(By.tagName("option")).iterator();
		while(ss.hasNext())
		{
			System.out.println(ss.next().getText());
		}
		
		
		//Clicking of tab
		List<WebElement> tabs = driver.findElements(By.xpath("//*[@id='header']/div[2]/div[4]/div[1]/ul/li"));
				
		//Scroll to webelement 'Home'
		
		js.executeScript("arguments[0].scrollIntoView(true);", tabs.get(0));
		log.info("scroll to webelement 'Home'");
		(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOf(tabs.get(0)));
		
		
		/*for(WebElement tab:tabs){
			System.out.println(tab.getText());
			tab.click();
			Thread.sleep(2000);
		}
		*/
		
		driver.navigate().to("http://www.google.com");
		System.console();
		
		
	}

}
