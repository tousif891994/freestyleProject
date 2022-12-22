package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("txtUsername")).sendKeys("tousifbargir7@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.name("txtPassword")).sendKeys("Manager");;
		Thread.sleep(4000);
		driver.findElement(By.name("Submit")).click();

	}

}
