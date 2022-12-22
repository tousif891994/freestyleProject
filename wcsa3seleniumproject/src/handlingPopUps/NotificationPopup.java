package handlingPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxOptions fd=new FirefoxOptions();
		fd.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver(fd);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://bluestone.com/");
		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("chat-icon")).click();
		driver.findElement(By.xpath("//input)[10]")).sendKeys("admin");
		driver.findElement(By.id("chat-fc-email")).sendKeys("admin@123");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("899123548");
		
	}

}
