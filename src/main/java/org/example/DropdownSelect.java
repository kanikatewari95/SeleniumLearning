package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropdownSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement dropdownOptions = driver.findElement(By.cssSelector("select[id='country']"));
        Select dropdownOption = new Select(dropdownOptions); // Creates a Select class object, which provides methods to work with dropdowns.

        //select option from dropdown
        //1. select by visible text
        dropdownOption.selectByVisibleText("France");
        Thread.sleep(2000);

        //2. Select by index
        dropdownOption.selectByIndex(5);
        Thread.sleep(2000);

        //3. Select by value
        dropdownOption.selectByValue("germany");
        Thread.sleep(2000);

        //capture number of options in dropdown
        List<WebElement> options = dropdownOption.getOptions();
        System.out.println("Number of options in the dropdown : " + options.size());

        // print the options
        for(WebElement option : options){
            System.out.println(option.getText());
        }

        driver.quit();

    }

}
