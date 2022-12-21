package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "ctl01$cPC$ctl00$UserName")
    private WebElement user_txtbx;
    @FindBy(name = "ctl01$cPC$ctl00$Password")
    private WebElement pass_txtbx;
    @FindBy(name = "ctl01$cPC$ctl00$ibLogin")
    private WebElement login_btn;

    public void enterUser_txtbx(String username) {
        user_txtbx.sendKeys(username);
    }

    public void enterPass_txtbx(String password) {
        pass_txtbx.sendKeys(password);
    }

    public void clickLogin_btn() {
        login_btn.click();
    }

    public void loginToApp(String username, String password){
        enterUser_txtbx(username);
        enterPass_txtbx(password);
        clickLogin_btn();
    }
}
