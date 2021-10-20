package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import excel.ExcelReader;
import listeners.EventListener;
import oct1_log4j.LogfileImpl;
import pages.AuthenticationPage;
import pages.ContactusPage;
import pages.CreateAccountPage;
import pages.FooterLinksPage;
import pages.HeaderLinksPage;
import pages.HomePage;
import pages.MyAccountPage;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.io.File;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.io.File;

public class TestBase {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	public ExcelReader datatable;
	
	public AuthenticationPage authPageObj;
	public ContactusPage contactUsPageObj;
	public CreateAccountPage createAccountObj;
	public FooterLinksPage footerLinksObj;
	public HeaderLinksPage hearderLinksObj;
	public HomePage homePageObj;
	public MyAccountPage myAccountObj;

	// extents reporting 
	//create two instance variable
	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	
	@BeforeTest
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\extent-config.xml"));
	}
	
	@AfterTest
	public void testafter() {
		extent.close();
	}

	
	@BeforeClass(groups= {"P1","P2","P3"})
	public void navigateBrowser() throws IOException {
		datatable = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\spreadsheets\\TestData.xlsx");
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080","--ignore-certificate-errors");

			driver = new ChromeDriver(options);
		}
		else if(prop.getProperty("browser").equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\edge\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(prop.getProperty("browser").equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Santosh\\Automation\\Workspace_new\\Sep-Selenium\\drivers\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Provided browser is not supported");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		//class file which we created in above step
		EventListener ecapture = new EventListener(); 
		
		//pass the driver to EventFiringWebDriver
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		
		//pass ecapture tp eventHandler
		eventHandler.register(ecapture);
		
		authPageObj = new AuthenticationPage(eventHandler);
		contactUsPageObj = new ContactusPage(eventHandler);
		createAccountObj = new CreateAccountPage(eventHandler);
		footerLinksObj = new FooterLinksPage(eventHandler);
		hearderLinksObj = new HeaderLinksPage(eventHandler);
		homePageObj = new HomePage(eventHandler);
		myAccountObj = new MyAccountPage(eventHandler);
	}
	
	@BeforeMethod(groups= {"P1","P2","P3"})
	public void beforemethod() {
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod(groups= {"P1","P2","P3"})
	public void aftermethod() {
		myAccountObj.getSignout().click();
		extent.endTest(extentLogger);
		extent.flush();
	}

	@AfterClass(groups= {"P1","P2","P3"})
	public void afterClass() {
		driver.quit();
	}
	
}
