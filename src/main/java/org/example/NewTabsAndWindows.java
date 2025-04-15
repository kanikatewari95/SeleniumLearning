package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class NewTabsAndWindows {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       // driver.switchTo().newWindow(WindowType.TAB); //it'll open a new tab in the same window and focus will be on new tab

        driver.switchTo().newWindow(WindowType.WINDOW);// It'll open a new window and perform next tasks on that

        driver.get("https://google.com");
        driver.quit();
    }
}
