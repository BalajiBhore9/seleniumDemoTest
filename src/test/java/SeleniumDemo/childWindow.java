package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class childWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // Open new window by clicking the button
         driver.findElement(By.id("windowButton")).click();

         // Click on the new window element and read the text displayed on the window
         WebElement text = driver.findElement(By.id("windowButton"));
   
         // Fetching the text using method and printing it     
         System.out.println("Element found using text: " + text.getText());
         driver.quit();
    }
}
