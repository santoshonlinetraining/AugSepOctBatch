package sep13_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Ex {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		//get, getCurrentUrl, getTitle, getPageSource
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Shirts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
				
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("T-Shirst");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
		
		
		driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).sendKeys("Jeans");
			
		
		
	}
}
