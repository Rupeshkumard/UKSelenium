package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		TakesScreenshot ts = (TakesScreenshot)driver;//convert webdriver to takesscreenshot
		
		File src = ts.getScreenshotAs(OutputType.FILE);//taking screenshot
		File des = new File("./ss/google.png");
		FileUtils.copyFile(src, des);
		
		driver.navigate().to("http://www.fb.com");
		Thread.sleep(5000);
		
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File des2 = new File("./ss/fb.png");
		FileUtils.copyFile(src2, des2);
		Thread.sleep(5000);
		driver.close();
		
	}

}
