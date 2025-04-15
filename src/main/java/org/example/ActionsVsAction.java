package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsVsAction {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        // Actions is a class that is used to perform user interactions (mouse or keyboard actions )
        Actions act = new Actions(driver);

        WebElement button  = driver.findElement(By.cssSelector("span[class*='context-menu-one']"));

        //Action is an interface that is used to store the created action

        // right click on a button
        Action myaction = act.contextClick(button).build();

        myaction.perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
