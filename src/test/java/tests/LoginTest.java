package tests;

import org.pages.BaseTest;
import org.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void testValidLogin(){

        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickLogin();

        System.out.println("Title of the page is : " + driver.getTitle());

    }
}
