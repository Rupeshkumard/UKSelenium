package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;//convert to TakesScreenshot interface
		File src = ts.getScreenshotAs(OutputType.FILE);//taking screenshot
		File des = new File("./ss/gmail.png");//specifying the destination file to be stored
		FileUtils.copyFile(src, des);//storing the screenshot in the destination
		Thread.sleep(3000);
		driver.close();
	}

}
