package oct2_ExtentReporting;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class TestReporting extends TestBase {
	String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	
  @Test
  public void f() {
	  
	  extentLogger = extent.startTest(TestcaseId, "TestStarted");
	  extentLogger.log(LogStatus.PASS, "text");
	  extentLogger.log(LogStatus.FAIL, "text");
	  extentLogger.log(LogStatus.INFO, "text");
	  
  }
}
