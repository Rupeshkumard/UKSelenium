package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P1 {
	
	@BeforeClass
	public void test1() {
		Reporter.log("from Before class method",true);
	}
	
	@Test(priority = 50, invocationCount=3)
	public void banana() {
		
		Reporter.log("from banana",true);
	}
	
	@Test(priority = 50, invocationCount=5)
	public void zebra() {
		
		Reporter.log("from zebra", true);
	}
	
	@Test(priority = 0, invocationCount=2)
	public void apple() {
		
		Reporter.log("from apple", true);
	}
	@AfterClass
	public void test2() {
		Reporter.log("from After class method",true);
	}
	

}
