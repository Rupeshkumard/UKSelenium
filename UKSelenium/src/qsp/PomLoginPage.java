package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage {
	
	@FindBy(id="username")
	private WebElement untb;
	@FindBy(name="pwd")
	private WebElement pwtb;
	@FindBy(id="loginButton")
	private WebElement loginBtn;//declaration
	
	PomLoginPage(WebDriver driver) {//initialization
		
		PageFactory.initElements(driver, this);//to handle StaleElementReferenceException
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
