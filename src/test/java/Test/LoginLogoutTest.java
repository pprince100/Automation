package Test;

import base.TestBase;
import pages.*;
import util.LogUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginLogoutTest extends TestBase {
    public LoginPage loginpage;
    public LogoutPage logoutpage;

    public LoginLogoutTest()
    {
        super();
    }

    @BeforeMethod()
    public void start(){
    initialization();
    sleep();
    loginpage=new LoginPage();
    logoutpage=new LogoutPage();
    }

    @Test
    public void login(){
        loginpage.Login(prop.getProperty("email"), prop.getProperty("password"));
        Sleep();
        logoutpage.Logout();
    }

    @AfterMethod()
    public void Close()
    {
        driver.quit();
    }
}
