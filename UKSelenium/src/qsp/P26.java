package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P26 {//CUSTOM EXCEPTION
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		while(true) {
			
			try {
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("logout link is found and clicked");
				break;
			}
			catch(Exception e) {
				System.out.println("logout link is not found, will try again");
			}
		}
		System.out.println("THE END");
		driver.close();

	}

}
