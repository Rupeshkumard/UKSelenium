package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P4 {
WebDriver driver;
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String expectedTitle = "Firefox";
		String actualTitle = driver.getTitle();
		
		//to execute further stmts even after the test if failed,
		//we use SoftAssert
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
		s1.assertAll();

}
}
