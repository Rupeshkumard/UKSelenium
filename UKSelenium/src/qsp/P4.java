package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("abcd1234");
		Thread.sleep(3000);
		driver.switchTo().activeElement().clear();

	}

}
