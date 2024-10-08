package com.myshop.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.myshop.base.TestBase;
import com.myshop.pages.HomePage;
import com.myshop.pages.LoginPage;

public class LogInPageTest extends TestBase {
	
	LoginPage loginpage ; 
	HomePage homePage;
	
	public LogInPageTest() {
		// super() class is use to call the super class constructor TestBase()class
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
	}
	@Test(priority = 1)
	public void loginPageTitile() {
		String title = loginpage.validateLoginPage();
		Assert.assertEquals(title, "My Shop");
	}
	@Test(priority = 2)
	public void myshopImgTest()
	{
		boolean img = loginpage.validatemyshopImage();
		Assert.assertTrue(img);
	}
	@Test(priority = 3)
	public void logInTest() throws InterruptedException {
		homePage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
