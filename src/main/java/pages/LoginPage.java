package pages;

import base.TestBase;
import util.LogUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    public LoginPage() {PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//input[@id='signInName']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//button[text()='Sign in']")
    WebElement Signin;

    public void Login(String email, String password){
        Email.sendKeys(email);
        LogUtils.info("Email Entered");
        Password.sendKeys(password);
        LogUtils.info("Password Entered");
        Signin.click();
        LogUtils.info("Clicked on Signin button");

    }
}
