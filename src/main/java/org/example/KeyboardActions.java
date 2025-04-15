package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://text-compare.com/");

        driver.findElement(By.cssSelector("textarea[id='inputText1']")).sendKeys("Welcome");

        Actions act = new Actions(driver);

        // Ctrl+A
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //Ctrl+C
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //Tab
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //Enter
        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

        //Ctrl+V
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);

        driver.quit();
    }
}
