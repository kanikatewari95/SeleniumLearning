package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {
    public static void main(String[] args) {

       // enable headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("Page title is : "+ driver.getTitle());

        driver.quit();
    }
}
