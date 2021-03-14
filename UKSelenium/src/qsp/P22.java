package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P22 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(5000);
		WebElement dayListBox = driver.findElement(By.id("day"));
		Select s1 = new Select(dayListBox);
		s1.selectByVisibleText("15");
		Thread.sleep(3000);
		
		WebElement monthListBox = driver.findElement(By.id("month"));
		Select s2 = new Select(monthListBox);
		s2.selectByVisibleText("Aug");
		Thread.sleep(3000);
		
		WebElement yearListBox = driver.findElement(By.id("year"));
		Select s3 = new Select(yearListBox);
		s3.selectByVisibleText("1947");
		Thread.sleep(5000);
		driver.close();

	}

}
