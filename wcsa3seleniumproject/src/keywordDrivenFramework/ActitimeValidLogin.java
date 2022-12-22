package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		String validUsername = flib.ReadExcelData(EXCEL_PATH, "validdata", 1, 0);
		driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(2000);
		String validPassword = flib.ReadExcelData(EXCEL_PATH, "validdata", 1, 1);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
	}

}
