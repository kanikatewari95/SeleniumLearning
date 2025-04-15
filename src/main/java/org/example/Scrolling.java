package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("Page title is : "+ driver.getTitle());

        Actions act = new Actions(driver);

        WebElement element = driver.findElement(By.cssSelector("button[id='PopUp']"));

        act.scrollToElement(element).perform();

        Thread.sleep(2000);

        driver.quit();
    }
}
