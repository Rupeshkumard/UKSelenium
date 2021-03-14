package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P30 {//Child Browser Popup
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		String parentNaukriBrowser = driver.getWindowHandle();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String windowHandle : allWindowHandles) {//for-each loop
			
			if(windowHandle.equals(parentNaukriBrowser)) {
				continue;
			}
			else {
				driver.switchTo().window(windowHandle).close();
				Thread.sleep(2000);
			}
			
		}

	}

}
