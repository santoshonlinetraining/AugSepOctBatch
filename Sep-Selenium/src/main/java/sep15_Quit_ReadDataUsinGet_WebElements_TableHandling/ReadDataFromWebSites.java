package sep15_Quit_ReadDataUsinGet_WebElements_TableHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadDataFromWebSites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		driver.get("http://automationpractice.com/");

		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("santosh@test.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		String loginText = "MY ACCOUNT";
		
		WebElement getLoginText = driver.findElement(By.xpath("//h1[contains(text(),'My account')]"));
		String afterLoginText = getLoginText.getText();
		
		System.out.println(afterLoginText);
		
		if(loginText.equals(afterLoginText)) {
			System.out.println("TEstcase pass");
		} else {
			System.out.println("Testcase fail");
		}
		
		String accountInfo = driver.findElement(By.xpath("//p[@class='info-account']")).getText();
		System.out.println(accountInfo);
		
	}

}
