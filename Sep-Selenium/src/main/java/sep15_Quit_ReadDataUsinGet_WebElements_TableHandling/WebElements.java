package sep15_Quit_ReadDataUsinGet_WebElements_TableHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		driver.get("http://automationpractice.com/index.php");
		
		String searchText = "Jeans";
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='search_query_top']//following-sibling::button"));
		
		searchBox.sendKeys(searchText);
		searchButton.click();
		
		driver.close();
		
		
	}

}
