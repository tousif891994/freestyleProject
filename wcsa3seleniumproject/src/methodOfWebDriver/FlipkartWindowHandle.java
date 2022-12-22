package methodOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("nothing 1");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String parenHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='Nothing Phone (1) (Black, 256 GB)'])[1]")).click();
		Thread.sleep(2000);
		Set<String> allhandles = driver.getWindowHandles();
		for (String handle : allhandles) {
			if (!parenHandle.equals(handle)) {
				driver.switchTo().window(handle);
			}
			else {
				
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'_2C41yO')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='8 GB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).sendKeys("415709");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//div[@class='nZz3kj _1hNI6F']/descendant::div[text()='Remove']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='row _1lPa3S']/descendant::div[text()='Remove']")).click();
		Thread.sleep(2000);
		
		
	}

}
