package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage extends TestBase {
    public LoginPage() {PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//input[@id='signInName']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//button[text()='Sign in']")
    WebElement Signin;

    @FindBy(xpath = "//h2[text()='Select an organization']")
    WebElement VerifyLogin;

    public void Login(String email, String password){
        Email.sendKeys(email);
        Password.sendKeys(password);
        Signin.click();
        webDriverWait();
        webwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Select an organization']")));
        String expectedResult = VerifyLogin.getText();
        String actualResult = "Select an organization";
        Assert.assertEquals(expectedResult, actualResult);
    }
}
