package frameworkdataDriver;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeExcelvalidData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-3mcik2fb/login.do");
		Flib file = new Flib();
		String username = file.ReadExcelData("./data/exceldata.xlsx", "validdata", 1, 0);
		driver.findElement(By.name("username")).sendKeys(username);
		String password = file.ReadExcelData("./data/exceldata.xlsx", "validdata", 1, 1);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}
}
