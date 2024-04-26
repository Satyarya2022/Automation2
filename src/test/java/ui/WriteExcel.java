package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public static void main (String[] args)throws IOException {
		
		XSSFWorkbook wb1 = new XSSFWorkbook ();
		XSSFSheet sh1 = wb1.createSheet("MySheet1");// takes ref  wb1
		Row r0 = sh1.createRow(0);
		Cell c0 = r0.createCell(0);
		c0.setCellValue("Data1");
	
		
		File f1 = new File("C:\\Users\\janap\\eclipse-workspace\\AutomationTest2\\src\\test\\java\\common\\Excelsheet2.xlsx");
		FileOutputStream fos = new FileOutputStream (f1);
		wb1.write(fos);
		fos.close();
		wb1.close();
		
		System.out.println("File created sucessfully");
		
	}

}
