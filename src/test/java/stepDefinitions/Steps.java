package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageManager.PageObjectManager;
import pageObject.HomePage;
import webDriverSetup.Wdm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Steps extends Wdm {
    WebDriver driver;
//    DataHelper dataHelper = new DataHelper();
    Properties prop = new Properties();
    InputStream inputStream = null;
    HomePage homePage;

    public Steps() throws IOException {
        inputStream = new FileInputStream("src/main/resources/config.properties");
        prop.load(inputStream);
        initializeTestBaseSetup(prop.getProperty("browser"),prop.getProperty("appUrl"));
        this.driver = getDriver();
    }

    @Given("I am in homepage")
    public void i_am_in_homepage() {
        homePage = PageObjectManager.getHomePage(driver);
        homePage.loginToApp(prop.getProperty("username"),prop.getProperty("password"));
    }

}
