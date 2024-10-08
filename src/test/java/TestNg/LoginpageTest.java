package TestNg;

import org.testng.annotations.Test;

public class LoginpageTest {

	@Test(groups = {"login"})
	public  void AdmissionLoginPage()
	{
		System.out.println("Admission Login Page");
	}
	@Test
	public  void PlacementLoginPage()
	{
		System.out.println("Placement Login Page");
	}
}
