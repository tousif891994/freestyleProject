package frameworkdataDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.lang.IllegalStateException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeReadExcelValidData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException ,IllegalStateException{
		//Not working fine need to be corrected
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-3mcik2fb/login.do");
		Thread.sleep(2000);
		FileInputStream fis = new FileInputStream("./data/exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validdata");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username=cell.getStringCellValue();
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		
		//driver.findElement(By.name("pwd")).sendKeys();
		//driver.findElement(By.id("loginButton")).click();
	}

}
