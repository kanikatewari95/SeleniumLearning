package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameTxtbox = By.id("Email");
    private  By passwordTxtbox = By.id("Password");
    private By loginBtn = By.cssSelector("button[class*='login-button']");

    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameTxtbox).clear();
        driver.findElement(usernameTxtbox).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordTxtbox).clear();
        driver.findElement(passwordTxtbox).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();

    }
}
