package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowserWindow {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windowIDs = driver.getWindowHandles();

        for(String winid : windowIDs){
            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);

            if(title.equals("OrangeHRM") || title.equals("Fake Title")){
                driver.close();
            }
        }
    }
}
