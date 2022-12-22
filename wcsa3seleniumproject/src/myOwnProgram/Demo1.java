package myOwnProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://bluestone.com/");
		driver.findElement(By.xpath("//span[text()='Allow']")).click();
		driver.findElement(By.id("fc_widget")).click();
		driver.findElement(By.id("chat-fc-name")).sendKeys("admin");
		driver.findElement(By.id("chat-fc-email")).sendKeys("admin@123");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("899123548");
		
	}

}
