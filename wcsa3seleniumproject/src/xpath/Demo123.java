package xpath;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import com.google.common.io.Files;

public class Demo123 {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShots/bluest.jpg");
		Files.copy(src, dest);
		Actions ac = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		ac.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[.='Band']")).click();
		Point loc = driver.findElement(By.xpath("//span[.='Know More']")).getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xaxis+","+(yaxis-150)+")");
		String txt = driver.findElement(By.xpath("//div[.='BlueStone Stores ']")).getText();
		System.out.println(txt);
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys(txt);
		Thread.sleep(3000);
		driver.switchTo().activeElement().submit();
		Thread.sleep(3000);
		driver.switchTo().frame("fc_widget");
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("admin");
		driver.findElement(By.id("chat-fc-email")).sendKeys("admin@123");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("123456");
		Thread.sleep(3000);
		
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_P);
		rbt.keyRelease(KeyEvent.VK_P);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
