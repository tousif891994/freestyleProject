package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/?skip_suggest=1&locale=en_US&next=https%3A%2F%2Fwww.udemy.com%2Fjoin%2Flogin-popup%2F&response_type=html");
		driver.findElement(By.id("email--1")).sendKeys("Hello@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-purpose='password']")).sendKeys("World1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-purpose='do-login']")).click();
		
	}


}
