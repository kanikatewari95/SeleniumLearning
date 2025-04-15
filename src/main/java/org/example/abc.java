package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class abc {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("abcd");
        Thread.sleep(3000);
        driver.quit();
    }
}
