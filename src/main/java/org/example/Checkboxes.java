package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        //check specific checkbox
        driver.findElement(By.cssSelector("input[id='wednesday']")).click();

        //uncheck a checked checkbox
        driver.findElement(By.cssSelector("input[id='wednesday']")).click();

        // select all checkboxes
       List<WebElement> checkboxes =  driver.findElements(By.cssSelector("input[class='form-check-input'][type='checkbox']"));

//       for(WebElement checkbox : checkboxes){
//           checkbox.click();
//       }


       // select last 3 checkboxes
        for(int i=4; i<checkboxes.size();i++){ //starting index = total size- checkboxes to select
            checkboxes.get(i).click();
        }

        // uncheck only the checked checkboxes
        for(int i=0; i< checkboxes.size();i++){
            if(checkboxes.get(i).isSelected()){
                checkboxes.get(i).click();
            }
        }

        Thread.sleep(200);

       driver.quit();
    }
}
