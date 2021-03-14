package qsp;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P35 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws  InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Robot r1 = new Robot();
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
