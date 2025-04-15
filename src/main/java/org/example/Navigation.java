package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title is :" + driver.getTitle());

        driver.navigate().to("https://www.amazon.com/"); // use when we want to move back and forward 
        System.out.println("Title is :" + driver.getTitle());

        //navigate back
        driver.navigate().back();
        System.out.println("Title is :" + driver.getTitle());

        //navigate forward
        driver.navigate().forward();
        System.out.println("Title is :" + driver.getTitle());

        //refresh the page
        driver.navigate().refresh();

        driver.quit();
    }
}
