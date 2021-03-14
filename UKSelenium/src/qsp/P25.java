package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P25 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);//10 is seconds by defaults
		wait.until(ExpectedConditions.titleContains("actiTrack"));
		String secondPageTitle = driver.getTitle();
		System.out.println("Second Page Title: "+secondPageTitle);
		driver.findElement(By.id("logoutLink")).click();
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		String firstPageTitle = driver.getTitle();
		System.out.println("First Page Title: "+firstPageTitle);
		driver.close();
		
	}

}
