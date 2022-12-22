package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-3mcik2fb/login.do");
		String actual = driver.getTitle();
		if (actual.equals("actiTIME - Login")) {
			System.out.println("Login title matched| Test case passed");
		}
		else {
			System.out.println("Login title not-matched| Test case failed");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(6000);
		String actualHome = driver.getTitle();
		if (actualHome.equals("actiTIME - Enter Time-Track")) {
			System.out.println("HomePage title matched| Test case passed");
		}
		else {
			System.out.println("HomePage title not-matched| Test case not passed");
		}
	}

}
