package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescendantAncestor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Descendant
		driver.findElement(By.xpath("//div[@class='go_DOp _2errNR']/descendant::div[@class='_1psGvi _3BvnxG']")).click();
		//Ancestor
		driver.findElement(By.xpath("//div[@class='_1psGvi _3BvnxG']/ancestor::div[@class='go_DOp _2errNR']")).click();
	}

}
