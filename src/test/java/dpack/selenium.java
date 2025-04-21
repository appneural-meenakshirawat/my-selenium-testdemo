package dpack;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class  selenium {

    public static void main( String[] args ){
        

        WebDriverManager.firefoxdriver().setup(); // Automatically downloads and sets path
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
           // Example use of By
        driver.findElement(By.name("q")).sendKeys("Hello Selenium!");
//   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        driver.quit();
      
}  
    }
