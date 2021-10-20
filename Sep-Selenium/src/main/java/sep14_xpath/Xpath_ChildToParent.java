package sep14_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_ChildToParent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Jeans");
		driver.findElement(By.xpath("//input[@id='search_query_top']/parent::form")).sendKeys("Jeans");
		
		
	}

}
