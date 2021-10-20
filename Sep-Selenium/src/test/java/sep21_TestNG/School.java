package sep21_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class School {
  @Test
  public void Student() {
	  System.out.println("student name is Naveen");	  
  }
  
  @Test
  public void Student2() {
	  System.out.println("student name is Pavan");	  
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
}
