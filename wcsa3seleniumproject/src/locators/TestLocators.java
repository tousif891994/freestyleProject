package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://logins.vsmartacademy.com/student/");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("tousifbargir7@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("Manager");;
		Thread.sleep(4000);
		driver.findElement(By.name("save")).click();

	}

}
