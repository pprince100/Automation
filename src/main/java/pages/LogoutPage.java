package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends TestBase {
    public LogoutPage() {PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[@class='Header__avatar css-822rlq']")
    WebElement Avtar;

    @FindBy(xpath = "//span[text()='Sign out']")
    WebElement Signout;

    @FindBy(xpath = "//h2[contains(text(),'Sign into your account')]")
    WebElement VerifyLogout;

    public void Logout(){
        Avtar.click();
        Signout.click();
        webDriverWait();
        webwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Sign into your account')]")));
        String expectedResult = VerifyLogout.getText();
        String actualResult = "Sign into your account";
        Assert.assertEquals(expectedResult, actualResult);
    }
}
