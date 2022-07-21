package org.mytest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class udemy {
    @Test
    public void udemy() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.price.ro/");
       // Thread.sleep(5000);  // Let the user actually see something!
       // WebElement searchBox = driver.findElement(By.name("q"));
       // searchBox.sendKeys("ChromeDriver");
       // searchBox.submit();
       // Thread.sleep(5000);  // Let the user actually see something!
       // driver.quit();
    }
}