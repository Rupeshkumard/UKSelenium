package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6  {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("kate123@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement passwordTB = driver.findElement(By.id("pass"));
		passwordTB.sendKeys("jaggu dada");
		
		Thread.sleep(3000);
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
		Thread.sleep(3000);
		

	}

}
