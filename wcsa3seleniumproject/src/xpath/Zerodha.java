package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zerodha.com/z-connect/wp-login.php");
		driver.findElement(By.name("log")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("World");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}

}
