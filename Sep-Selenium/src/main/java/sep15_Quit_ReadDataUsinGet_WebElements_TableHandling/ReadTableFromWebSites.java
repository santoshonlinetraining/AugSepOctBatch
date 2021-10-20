package sep15_Quit_ReadDataUsinGet_WebElements_TableHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadTableFromWebSites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> TableColum = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		
		System.out.println(" " + TableColum.size());
		
		for(int i=0; i<TableColum.size(); i++) {
			
			String contactName = TableColum.get(i).getText();
			System.out.println("Contact name is " + contactName);
			
		}
		
		
	}

}
