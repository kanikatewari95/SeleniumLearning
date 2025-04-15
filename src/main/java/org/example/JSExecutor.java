package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JSExecutor {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        // driver is object of Chromedriver class to which we are storing to js variable as JSExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // inserting on an input box same as sendKeys()
        WebElement name = driver.findElement(By.cssSelector("input[id='name']"));
        js.executeScript("arguments[0].setAttribute('value', 'kanika')", name);

        //clicking on a radio button
        WebElement radioBtn = driver.findElement(By.cssSelector("input[id='female']"));
        js.executeScript("arguments[0].click()",radioBtn);

//        //scroll the page using pixel number
//        js.executeScript("window.scrollBy(0,519)");
//        System.out.println(js.executeScript("return window.pageYOffset")); //get the y axis pixel

//        //scroll page till the element is visible
//        WebElement btn = driver.findElement(By.cssSelector("button[id='PopUp']"));
//        js.executeScript("arguments[0].scrollIntoView()", btn);
//        System.out.println(js.executeScript("return window.pageYOffset")); //get the y axis pixel

        //scroll page till end
        js.executeScript("window.scrollBy(0,document.body.scrollheight)");
        System.out.println(js.executeScript("return window.pageYOffset")); //get the y axis pixel

        Thread.sleep(3000);

        // scroll up to initial position
       // js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

        driver.quit();



    }
}
