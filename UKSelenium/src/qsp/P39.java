package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P39 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/UK%20selenium/c.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.get(0).getText());//google
		System.out.println(allLinks.get(1).getText());//facebook
		System.out.println(allLinks.size());
		driver.close();

	}

}
