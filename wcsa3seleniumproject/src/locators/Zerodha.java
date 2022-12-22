package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zerodha.com/z-connect/wp-login.php");
		driver.findElement(By.name("log")).sendKeys("Hello world");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[id*='er_p']")).sendKeys("HRU");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[class*='n-primar']")).click();
		
		

	}

}
