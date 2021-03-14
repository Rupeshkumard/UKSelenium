package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P21 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/UK%20selenium/H.html");
		Thread.sleep(3000);
		WebElement TajListBox = driver.findElement(By.id("taj"));
		//to handle taj List box, create object for select class and pass ref as argument.
		Select t1 = new Select(TajListBox);
		t1.selectByIndex(2);//selects brownie
		Thread.sleep(2000);
		t1.selectByValue("iy");//selects idly
		Thread.sleep(2000);
		t1.selectByVisibleText("vadapav");//selects vadapav
		Thread.sleep(2000);
//		t1.deselectByVisibleText("brownie");//deselects brownie
//		Thread.sleep(2000);
//		t1.deselectByValue("iy");//deselects idly
//		Thread.sleep(2000);
//		t1.deselectByIndex(0);//selects vadapav
		t1.deselectAll();
		Thread.sleep(4000);
		driver.close();
	}

}
