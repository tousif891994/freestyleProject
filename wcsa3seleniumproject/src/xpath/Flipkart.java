package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("flipkart Login");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Flipkart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and contains(@class,'VJZDxU')]")).sendKeys("8149565410");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password' and contains(@class,'VJZDxU')]")).sendKeys("Tousif@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'_2HKlqd') and @type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'_3704LK') and @type='text']")).sendKeys("honor 8x");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'_4rR01T') or text()='Blur']")).click();
	}

}
