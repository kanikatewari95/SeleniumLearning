package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       // Fluent wait

        Wait<WebDriver> mywait = new org.openqa.selenium.support.ui.FluentWait<>(driver)
                                .withTimeout(Duration.ofSeconds(10))
                                .pollingEvery(Duration.ofSeconds(1))
                                .ignoring(NoSuchElementException.class);

       WebElement txtusername =  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='username']")));
       txtusername.sendKeys("Admin");

       Thread.sleep(3000);

        driver.quit();
    }
}
