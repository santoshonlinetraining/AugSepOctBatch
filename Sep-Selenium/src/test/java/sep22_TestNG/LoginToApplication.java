package sep22_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class LoginToApplication {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
	}

	@BeforeMethod
	public void navigateBrowser() {
		driver.get("http://automationpractice.com/index.php");
	}
	
	@AfterMethod
	public void signOut() {
		driver.findElement(By.linkText("Sign out")).click();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test
	public void loginWithValidUserNameAndPassword() {
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("santosh@test.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		String valMyAccount = "MY ACCOUNT";
		String myAccount = driver.findElement(By.xpath("//h1[text()='My account']")).getText();
		
		Assert.assertEquals(valMyAccount, myAccount);
	}
	
	@Test
	public void loginWithValidUserNameAndPassword2() {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("santosh@test.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		String valMyAccount = "MY account";
		String myAccount = driver.findElement(By.xpath("//h1[text()='My account']")).getText();
		
		Assert.assertEquals(valMyAccount, myAccount);
	}

	
}
