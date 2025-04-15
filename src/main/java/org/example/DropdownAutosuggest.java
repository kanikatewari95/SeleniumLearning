package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DropdownAutosuggest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://google.com");
        driver.findElement(By.cssSelector("textarea[name='q']")).sendKeys("Selenium");

        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        for(WebElement option : options){
            if(option.getText().equals("selenium interview questions")){
                option.click();
                break;
            }
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
