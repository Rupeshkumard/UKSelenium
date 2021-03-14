package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS for the following:
//1).open the browser
//2).go to google.com
//3).type 'java' in the search box,it will display auto suggestions.
//4). Find all auto suggestion elements and print the count
//5). print the text of all the auto suggestions
//6). select the 3rd auto suggestion
public class P19 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> allAutoSuggestions = driver.findElements(By.xpath("//span[contains(.,'java')]"));
		System.out.println(allAutoSuggestions.size());
		for(int i=0;i<allAutoSuggestions.size();i++) {
			System.out.println(allAutoSuggestions.get(i).getText());
		}
		
		allAutoSuggestions.get(2).click();
		Thread.sleep(3000);
		driver.close();
	}
}
