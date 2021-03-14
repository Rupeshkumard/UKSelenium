package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/B.html");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.tagName("input")).sendKeys("XYZ");
		Thread.sleep(3000);
		driver.findElement(By.linkText("BHANUPRAKASHA")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("ANU")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
