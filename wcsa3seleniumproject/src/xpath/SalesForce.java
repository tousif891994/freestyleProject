package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("Hello@123");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("World");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}

}
