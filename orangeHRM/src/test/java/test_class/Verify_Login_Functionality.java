package test_class;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data_from_properties.property_data;
import page_objects.LogInPage;
import page_objects.LogOutPage;
import page_objects.UserManagementPage;
import test_base.Base_class;

public class Verify_Login_Functionality   {
	WebDriver driver;
	 Base_class base_class=new Base_class();
	LogInPage logInPage=new LogInPage(driver);
	UserManagementPage userManagementPage=new UserManagementPage(driver);
	LogOutPage logOutPage=new LogOutPage(driver);
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		base_class.launchBrowser();
		base_class.openUrl();
	}
	
	@BeforeMethod
	public void logIn()  {
		logInPage.sendUsername();
		logInPage.sendPassword();
		logInPage.clickOnSubmit();
	}
	
	@Test
	public  void validiateAdminportal() {
		userManagementPage.clickOnAdminButton();
		System.out.println(driver.getCurrentUrl());
	  
	}
	@AfterMethod
	public void  logout() throws InterruptedException {
		logOutPage.logOutOfOrangeHRM();
	}
	@AfterClass
	public void quite() {
		driver.close();
	}
	
	
	
	}
