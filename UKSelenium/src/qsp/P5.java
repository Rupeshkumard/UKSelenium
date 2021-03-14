package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.navigate().to("http://www.google.com");//same as get()
		Thread.sleep(1500);
		driver.navigate().back();//goes back to fb page
		Thread.sleep(1500);
		driver.navigate().forward();
		Thread.sleep(1500);
		driver.navigate().refresh();
		driver.close();
	}

}
