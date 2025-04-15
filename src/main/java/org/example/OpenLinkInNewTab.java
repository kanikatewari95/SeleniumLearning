package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenLinkInNewTab {

    //using Keyboard actions
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demo.nopcommerce.com/login");

        WebElement link = driver.findElement(By.cssSelector("a[class='ico-register']"));

        Actions act = new Actions(driver);

        //open link in new tab using keyboard actions (Ctrl+click)
        act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();

        // store all window ids
        Set<String> windowIDs = driver.getWindowHandles();

        //convert Set into Arraylist as set does not have any get() method
        List<String> windowList = new ArrayList<>(windowIDs);

        String parentId = windowList.get(0);
        String childId = windowList.get(1);

        driver.switchTo().window(childId); //switch to registration page

        driver.findElement(By.cssSelector("span.female")).click();
        driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Kanika");

        Thread.sleep(2000);

        // switch back to login window
        driver.switchTo().window(parentId);

        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Ipad 16 pro max");

        Thread.sleep(2000);

        driver.quit();
    }
}
