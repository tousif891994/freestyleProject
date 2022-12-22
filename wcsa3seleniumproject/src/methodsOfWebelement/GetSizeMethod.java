package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-3mcik2fb/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement element=driver.findElement(By.xpath("//td[.='Username:']"));
		Dimension values=element.getSize();
		int width=values.getWidth();
		int height=values.getHeight();
		System.out.println("Height of WebElement"+height+"Width of WebElement"+width);
		
	}
}
