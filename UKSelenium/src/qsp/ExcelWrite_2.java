package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite_2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f1 = new FileInputStream("./data/Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet st = wb.getSheet("Sheet1");
		Row row = st.createRow(3);
		Cell cl = row.createCell(1);
		cl.setCellValue("UK-SELENIUM");
		FileOutputStream fo = new FileOutputStream("./data/Book.xlsx");
		wb.write(fo);
		wb.close();
		System.out.println("data is updated in 3rd index row and zeroth column");
	}

}
