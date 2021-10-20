package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Santosh\\\\Automation\\\\Workspace_new\\\\Sep-Selenium\\\\drivers\\\\chrome\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
	
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//img[@class='logo img-responsive']")).click();
		
	}
}
