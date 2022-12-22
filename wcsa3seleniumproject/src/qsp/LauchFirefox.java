package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchFirefox
{
    public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 Thread.sleep(8000);
		 driver.close();

	}

}
