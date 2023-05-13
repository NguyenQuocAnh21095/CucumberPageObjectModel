package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageManager.PageObjectManager;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.YourAccountsPage;
import webDriverSetup.Wdm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CommonSteps extends Wdm {
    WebDriver driver;
//    DataHelper dataHelper = new DataHelper();
    Properties prop = new Properties();
    InputStream inputStream = null;
    HomePage homePage;
    LoginPage loginPage;
    YourAccountsPage yourAccountsPage;

    @Given("I open app with url")
    public void i_open_app_with_url() throws IOException {
        inputStream = new FileInputStream("src/main/resources/config.properties");
        prop.load(inputStream);
        initializeTestBaseSetup(prop.getProperty("browser"),prop.getProperty("appUrl"));
        this.driver = getDriver();
    }

    @Given("I login to app")
    public void i_am_in_homepage() throws IOException {
        loginPage = PageObjectManager.getLoginPage(driver);
        loginPage.loginToApp(prop.getProperty("username"),prop.getProperty("password"));
    }
    @Given("I close 2FA pop up")
    public void i_close_2FA_popup(){
        yourAccountsPage = PageObjectManager.getYourAccountsPage(driver);
        yourAccountsPage.close_2FA_popup();
    }
    @Given("I close current browser")
    public void close_current_browser(){
        driver.quit();
    }
}
