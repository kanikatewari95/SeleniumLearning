package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Sliders {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

        Actions act = new Actions(driver);

        // Moving min slider
        WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println(" Position of min slider before moving : " + min_slider.getLocation()); //(59,256)

        //drag the slider in x-axis
        act.dragAndDropBy(min_slider, 100, 256).perform();
        System.out.println(" Position of min slider after moving : " + min_slider.getLocation());


        // Moving max slider
        WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println(" Position of max slider before moving : " + max_slider.getLocation()); //(612,256)

        act.dragAndDropBy(max_slider,-100,256).perform();
        System.out.println(" Position of max slider after moving : " + max_slider.getLocation());

        driver.quit();
    }
}
