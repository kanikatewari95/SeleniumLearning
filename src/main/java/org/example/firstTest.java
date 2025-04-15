package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[] args) {

        //driver is declared as a WebDriver Interface type, allowing it to work with different browser drivers
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login");
        System.out.println("Page title is : "+ driver.getTitle());

        driver.findElement(By.cssSelector("[id='Email']")).click();
        driver.findElement(By.cssSelector("[id='Email']")).clear();
        driver.findElement(By.cssSelector("[id='Email']")).sendKeys("admin@yourstore.com");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("admin");

        WebElement LoginButton = driver.findElement(By.cssSelector("button[class$='login-button']"));
        System.out.println("Text on login button is : " + LoginButton.getText());
        LoginButton.click();

        System.out.println(driver.getCurrentUrl()); //to get current URL

        driver.close(); //close the current opened browser

        driver.quit(); //quit the browser session( close all browser instances )
    }
}
