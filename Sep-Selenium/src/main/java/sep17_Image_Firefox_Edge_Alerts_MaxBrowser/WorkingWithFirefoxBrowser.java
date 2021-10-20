package sep17_Image_Firefox_Edge_Alerts_MaxBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\firefox\\geckodriver.exe");
		
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
				
		
	}
}
