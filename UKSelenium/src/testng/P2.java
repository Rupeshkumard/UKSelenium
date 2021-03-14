package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P2 {

	WebDriver driver;
	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@Test
	public void testGoogle(){
		
		driver.get("http://www.google.com");
		String googleTitle = driver.getTitle();
		Reporter.log(googleTitle,true);
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}	
	@Test
	public void testFB(){
		
		driver.get("http://www.facebook.com");
		String googleTitle = driver.getTitle();
		Reporter.log(googleTitle,true);
	}
	
	
	
	
	
}
