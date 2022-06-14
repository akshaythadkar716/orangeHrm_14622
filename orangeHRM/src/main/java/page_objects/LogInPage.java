package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage{
	WebDriver driver;
	@FindBy (xpath="//input[@id='txtUsername']")
	private WebElement txt_username;

	@FindBy (xpath="//input[@id='txtPassword']")
	private WebElement txt_password;

	@FindBy (xpath="//input[@id='btnLogin']")
	private WebElement btn_submit;

	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername()
	{
		txt_username.sendKeys("Admin");
	}
	public void sendPassword()
	{
		txt_password.sendKeys("Admin123");
	}
	public void clickOnSubmit()
	{
		btn_submit.click();
	}
}
