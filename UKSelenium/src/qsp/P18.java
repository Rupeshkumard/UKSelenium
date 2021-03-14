package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		List<WebElement> allImages = driver.findElements(By.xpath("//img"));
		int count = allImages.size();
		System.out.println(count);
		driver.close();

	}

}
