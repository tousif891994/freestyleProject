package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-3mcik2fb/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement element=driver.findElement(By.id("keepLoggedInCheckBox"));
		boolean CheckBox = element.isSelected();
		System.out.println(CheckBox);
		Thread.sleep(3000);
		element.click();
		Thread.sleep(3000);
		boolean chkbox = element.isSelected();
		System.out.println(chkbox);
		Thread.sleep(3000);
		driver.close();
	}
}
