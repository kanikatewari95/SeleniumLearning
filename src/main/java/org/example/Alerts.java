package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        // 1. Normal Alert
       driver.findElement(By.cssSelector("button[id='alertBtn']")).click();

       Alert simpleAlert = driver.switchTo().alert();
       System.out.println("Normal Alert message is : " + simpleAlert.getText());
       simpleAlert.accept();

       // 2. Confirmation Alert
        driver.findElement(By.cssSelector("button[id='confirmBtn']")).click();

        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirmation Alert message is : " + confirmAlert.getText());
        Thread.sleep(2000);
        //driver.switchTo().alert().accept(); // click on OK button
        driver.switchTo().alert().dismiss(); //click on Cancel button

        // 3. prompt Alert
        driver.findElement(By.cssSelector("button[id='promptBtn']")).click();

        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(3000);
        promptAlert.sendKeys("Kanika");

        promptAlert.accept();
        Thread.sleep(3000);

       driver.quit();
    }
}
