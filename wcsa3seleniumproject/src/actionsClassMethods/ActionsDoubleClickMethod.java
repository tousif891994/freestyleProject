package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-3mcik2fb/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Logo & ') ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		Thread.sleep(2000);
		WebElement doubleClick = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.doubleClick(doubleClick).perform();
		Thread.sleep(2000);
		
		
	}

}
