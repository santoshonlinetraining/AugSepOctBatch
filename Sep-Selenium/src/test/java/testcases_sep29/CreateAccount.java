package testcases_sep29;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import oct1_log4j.LogfileImpl;

public class CreateAccount extends TestBase {
	public Logger log = LogManager.getLogger(LogfileImpl.class.getName());
	
	String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	
	@Test
	public void CreateAccountTest001() {
		extentLogger.log(LogStatus.INFO, "Clicking on the SignIn Link");
		homePageObj.getSignInLink().click();
		
		extentLogger.log(LogStatus.INFO, "Enter Email id");
		authPageObj.setEmailaddressCreateAccount("santosh11@test.com");
		authPageObj.getCraeteanaccountbutton().click();
		
		extentLogger.log(LogStatus.INFO, "Verify the Account is created or not by providng the below information");
		createAccountObj.setFirstName("Santosh");
		createAccountObj.setLastName("Kumar");
		createAccountObj.getGenderselectMale().click();
		
		
		extentLogger.log(LogStatus.PASS, "Account created successfully");
		
	}
	
	
}
