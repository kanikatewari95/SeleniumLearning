package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropdownBootstrap {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

        driver.findElement(By.cssSelector("button[class*='btn-default']")).click();

        // Select single option
        driver.findElement(By.cssSelector("input[value='Java']")).click();

        //Capture all options
        List<WebElement> options = driver.findElements(By.cssSelector("ul[class*='multiselect-container'] label"));

        for(WebElement option : options){
            System.out.println(option.getText());
        }

        System.out.println("Number of options : " + options.size());

        // Select multiple elements
        for(WebElement option : options){
            if(option.getText().equals("Python") || option.getText().equals("Oracle")){
                option.click();
            }
        }

        Thread.sleep(2000);


        driver.quit();

    }
}
