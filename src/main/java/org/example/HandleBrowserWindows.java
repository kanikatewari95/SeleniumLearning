package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        // store all window ids in a set
        Set<String> windowIDs = driver.getWindowHandles();

        //APPROACH 1

        //convert set of windowIDs to List since in set we can not get element based on their index
        List<String> windowList = new ArrayList<>(windowIDs);

        String parentID = windowList.get(0); //get the window id of parent window
        String childID = windowList.get(1); //get the window id of child window

        System.out.println("Before switching to child window the title still is : " + driver.getTitle());

        driver.switchTo().window(childID);
        System.out.println("After switching to child window the title is : " + driver.getTitle());

        driver.switchTo().window(parentID);
        System.out.println("After switching back to parent window the title is : " + driver.getTitle());

//        // APPROACH 2
//
//        for(String windowID : windowIDs){
//            String title = driver.switchTo().window(windowID).getTitle();
//
//            if(title.equals("OrangeHRM")){
//                System.out.println(driver.getCurrentUrl());
//            }
//
//        }

        driver.quit();
    }
}
