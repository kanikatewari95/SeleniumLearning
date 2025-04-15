package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://ui.vision/demo/webtest/frames/");

        //access frame1 using webelement since id and name of frame is not given
        WebElement frame1 = driver.findElement(By.cssSelector("frame[src='frame_1.html']"));

        //since name and id of frame1 is not present hence using WebElement for it
        driver.switchTo().frame(frame1);

        driver.findElement(By.cssSelector("input[name='mytext1']")).sendKeys("Hello");

        driver.switchTo().defaultContent(); // to switch back to the page since we can not jump from 1 frame to another

        //frame2
        WebElement frame2 = driver.findElement(By.cssSelector("frame[src='frame_2.html']"));

        driver.switchTo().frame(frame2);
        driver.findElement(By.cssSelector("input[name='mytext2']")).sendKeys("Welcome");


        //again switch back
        driver.switchTo().defaultContent();

        //frame3
        WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));

        driver.switchTo().frame(frame3);
        driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("Good Day");

        //inner frame of frame3

        WebElement innerFrame = driver.findElement(By.cssSelector("iframe[src$='embedded=true']"));

        driver.switchTo().frame(innerFrame);
        driver.findElement(By.cssSelector("div[aria-label='I am a human']")).click();

        //again switch back to default content
        driver.switchTo().defaultContent();

        //frame4
        WebElement frame4 = driver.findElement(By.cssSelector("frame[src='frame_4.html']"));

        driver.switchTo().frame(frame4);
        driver.findElement(By.cssSelector("input[name='mytext4']")).sendKeys("Bye");
        Thread.sleep(2000);

        driver.quit();
    }
}
