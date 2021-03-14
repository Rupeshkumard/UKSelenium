package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)  {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");//get()- enter the url
		System.out.println(driver.getTitle());//getTitle() - fetches the title of the page
		System.out.println(driver.getCurrentUrl());//getCurrentUrl() - fetches the url of the page
		driver.close();//close the parent browser
		
	}

}
