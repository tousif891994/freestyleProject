package readPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimeLogin {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Flib flib = new Flib();
		String validUrl = flib.readPropertyData("./data/config.properties", "url");
		Thread.sleep(3000);
		driver.get(validUrl);
		Thread.sleep(3000);
		String validUsername = flib.readPropertyData("./data/config.properties", "username");
		driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(2000);
		String validPassword = flib.readPropertyData("./data/config.properties", "password");
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
	
	}

}
