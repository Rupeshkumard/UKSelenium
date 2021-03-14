package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		
		String path = "./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		
		String un = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println("Username: "+un);
		driver.findElement(By.id("username")).sendKeys(un);//admin
		Thread.sleep(3000);
		
		String pw = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		System.out.println("Password: "+pw);
		driver.findElement(By.name("pwd")).sendKeys(pw);//manager
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
