package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UploadFile {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        //Upload single files
        driver.findElement(By.cssSelector("input#singleFileInput")).sendKeys("D:\\samplePDF1.pdf");

        driver.findElement(By.cssSelector("input#singleFileInput + button[type='submit']")).click();
        Thread.sleep(3000);

        //Upload Multiple files
        String file1 = "D:\\samplePDF1.pdf";
        String file2 = "D:\\samplePDF2.pdf";

        driver.findElement(By.cssSelector("input#multipleFilesInput")).sendKeys(file1 + "\n" + file2);
        driver.findElement(By.cssSelector("input#multipleFilesInput + button[type='submit']")).click();
        Thread.sleep(3000);

        driver.quit();



    }
}
