package dpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumChrome {
   
    public static void main( String[] args ){
      
       System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver"); 
 



       // WebDriverManager.chromedriverdriver().setup(); // Automatically downloads and sets path

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
           // Example use of By
        driver.findElement(By.name("q")).sendKeys("Hello Selenium!");
//   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        driver.quit();
      
    }
}
