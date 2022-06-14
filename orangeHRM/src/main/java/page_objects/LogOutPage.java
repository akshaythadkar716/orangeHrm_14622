package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	@FindBy (xpath = "//a[@id='welcome']")
	private WebElement WelcomeDrpDwn;

	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement logoutButton;

	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void logOutOfOrangeHRM() throws InterruptedException
	{
		WelcomeDrpDwn.click();
		Thread.sleep(1000);
		logoutButton.click();
	}

}
