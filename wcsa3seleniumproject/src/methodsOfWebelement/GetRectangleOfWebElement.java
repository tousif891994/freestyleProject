package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangleOfWebElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement news=driver.findElement(By.xpath("//div[.='News']"));
		Rectangle rect=news.getRect();
		int h=rect.getHeight();
		int w=rect.getWidth();
		int x=rect.getX();
		int y=rect.getY();
		System.out.println("height.."+h+"width.."+w+"xloc.."+x+"yloc.."+y);
		
	}


}
