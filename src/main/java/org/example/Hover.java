package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Hover {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");

        // Hover
        WebElement pointMe = driver.findElement(By.cssSelector("button.dropbtn"));
        WebElement laptop = driver.findElement(By.xpath("//div[@class='dropdown-content']/a[2]"));

        //Action is a predefined class in Selenium used for handling advanced user interactions like hover, drag and drop, double click, right-click
        Actions hoverAct = new Actions(driver);
        hoverAct.moveToElement(pointMe).moveToElement(laptop).perform();
        Thread.sleep(2000);

       driver.quit();
    }
}
