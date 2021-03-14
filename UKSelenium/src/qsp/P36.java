package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P36 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/UK%20selenium/Page1.html");
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("ABCD");
		Thread.sleep(3000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("1234");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("    XYZ");
		Thread.sleep(3000);
		driver.close();

	}

}
//farhanaaz2@gmail.com
//lavyvarahan@gmail.com
//krinal1912@gmail.com

