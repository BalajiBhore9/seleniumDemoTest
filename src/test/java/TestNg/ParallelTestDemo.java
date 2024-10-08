package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestDemo {

	WebDriver driver = null;
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("Test1 execution "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.close();	
	}
	@Test
	public void test2() throws InterruptedException
	{
		System.out.println("Test2 execution "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
		driver.close();
	}
}
