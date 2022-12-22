package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-3mcik2fb/login.do");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(4000);
		driver.findElement(By.id("loginButton")).click();
	}

}
