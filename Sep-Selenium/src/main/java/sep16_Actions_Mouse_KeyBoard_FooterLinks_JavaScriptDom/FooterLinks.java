package sep16_Actions_Mouse_KeyBoard_FooterLinks_JavaScriptDom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		driver.get("http://automationpractice.com/index.php");
		
		List<WebElement> footerLinks = driver.findElements(By.xpath("(//div[@class='row'])[6]//ul/li/a"));
		
		for(int i=0; i<footerLinks.size(); i++) {
			System.out.println(footerLinks.get(i).getText());
		}
		
		System.out.println("Bigbaset programe");
		driver.get("http://bigbasket.com/");
		
		List<WebElement> footerLinks2 = driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper']/ul/li/a"));
		
		for(int i=0; i<footerLinks2.size(); i++) {
			System.out.println(footerLinks2.get(i).getText());
		}
		
	}

}
