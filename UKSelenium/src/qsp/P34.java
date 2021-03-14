package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P34 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/UK%20selenium/I.html");
		Thread.sleep(5000);
		File f1 = new File("./cv/ABCD.docx");
		String absolutePath = f1.getAbsolutePath();
		System.out.println(absolutePath);
		driver.findElement(By.id("a1")).sendKeys(absolutePath);
		Thread.sleep(5000);
		driver.close();

	}

}
