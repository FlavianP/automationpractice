package pages;

import framework.BaseTest;
import framework.HelperMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    public HelperMethods functions=new HelperMethods(driver);

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//body//input[@type='text']")
    public WebElement emailWeb;

    @FindBy(xpath="//body//input[@type='password']")
    public WebElement passwordWeb;

    @FindBy(id="enterbtn")
    public WebElement enterbuttondWeb;

    @FindBy(id="errormsg")
    public WebElement errorLoginWeb;

    //numele de clase sunt scrise cu litere mari
    //numele de variabile, pachete si metode cu litere mici

    //metoda

    public LoginPage loginprocess(String email, String password){
        functions.completareWebelement(emailWeb,email);
        functions.completareWebelement(passwordWeb,password);
        functions.clickWebelement(enterbuttondWeb);
        return this;

    }

    public LoginPage validateerrormessage(String expected){
        String actual=functions.getWebtext(errorLoginWeb);
        functions.validateMessage(expected,actual);
        return this;

    }



}


