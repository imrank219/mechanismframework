package Academy;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day1 {

	@Test
	public void softAssertionTest(){
	   
	   //Creating softAssert object
	   SoftAssert softAssert = new SoftAssert();
	   
	   //Assertion failing
	   softAssert.fail("Failing first assertion");
	   System.out.println("Failing 1");
	   
	   //Assertion failing
	   softAssert.fail("Failing second assertion");
	   System.out.println("Failing 2");

	   //Assertion passing
	   softAssert.assertEquals(1, 1, "Passing third assertion");
	   System.out.println("Passing 3");

	   //Collates the assertion results and marks test as pass or fail
	   softAssert.assertAll();
	}
	
	@Test
	public void softAssertionTest2(){
	   
	   //Creating softAssert object
	   SoftAssert softAssert = new SoftAssert();
	   
	   //Assertion failing
	//   softAssert.fail("Failing first assertion");
	//   System.out.println("Failing 1");
	   
	   //Assertion failing
	//   softAssert.fail("Failing second assertion");
	//   System.out.println("Failing 2");

	   //Assertion passing
	   softAssert.assertEquals(1, 1, "Passing third assertion");
	   System.out.println("Passing 3");

	   //Collates the assertion results and marks test as pass or fail
	   softAssert.assertAll();
	   org.testng.Assert.fail("you wandered onto the wrong path");
	}

	}
	

