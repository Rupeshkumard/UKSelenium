package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EW3 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(6000);
		String title = driver.getTitle();
		System.out.println("writing the title '"+title+"' in excel....");
		FileInputStream f1 = new FileInputStream("./data/Book.xlsx");
		XSSFWorkbook st = new XSSFWorkbook(f1);
		st.getSheet("Sheet1").createRow(0).createCell(4).setCellValue(title);
		FileOutputStream fo = new FileOutputStream("./data/Book.xlsx");
		st.write(fo);
		st.close();
		System.out.println("the end");
		driver.close();

	}

}
