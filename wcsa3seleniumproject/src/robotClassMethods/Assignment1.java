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

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Allow']")).click();;
		WebElement target = driver.findElement(By.xpath("//a[contains(.,'Watch Jewellery')]"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Band')]")).click();
		Thread.sleep(2000);
		WebElement clickAndHold = driver.findElement(By.xpath("//div[contains(text(),'Filter by')]"));
		
		for (int i = 0; i<=2; i++) {
			act.clickAndHold(clickAndHold).perform();
		}
		Thread.sleep(2000);
		//copy to clipboard, create object for robot method
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_C);
		rbt.keyRelease(KeyEvent.VK_C);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='form-text typeahead']"));
		searchBox.click();
		//paste to search box
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		//search it
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'submit_search')]")).click();
		
		
	}

}
