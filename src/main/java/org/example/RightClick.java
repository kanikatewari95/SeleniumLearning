package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClick {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions act = new Actions(driver);

        WebElement button  = driver.findElement(By.cssSelector("span[class*='context-menu-one']"));

        // right click on a button
        act.contextClick(button).perform();

        // click on copy
        driver.findElement(By.cssSelector("li[class*='context-menu-icon-copy']")).click();

        // close the alert window
        driver.switchTo().alert().accept();

        driver.quit();
    }
}
