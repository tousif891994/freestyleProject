package methodOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	/*	
		for (int i = 0; i < suggestion.size(); i++) {
			WebElement iphones = suggestion.get(i);
			String iphoneList = iphones.getText();
			System.out.println(iphoneList);
		}
	*/
		
		for (WebElement suggest : suggestion) {
			String iphoneList=suggest.getText();
			System.out.println(iphoneList);
			
		}
	}

}
