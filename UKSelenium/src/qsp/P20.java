package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS for the following:
//1).open the browser
//2).go to cleartrip.com
//3).type 'ban' in FROM text field,it will display auto suggestions.
//4). Find all auto suggestion elements and print the count
//5). print the text of all the auto suggestions
//6). select the first auto suggestion
public class P20 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.cleartrip.com");
		Thread.sleep(10000);
		driver.findElement(By.id("FromTag")).sendKeys("Ban");
		Thread.sleep(5000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//a[contains(.,'Ban') and not(.='Bangalore')]"));
		System.out.println("count: "+allsugg.size());
		for(int i=0;i<allsugg.size();i++) {
			System.out.println(allsugg.get(i).getText());
		}
		allsugg.get(0).click();
		Thread.sleep(3000);
		driver.close();
	}
}
