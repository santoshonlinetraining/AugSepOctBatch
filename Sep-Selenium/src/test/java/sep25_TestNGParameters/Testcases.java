package sep25_TestNGParameters;

import org.testng.annotations.Test;

import base.TestBase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Testcases extends TestBase {

	
	@Test(groups= {"P1"})
	@Parameters({"vegName1", "vegName2"})
	public void testcase001(String name1, String name2) throws InterruptedException {
		System.out.println("veg names " + name1 + name2);
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));

		// Double click on the webelemebt
		act.moveToElement(search).click().sendKeys(name1).doubleClick().build().perform();

		Thread.sleep(5000);
	}

	@Test(groups= {"P2"})
	@Parameters({"vegName1", "vegName2"})
	public void testcase002(String name1, String name2) throws InterruptedException {
		String veg = name2;
		System.out.println("veg names " + name1 + name2);System.out.println("veg names " + name1 + name2);
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));

		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(veg).build().perform();
		Thread.sleep(5000);
	}
	
	@Test(groups= {"P1"})
	public void testcase003() throws InterruptedException {
		Actions act = new Actions(driver);
		
		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")); 
		
		act.moveToElement(shopByCat).build().perform();
	
		Thread.sleep(5000);
		
		if(shopByCat.isDisplayed() && shopByCat.isEnabled()) {
			driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
		} else {
			System.out.println("WebElement is not present");
		}
	}
	

}
