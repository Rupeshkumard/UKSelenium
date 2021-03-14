package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebElement untb;
	WebElement pwtb;
	WebElement loginBtn;//declaration
	
	LoginPage(WebDriver driver) {//initialization
		
		untb = driver.findElement(By.id("username"));
		
		pwtb = driver.findElement(By.name("pwd"));
		
		loginBtn = driver.findElement(By.id("loginButton"));
		
	}
	
	public void setUsername(String un) {//utilization
		
		untb.sendKeys(un);
	}
	
	public void setPassword(String pw) {//utilization
		
		pwtb.sendKeys(pw);
	}
	
	public void clickLogin() {//utilization
		
		loginBtn.click();
	}

}
