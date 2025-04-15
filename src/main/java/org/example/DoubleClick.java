package org.example;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.cssSelector("input#field1")).clear();
        driver.findElement(By.cssSelector("input#field1")).sendKeys("Welcome");

        WebElement button = driver.findElement(By.cssSelector("button[ondblclick='myFunction1()']"));

        Actions act = new Actions(driver);

        act.doubleClick(button).perform();

        // Validation of text
        String text = driver.findElement(By.cssSelector("input#field2")).getDomAttribute("value");

        if(text.equals("Welcome")){
            System.out.println("Text copied successfully");
        }
        else{
            System.out.println("Text not copied");
        }


        driver.quit();
    }
}
