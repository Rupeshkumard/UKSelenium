package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P16 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/G.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total links: " + allLinks.size());
		driver.close();
	}

}
