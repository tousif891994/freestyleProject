package frameworkdataDriver;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimeValidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-3mcik2fb/login.do");
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/exceldata.xlsx", "validdata");
		
		for (int i = 1; i <=rc; i++) {
			String validUsername = flib.ReadExcelData("./data/exceldata.xlsx", "validdata", i, 0);
			driver.findElement(By.name("username")).sendKeys(validUsername);
			Thread.sleep(3000);
			String validPassword = flib.ReadExcelData("./data/exceldata.xlsx", "validdata", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(validPassword);
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("username")).clear();
			
			
			
		}

	}
}
