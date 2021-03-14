package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		WebElement tb = driver.findElement(By.name("q"));
		tb.sendKeys("java");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		try {
			tb.sendKeys("python");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		

			Thread.sleep(3000);
			driver.close();
		

	}

}
