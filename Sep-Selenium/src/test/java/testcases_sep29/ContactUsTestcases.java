package testcases_sep29;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import oct1_log4j.LogfileImpl;

public class ContactUsTestcases extends TestBase {
	public Logger log = LogManager.getLogger(LogfileImpl.class.getName());
	
	@Test
	public void contactUsTest001(){
		
		homePageObj.getContactUs().click();
		
		String contactUsPageText = contactUsPageObj.getContactUsPageText().getText();
		Assert.assertEquals(contactUsPageText, "CUSTOMER SERVICE - CONTACT US");
		
		contactUsPageObj.setSubjectHeading("Webmaster");
		contactUsPageObj.setEmailaddress("test@test.com");
		contactUsPageObj.setOrderreference("1234567890");
		contactUsPageObj.setMessage("Hello my order is missing");
		contactUsPageObj.getSendbutton().click();
		
		Assert.assertEquals(contactUsPageObj.getContactUsSuccessMessage().getText(), "Your message has been successfully sent to our team.");
		log.info("ContactUs Test001 PASS");
	}
	
	
	@Test
	public void contactUsTest002(){
		
		homePageObj.getContactUs().click();
		
		String contactUsPageText = contactUsPageObj.getContactUsPageText().getText();
		Assert.assertEquals(contactUsPageText, "CUSTOMER SERVICE - CONTACT US");
		
		contactUsPageObj.setSubjectHeading("Customer service");
		contactUsPageObj.setEmailaddress("test2@test.com");
		contactUsPageObj.setOrderreference("456789");
		contactUsPageObj.getSendbutton().click();
		
		if(contactUsPageObj.getContactUsErrorMessage().getText().equals("\"The message cannot be .\"")) {
			log.info("Contact us Testcase002 is PASS");
			Assert.assertTrue(true);
		} else {
			log.error("Testcase failed due to text mismatch");
			Assert.assertTrue(false);
		}
		
	}
	
	@Test(dependsOnMethods = {"contactUsTest002"})
	public void contactUsTest003(){
		
		homePageObj.getContactUs().click();
		
		String contactUsPageText = contactUsPageObj.getContactUsPageText().getText();
		Assert.assertEquals(contactUsPageText, "CUSTOMER SERVICE - CONTACT US");
		
		contactUsPageObj.setSubjectHeading("Customer service");
		contactUsPageObj.setEmailaddress("test2@test.com");
		contactUsPageObj.setOrderreference("456789");
		contactUsPageObj.getSendbutton().click();
		
		if(contactUsPageObj.getContactUsErrorMessage().getText().equals("\"The message cannot be .\"")) {
			log.info("Contact us Testcase002 is PASS");
			Assert.assertTrue(true);
		} else {
			log.error("Testcase failed due to text mismatch");
			Assert.assertTrue(false);
		}
		
	}

}
