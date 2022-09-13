package pages;

import base.TestBase;
import util.LogUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends TestBase {
    public LogoutPage() {PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[@class='Header__avatar css-822rlq']")
    WebElement Avtar;

    @FindBy(xpath = "//span[text()='Sign out']")
    WebElement Signout;

    public void Logout(){
        Avtar.click();
        LogUtils.info("Clicked on Avtar");
        Signout.click();
        LogUtils.info("Clicked on Signout");
    }
}
