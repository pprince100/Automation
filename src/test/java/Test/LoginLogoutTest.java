package Test;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import pages.*;

public class LoginLogoutTest extends TestBase {
    public LoginPage loginpage;
    public LogoutPage logoutpage;

    public LoginLogoutTest(){super();}

    @BeforeTest()
    public void start(){
    initialization();
    webDriverWait();
    webwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signInName']")));
    loginpage=new LoginPage();
    logoutpage=new LogoutPage();
    }

    @Test
    public void login(){
        loginpage.Login(prop.getProperty("email"), prop.getProperty("password"));
    }

    @Test
    public void logout(){
        login();
        logoutpage.Logout();
    }

    @AfterTest()
    public void Close()
    {
        driver.quit();
    }
}
