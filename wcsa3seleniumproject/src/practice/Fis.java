package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fis {
	
	public String readExcelData(String excelPath,String sheetName,int rowCount, int cellCount) throws EncryptedDocumentException, IOException
	{
	      FileInputStream fis=new FileInputStream(excelPath);
	      Workbook wb=WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      Row rw = sh.getRow(rowCount);
	      Cell cell = rw.getCell(cellCount);
	      String data = cell.getStringCellValue();
	      return data;
	}
	
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.getRow(rowCount);
		Cell cell = rw.createCell(cellCount);
		cell.setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		
	}
}
