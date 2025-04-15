package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        // find all cookies
        System.out.println(driver.manage().getCookies());

        //find the value of a particular cookie
        System.out.println(driver.manage().getCookieNamed("abc"));

        // add a new cookie
        Cookie newCookie = new Cookie("key", "value");
        System.out.println(driver.manage().getCookieNamed("key"));

        //delete a cookie
        driver.manage().deleteCookieNamed("key");

        //delete all cookies
        driver.manage().deleteAllCookies();

       driver.quit();
    }
}
