package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration all the elements of login webpage
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pwd;
	@FindBy(id="LoginButton") private WebElement loginBtn;
	@FindBy(id="KeepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(xpath="//a[contains(text(),'License')]") private WebElement licenseLink;
	
	
	//intialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	
	//utilization
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	
	
	//valid login method
	 public void validLoginActitime(String validUsername, String validPassword) throws InterruptedException
	 {
		 usn.sendKeys(validUsername);
		 pwd.sendKeys(validPassword);
		 loginBtn.click();
		 Thread.sleep(3000);
		 
	 }
	 
	 //invalid login method
	
	 public void invalidLoginActitime(String invalidUsername, String invalidPassword) throws InterruptedException
	 {
		 usn.sendKeys(invalidUsername);
		 pwd.sendKeys(invalidPassword);
		 loginBtn.click();
		 Thread.sleep(3000);
		 usn.clear();
		 
	 }
	
	
}



