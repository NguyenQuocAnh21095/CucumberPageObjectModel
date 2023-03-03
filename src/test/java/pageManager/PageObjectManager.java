package pageManager;

import org.openqa.selenium.WebDriver;
import pageObject.*;
import webDriverSetup.Wdm;

import java.io.FileInputStream;

public class PageObjectManager extends Wdm {
    private WebDriver driver;
//    private static HomePage homePage;
    private PlaylistsPage playlistsPage;
    private SlidesPage slidesPage;
    private static LoginPage loginPage;
    private static YourAccountsPage yourAccountsPage;

//    public PageObjectManager(WebDriver driver){
//        inputStream = new FileInputStream("src/main/resources/config.properties");
//        prop.load(inputStream);
//        initializeTestBaseSetup(prop.getProperty("browser"),prop.getProperty("appUrl"));
//        this.driver = getDriver();
//        this.driver = driver;
//    }
    public static LoginPage getLoginPage(WebDriver driver){
        return (loginPage == null)? loginPage = new LoginPage(driver): loginPage;
    }

//    public static HomePage getHomePage(WebDriver driver) {
//        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
//    }
    public static YourAccountsPage getYourAccountsPage(WebDriver driver) {
        return (yourAccountsPage == null) ? yourAccountsPage = new YourAccountsPage(driver) : yourAccountsPage;
    }

    public PlaylistsPage getPlaylistsPage(){
        return (playlistsPage == null) ? playlistsPage = new PlaylistsPage(driver) : playlistsPage;
    }

    public SlidesPage getSlidesPage(){
        return (slidesPage == null) ? slidesPage = new SlidesPage(driver) : slidesPage;
    }
}
