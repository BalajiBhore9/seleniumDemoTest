package SeleniumDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File disti = new File("C:\\Users\\HARSHVARDHAN\\Desktop\\Selenium\\ScreenShot\\abc.jpg");
		FileHandler.copy(source, disti);
		Thread.sleep(1000);
		driver.close();
	}

}
