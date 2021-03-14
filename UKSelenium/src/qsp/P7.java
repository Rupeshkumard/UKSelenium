package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("8660281165");
		driver.findElement(By.id("pass")).sendKeys("Nikki@321");
		driver.findElement(By.name("login")).click();
		
	}

}
