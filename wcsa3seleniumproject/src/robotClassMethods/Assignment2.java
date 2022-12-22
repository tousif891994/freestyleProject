package robotClassMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement bank = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
		Actions act=new Actions(driver);
		act.contextClick(bank).perform();
		Thread.sleep(2000);
		Robot rbt=new Robot();
		for (int i = 0; i<=9; i++) {
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//li[contains(@class,'placeholder')]"));
		act.contextClick(target).perform();
		Thread.sleep(1000);
		for (int i = 0; i<=9; i++) {
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		act.dragAndDrop(bank, target).perform();
		
	}

}
