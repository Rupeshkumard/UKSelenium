package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P40 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		String parentBrowser = driver.getWindowHandle();
		Set<String> allWinHndls = driver.getWindowHandles();

	}

}
