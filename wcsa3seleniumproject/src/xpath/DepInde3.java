package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DepInde3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=samsung+s20+ultra&crid=1HP56IDWJ708E&sprefix=samsung+s20%2Caps%2C377&ref=nb_sb_ss_ts-doa-p_6_11");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Samsung Galaxy S20 FE 5G (Cloud Lavender, 8GB RAM, 128GB Storage) with No Cost EMI & Additional Exchange Offers']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-size-base s-underline-text'])[1]")).click();
		
	}


}
