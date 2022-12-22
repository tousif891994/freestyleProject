package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.flipkart.com");
		String urlCurrent = driver.getCurrentUrl();
		System.out.println(urlCurrent);
		Thread.sleep(4000);
		driver.close();

	}

}
