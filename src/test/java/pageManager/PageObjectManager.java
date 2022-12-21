package pageManager;

import org.openqa.selenium.WebDriver;
import pageObject.HomePage;
import pageObject.PlaylistsPage;
import pageObject.SlidesPage;

public class PageObjectManager {
    private WebDriver driver;
    private static HomePage homePage;
    private PlaylistsPage playlistsPage;
    private SlidesPage slidesPage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public static HomePage getHomePage(WebDriver driver) {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public PlaylistsPage getPlaylistsPage(){
        return (playlistsPage == null) ? playlistsPage = new PlaylistsPage(driver) : playlistsPage;
    }

    public SlidesPage getSlidesPage(){
        return (slidesPage == null) ? slidesPage = new SlidesPage(driver) : slidesPage;
    }
}
