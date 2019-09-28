package pages;

import framework.BaseTest;
import framework.HelperMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends BaseTest {

    public HelperMethods functions=new HelperMethods(driver);
    public RegisterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this); //initializeaza toate webelementele de pe pagina curenta, care vor fi apelate sub aceasta forma

    }

    //declarare webelemente

    //completare camp First Name
    @FindBy(xpath="//input[@placeholder='First Name']")
    public WebElement FirstNameWeb;

    @FindBy(xpath="//input[@placeholder='Last Name']")
    public WebElement lastnameWeb;

    @FindBy(xpath="//input[@type='email']")
    public WebElement emailWeb;

    @FindBy(xpath="//input[@ng-model='Phone']")
    public WebElement phoneWeb;


    //metode

    //register process
    public RegisterPage registerValidProcess(List<String> registerValues){
        String proba="Flavian";
        functions.completareWebelement(FirstNameWeb,registerValues.get(0));
        functions.completareWebelement(lastnameWeb,registerValues.get(1));
        functions.completareWebelement(emailWeb,registerValues.get(2));
        functions.completareWebelement(phoneWeb,registerValues.get(3));
        return this;
    }
}
