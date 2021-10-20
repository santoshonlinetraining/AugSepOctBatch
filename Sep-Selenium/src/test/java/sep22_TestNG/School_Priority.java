package sep22_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class School_Priority {
  @Test(priority=2)
  public void Student1() {
	  System.out.println("student name is Naveen");	  
  }
  
  @Test(priority=1)
  public void Student2() {
	  System.out.println("student name is Pavan");	  
  }
  
  @Test(priority=4)
  public void Student3() {
	  System.out.println("student name is Eswar");	  
  }

  @Test(priority=3)
  public void Student4() {
	  System.out.println("student name is Aravind");	  
  }

  @BeforeMethod
  public void BM() {
	  System.out.println("I am from Before method");
  }
  
  @AfterMethod
  public void AM() {
	  System.out.println("i am from after method");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am from Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am from After Test");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am from Before Suite");
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am from After Suite");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
