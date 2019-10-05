package teste;

import framework.BaseTest;
import framework.HelperMethods;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;

public class Login_home_test extends BaseTest {

    @Test
    public void logintest(){

        HomePage homePage=new HomePage(driver);
        homePage.clicksignin();

        String emailvalue=BaseTest.returnvalue("loginemail");
        String passwordvalue=BaseTest.returnvalue("loginpassword");
        String errorvalue=BaseTest.returnvalue("errormessage");

        LoginPage loginpage=new LoginPage(driver);
        loginpage.loginprocess(emailvalue,passwordvalue);
        loginpage.validateerrormessage(errorvalue);

    }




}
