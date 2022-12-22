package handlingPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/User/Desktop/SELENIUMDATA/HTML/AlertPopUp.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		Thread.sleep(3000);
		al.accept();
		//al.dismiss()//NoAlertPresentException.
	}

}
