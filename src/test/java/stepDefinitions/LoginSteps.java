package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageManager.PageObjectManager;
import pageObject.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoginSteps {
    WebDriver driver;
    Properties prop = new Properties();
    LoginPage loginPage;
//    @Given("I login to app")
//    public void i_am_in_homepage() throws IOException {
////        this.driver = getDriver();
//        loginPage = PageObjectManager.getLoginPage(driver);
//        loginPage.loginToApp(prop.getProperty("username"),prop.getProperty("password"));
//    }
}
