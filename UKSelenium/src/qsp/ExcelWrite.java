package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		String path = "./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String a = wb.getSheet("Sheet1").getRow(1).getCell(3).toString();
		System.out.println(a);//martin
		
		//to write data in excel Sheet
		wb.getSheet("Sheet1").getRow(1).getCell(3).setCellValue("Johnny");
		wb.getSheet("Sheet1").getRow(1).getCell(4).setCellValue("Max");
		wb.write(new FileOutputStream(path));
		wb.close();

	}

}
