package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;
import oct1_log4j.LogfileImpl;

public class Listeners implements ITestListener {
	public Logger log = LogManager.getLogger(LogfileImpl.class.getName());
	
	//When the stuite is started
	public void onStart(ITestContext context) {
		log.info("This is onStart method : " + context.getOutputDirectory());
	}
	
	//when @Test started
	public void onTestStart(ITestResult result) {
		log.info("New Test Started : " + result.getName());
	}
	
	//when @Test is done
	public void onTestSuccess(ITestResult result) {
		log.info("Test Successfully Finished : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		log.error("Test Failed : " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		log.info("Test Skipped : " + result.getName());
	}

	//how many testcases are passed and failed information	
	//When suite is ended it will executed
	public void onFinish(ITestContext context) {
		log.info("This is onFinish method  : " + context.getPassedTests());
		log.error("This is onFinish method  : " + context.getFailedTests());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		log.error("Test Failed but within success percentage : " + result.getName());
	}
	
}
