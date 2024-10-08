package TestNg;

import org.testng.annotations.Test;

public class RegisterTest {

	@Test(groups = {"login"})
	public  void AdmissionLoginReg()
	{
		System.out.println("Register Admission Login Page");
	}
	@Test
	public  void AdmissionLogin()
	{
		System.out.println("Admission Login Page");
	}
}
