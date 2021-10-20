package sep21_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Emp {
  @Test
  public void empInfo() {
	  System.out.println("Emp name is Shiva");
  }
  
  @Test
  public void empInfo2() {
	  System.out.println("Emp name is Santosh");
  }
  
   @Test
  public void empInfo3() {
	  System.out.println("Emp name is Santosh");
  }
  
   @Test
  public void empInfo4() {
	  System.out.println("Emp name is Santosh");
  }
     @Test
  public void empInfo5() {
	  System.out.println("Emp name is Santosh");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am from before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am from after class");
  }

  @BeforeMethod
  public void BM() {
	  System.out.println("I am from Before method");
  }
  
  @AfterMethod
  public void AM() {
	  System.out.println("i am from after method");
  }

  
}
