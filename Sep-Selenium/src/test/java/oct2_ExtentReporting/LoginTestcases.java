package oct2_ExtentReporting;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import oct1_log4j.LogfileImpl;

public class LoginTestcases extends TestBase {
	

	@Test
	public void loginTest001() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
		
		extentLogger.log(LogStatus.INFO, "click on the SignIn Link");
		homePageObj.getSignInLink().click();
		
		extentLogger.log(LogStatus.INFO, "Enter username and password");
		authPageObj.setEmailaddressSignIn("santosh@test.com");
		authPageObj.setPassword("123456");
		authPageObj.getSigninbutton().click();
		
		Assert.assertEquals(myAccountObj.getSignout().isDisplayed(), true);
		extentLogger.log(LogStatus.PASS, "Testcase login PASS");
	
	}
	
	@Test
	public void loginTest002() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
		
		extentLogger.log(LogStatus.INFO, "click on the SignIn Link");
		homePageObj.getSignInLink().click();
		
		extentLogger.log(LogStatus.INFO, "Enter username and password");
		authPageObj.setEmailaddressSignIn("santosh@test.com");
		authPageObj.setPassword("123456");
		authPageObj.getSigninbutton().click();
		
	
	}

	
}
