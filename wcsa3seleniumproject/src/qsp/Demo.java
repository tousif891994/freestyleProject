package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		//driver.navigate().to("https://www.google.co.in/");
		//driver.switchTo().activeElement().sendKeys("iphone",Keys.ENTER);
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		//String title = driver.getTitle();
		//System.out.println(title);
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		//driver.close();
		//driver.quit();
		//Point targetPosition = new Point(400, 500);
		//driver.manage().window().setPosition(targetPosition);
		//Dimension targetSize = new Dimension(200, 500);
		//driver.manage().window().setSize(targetSize);
		//driver.findElement(By.tagName("input")).click();
		//driver.findElement(By.name("q")).sendKeys("hello",Keys.ENTER);
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("ai")).click();
		//driver.findElement(By.cssSelector("input[jsaction='paste:puy29d';']")).click();
		//driver.findElement(By.cssSelector("input[class^='gL']")).click();
		//driver.findElement(By.cssSelector("input[class$='gsfi']")).click();
		//driver.findElement(By.cssSelector("input[class*='f gs']")).click();
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
		//driver.findElement(By.xpath("//input[text()='value'")).click();
		//driver.findElement(By.xpath("//input[.='value']")).click();
		//driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')")).click();
		//driver.findElement(By.xpath("//input[contains(text(),'text')]")).click();
		
		
	}

}
