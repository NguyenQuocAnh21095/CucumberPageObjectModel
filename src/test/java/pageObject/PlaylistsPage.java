package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PlaylistsPage {
    public PlaylistsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
