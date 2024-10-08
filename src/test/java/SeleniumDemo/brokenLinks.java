package SeleniumDemo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links = (List<WebElement>) driver.findElement(By.xpath("//a"));
		System.out.println("No of links" + links.size());
		for(int i=0;i<=links.size();i++)
		{
			WebElement e1 = links.get(i);
			String linkurl = e1.getAttribute("href");
			verifylinks(linkurl);
		}
		driver.quit();
	}
	public static void verifylinks(String linkurl)
	{
		try {
			URL url = new URL(linkurl);
			HttpURLConnection ht = (HttpURLConnection)url.openConnection();
			ht.setConnectTimeout(5000);
			ht.connect();
			if(ht.getResponseCode()>=400)
			{
				System.out.println(ht+"_"+ht.getResponseMessage()+" ");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
