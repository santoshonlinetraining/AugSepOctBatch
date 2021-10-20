package sep11_createAccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_Clear_Command {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("digitalcutlet7@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(2000);
		
		String firstName = "Digital";
		String lastName = "Cutlet";
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
		driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
		driver.findElement(By.id("passwd")).sendKeys("123456");
		
		//Method 1
		driver.findElement(By.id("days")).sendKeys("1  ");
		driver.findElement(By.id("months")).sendKeys("January ");
		driver.findElement(By.id("years")).sendKeys("2010  ");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("newsletter")).click();
		
		boolean newsLetterCheckBoxStatus = driver.findElement(By.id("newsletter")).isSelected();
		if(newsLetterCheckBoxStatus == false) {
			driver.findElement(By.id("newsletter")).click();
		}
		
		//Address
		String addFirstName = driver.findElement(By.id("firstname")).getAttribute("value");
		String addLastName = driver.findElement(By.id("lastname")).getAttribute("value");
		
		System.out.println("address first name is>" + firstName+"<");
		System.out.println("address last name is>" + lastName+"<");
		System.out.println("address first name is>" + addFirstName+"<");
		System.out.println("address last name is>" + addLastName+"<");
		
		if(firstName.equals(addFirstName) && lastName.equals(addLastName)) {
			System.out.println("Provided firstname and lastname is matching Address FirstName and LastName");
		} else {
			System.out.println("Provided firstname and lastname is NOT MATCHING Address FirstName and LastName");
		}
		
		//add first name and lastname
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("lastname")).clear();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("firstname")).sendKeys("Santosh");
		driver.findElement(By.id("lastname")).sendKeys("Kumar");

		
		driver.findElement(By.id("company")).sendKeys("DC");
		driver.findElement(By.id("address1")).sendKeys("Ameerpet");
		driver.findElement(By.id("address2")).sendKeys("Haythnagar");
		driver.findElement(By.id("city")).sendKeys("Hyd");
		
		driver.findElement(By.id("id_state")).sendKeys("Alabama");
		driver.findElement(By.id("postcode")).sendKeys("12345");
		
		driver.findElement(By.id("id_country")).sendKeys("United States");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		
		driver.findElement(By.id("alias")).sendKeys("Hyderabad");
		
		//driver.findElement(By.id("submitAccount")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
