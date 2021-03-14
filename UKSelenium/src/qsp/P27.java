package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P27 {//Javascript Popup
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("ABCD");
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		Thread.sleep(5000);
		//to handle javascript popup
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(5000);
		driver.close();
		
	}
}
