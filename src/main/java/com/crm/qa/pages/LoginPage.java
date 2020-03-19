package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	// Define object repository - Page factory
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUp;
	
	@FindBy(xpath="//img[contains(@class='img-responsive')]")
	WebElement crmLogo;
	
	// initilizing the element of pagefactory
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	// Actions/methods
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String uname, String pword) {
		username.sendKeys(uname);
		password.sendKeys(pword);
		loginBtn.click();
		return new HomePage();
		
	}
	
	
	
	
}
