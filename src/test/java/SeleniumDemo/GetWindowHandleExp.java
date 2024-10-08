package SeleniumDemo;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandleExp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Set<String> handle = driver.getWindowHandles();
		for(String windowHandle : handle)
		{
			System.out.println("Window handle: "+windowHandle);
		}
	}
}
