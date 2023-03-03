package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountsPage {
    public YourAccountsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "ctl01_catList_ctl06_CloseTwoFactorAuthModal")
    private WebElement close_btx;
    public void close_2FA_popup(){
        close_btx.click();
    }
}
