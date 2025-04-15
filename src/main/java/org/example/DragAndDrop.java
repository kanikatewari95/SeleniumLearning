package org.example;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement source = driver.findElement(By.cssSelector("div#draggable"));
        WebElement destination = driver.findElement(By.cssSelector("div#droppable"));

        Actions act = new Actions(driver);

        act.dragAndDrop(source,destination).perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
