package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseHoverMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Allow']")).click();
		WebElement target = driver.findElement(By.xpath("//a[contains(.,'Watch Jewellery')]"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(target).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Band')]")).click();
		
	}

}
