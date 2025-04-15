package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        // SearchContext is the return type of getShadowRoot() method
        SearchContext shadow = driver.findElement(By.cssSelector("div#shadow_host")).getShadowRoot();
        shadow.findElement(By.cssSelector("input[type='text']")).sendKeys("Hello");
        Thread.sleep(3000);

        driver.quit();

    }
}
