package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/A.html");
		driver.findElement(By.id("a1")).click();
		driver.navigate().back();
		driver.findElement(By.name("n2")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
