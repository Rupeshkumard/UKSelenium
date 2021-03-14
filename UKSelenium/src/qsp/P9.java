package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/B.html");
		driver.findElement(By.id("u1")).sendKeys("ABCD");
		Thread.sleep(2000);
		driver.findElement(By.name("p1")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.className("c1")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("c2")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
