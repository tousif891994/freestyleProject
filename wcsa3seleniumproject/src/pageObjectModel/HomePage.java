package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//declaration of Webelements of actitime home page
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createNewTask;
	@FindBy(id="profile-link") private WebElement adminSystem;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logOutlink;
	@FindBy(xpath="//a[text()='View Time-Track']") private WebElement viewTimeTrack;
	
	
	
	
	//initialization
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	//utilization
	
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	
	public WebElement getAdminSystem() {
		return adminSystem;
	}
	public WebElement getLogOut() {
		return logOutlink;
	}
	public WebElement getViewTimeTrack() {
		return viewTimeTrack;
	}

	//logout method
	
	public void logOutMethod()
	{
		logOutlink.click();
	}
	
	
	

}
