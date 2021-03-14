package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		PomLoginPage l1 = new PomLoginPage(driver);
		l1.setUsername("XYZ");//invalid
		Thread.sleep(2000);
		l1.setPassword("12345");//invalid
		Thread.sleep(2000);
		l1.clickLogin();//page gets refreshed
		
		Thread.sleep(5000);
		
		l1.setUsername("admin");//StaleElementReferenceException
		Thread.sleep(2000);
		l1.setPassword("manager");
		Thread.sleep(2000);
		l1.clickLogin();
		
		Thread.sleep(3000);
		driver.close();

	}
}
