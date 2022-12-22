package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Tbargir");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("8149565410");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[type*='bmi']")).click();
		

	}

}
