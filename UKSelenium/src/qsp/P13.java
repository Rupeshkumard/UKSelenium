package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ABCD");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
