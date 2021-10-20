package sep17_Image_Firefox_Edge_Alerts_MaxBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlertsConfirmEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
		String alertString;
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(5000);
		alertString = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertString);
		
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(5000);
		alertString = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println(alertString);
		

		
		
	}
}
