package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.skillrary.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("java");
		Thread.sleep(3000);
		driver.close();
	}

}
