package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//following sibling
		driver.findElement(By.xpath("//span[.='Men']/following-sibling::span[.='Women']")).click();
		//preceding sibling
		driver.findElement(By.xpath("//span[.='Women']/preceding-sibling::span[.='Men']")).click();
	}

}
