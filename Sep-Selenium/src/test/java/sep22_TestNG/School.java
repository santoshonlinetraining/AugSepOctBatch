package sep22_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class School {
  @Test
  public void Student() {
	  System.out.println("student name is Naveen");	  
  }
  
  @Test(enabled=false)
  public void Student2() {
	  System.out.println("student name is Pavan");	  
  }
  
  @Test
  public void Student3() {
	  System.out.println("student name is Eswar");	  
  }

  @Test
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
