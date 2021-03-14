package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P29 {//Notification Popup
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("8660281165");
		driver.findElement(By.id("pass")).sendKeys("Nikki@321");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(10000);
		driver.close();
	

	}

}
