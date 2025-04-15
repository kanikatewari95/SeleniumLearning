package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleMultipleElements {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        WebElement element1 = driver.findElement(By.xpath("//textarea[@title='Search']"));
        element1.click();
        element1.sendKeys("Automation");

        driver.navigate().to("https://trytestingthis.netlify.app/");

        List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
        for(WebElement option : options){
            System.out.println(option.getText());
        }

        driver.quit();
    }
}
