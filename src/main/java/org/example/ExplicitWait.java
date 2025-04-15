package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //explicit wait
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //WebDriverWait is a Selenium class that allows waiting for a condition to be met before proceeding

        WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='username']")));
        txtusername.sendKeys("Admin");

        WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='password']")));
        txtpassword.sendKeys("admin123");

        WebElement loginbtn = mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class*='orangehrm-login-button']")));
        loginbtn.click();

        driver.quit();
    }
}
