package com.myshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myshop.base.TestBase;

public class LoginPage extends TestBase {
	
	// TestBase() class is parent class for all pages 
	//PageFactory()
	@FindBy(xpath = "//a[@class='login']") WebElement signInButton;
	
	@FindBy(name = "SubmitCreate") WebElement submitCreateButton;
	
	@FindBy(name = "email") WebElement userName;
	
	@FindBy(name = "passwd") WebElement password;
	
	@FindBy(xpath = "//a[text()='Forgot your password?']") WebElement forgotPassword;
	
	@FindBy(name = "SubmitLogin") WebElement submitLogButton;
	
	@FindBy(xpath = "//img[contains(@alt,'My Shop')]") WebElement myShopLogo;
	
	// Initialize the Page Objects
	// Initialize the pageFactory with the help of initElement method 
	public LoginPage() 
	{	
		PageFactory.initElements(driver, this);
	}
	// Actions:
	public String validateLoginPage() {
		return driver.getTitle();
	}
	public boolean validatemyshopImage() {
		return myShopLogo.isDisplayed();
	}
	public HomePage login(String usr,String pwd) throws InterruptedException {
		
		signInButton.click();
		Thread.sleep(1000);
		userName.sendKeys(usr);
		password.sendKeys(pwd);
		Thread.sleep(1000);
		submitLogButton.click();
		Thread.sleep(1000);
		return new HomePage();
	}
}
