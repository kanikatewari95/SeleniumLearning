package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;

public class Screenshots {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/login");

        // 1. fullpage screenshot

        //TakesScreenshot is an interface in Selenium that provides the method getScreenshotAs() for screenshot
        //We cast driver to TakesScreenshot so we can access the getScreenshotAs() method.
        TakesScreenshot ts = (TakesScreenshot)driver; //
        File sourceFile = ts.getScreenshotAs(OutputType.FILE); // capture screenshot
        File targetFile = new File("fullpage.png"); // set the destination path
        sourceFile.renameTo(targetFile); //save screenshot at target location

        //2. screenshot of a specific portion
        WebElement portion = driver.findElement(By.cssSelector("div[class*='returning-wrapper']"));

        File source = portion.getScreenshotAs(OutputType.FILE);
        File target = new File("specific.png");
        source.renameTo(target);

        //3. screenshot of a specific webelement
        WebElement logo = driver.findElement(By.cssSelector("div[class='header-logo']"));

        File srcLogo = logo.getScreenshotAs(OutputType.FILE);
        File targetLogo = new File("logo.png");
        srcLogo.renameTo(targetLogo);

        driver.quit();
    }
}
