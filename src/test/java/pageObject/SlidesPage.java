package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SlidesPage {
    public SlidesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
