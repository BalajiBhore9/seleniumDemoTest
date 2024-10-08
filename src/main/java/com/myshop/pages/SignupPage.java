package com.myshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myshop.base.TestBase;

public class SignupPage extends TestBase{
	
	@FindBy(xpath = "//a[@class='login']") WebElement signInButton;
	@FindBy(name = "email") WebElement userEmail;
	@FindBy(name = "SubmitCreate") WebElement submitCreateButton;
	
	@FindBy(name = "id_gender") WebElement idGender;
	@FindBy(name = "customer_firstname") WebElement firstName;
	@FindBy(name = "customer_lastname") WebElement lastName;
	
	@FindBy(name = "passwd") WebElement userPassword;
	@FindBy(name = "days") WebElement dobDay;
	@FindBy(name = "months") WebElement dobMonth;
	@FindBy(name = "years") WebElement dobYear;
	@FindBy(name = "submitAccount") WebElement registerButton;
	


}
