package oct2_ExtentReporting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import oct1_log4j.LogfileImpl;

public class ContactUsTestcases extends TestBase {
	
	
	@Test
	public void contactUsTest001(){
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();	
		System.out.println("this is " + TestcaseId);
		extentLogger = extent.startTest(TestcaseId, "This is testcase is to verify the ContactUs page functionality and success message");
		
		extentLogger.log(LogStatus.INFO, "click on the ContactUs Link");
		homePageObj.getContactUs().click();
		
		extentLogger.log(LogStatus.INFO, "Verify the ContactUs Link page exist or not");
		String contactUsPageText = contactUsPageObj.getContactUsPageText().getText();
		Assert.assertEquals(contactUsPageText, "CUSTOMER SERVICE - CONTACT US");
		
		extentLogger.log(LogStatus.INFO, "Enter the data");
		contactUsPageObj.setSubjectHeading("Webmaster");
		contactUsPageObj.setEmailaddress("test@test.com");
		contactUsPageObj.setOrderreference("1234567890");
		contactUsPageObj.setMessage("Hello my order is missing");
		contactUsPageObj.getSendbutton().click();
		
		extentLogger.log(LogStatus.INFO, "Verify t the message displayed proeprly or not");
		Assert.assertEquals(contactUsPageObj.getContactUsSuccessMessage().getText(), "Your message has been successfully sent to our team.");
		
		extentLogger.log(LogStatus.PASS, "Test case PASS");
	}
	
	
	@Test
	public void contactUsTest002(){
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
		
		extentLogger.log(LogStatus.INFO, "click on the ContactUs Link");
		homePageObj.getContactUs().click();
		
		extentLogger.log(LogStatus.INFO, "Verify the ContactUs Link page exist or not");
		String contactUsPageText = contactUsPageObj.getContactUsPageText().getText();
		Assert.assertEquals(contactUsPageText, "CUSTOMER SERVICE - CONTACT US");
		
		extentLogger.log(LogStatus.INFO, "Enter the data");
		contactUsPageObj.setSubjectHeading("Customer service");
		contactUsPageObj.setEmailaddress("test2@test.com");
		contactUsPageObj.setOrderreference("456789");
		contactUsPageObj.getSendbutton().click();
		
		extentLogger.log(LogStatus.INFO, "Verify t the message displayed proeprly or not");
		if(contactUsPageObj.getContactUsErrorMessage().getText().equals("\"The message cannot be .\"")) {
			extentLogger.log(LogStatus.PASS, "Testcase PASS");
			Assert.assertTrue(true);
		} else {
			extentLogger.log(LogStatus.FAIL, "Testcase FAIL");
			Assert.assertTrue(false);
		}
		
	}
	
	@Test(dependsOnMethods = {"contactUsTest002"})
	public void contactUsTest003(){
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		extentLogger = extent.startTest(TestcaseId, "TestStarted");
		
		extentLogger.log(LogStatus.INFO, "click on the ContactUs Link");
		homePageObj.getContactUs().click();
		
		extentLogger.log(LogStatus.INFO, "Verify the ContactUs Link page exist or not");
		String contactUsPageText = contactUsPageObj.getContactUsPageText().getText();
		Assert.assertEquals(contactUsPageText, "CUSTOMER SERVICE - CONTACT US");
		
		extentLogger.log(LogStatus.INFO, "Enter the data");
		contactUsPageObj.setSubjectHeading("Customer service");
		contactUsPageObj.setEmailaddress("test2@test.com");
		contactUsPageObj.setOrderreference("456789");
		contactUsPageObj.getSendbutton().click();
		
		extentLogger.log(LogStatus.INFO, "Verify t the message displayed proeprly or not");
		if(contactUsPageObj.getContactUsErrorMessage().getText().equals("\"The message cannot be .\"")) {
			extentLogger.log(LogStatus.PASS, "Testcase PASS");
			Assert.assertTrue(true);
		} else {
			extentLogger.log(LogStatus.FAIL, "Testcase FAIL");
			Assert.assertTrue(false);
		}
		
	}

}
