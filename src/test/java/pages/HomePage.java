package pages;

import framework.BaseTest;
import framework.HelperMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    public HelperMethods functions=new HelperMethods(driver);

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this); //initializeaza toate webelementele de pe pagina curenta, care vor fi apelate sub aceasta forma

    }

    @FindBy(id="btn2")
    public WebElement skipsigninweb;

    @FindBy(id="btn1")
    public WebElement loginbuttonWeb;

    // metoda

    public RegisterPage clickskipsignin (){
        functions.clickWebelement(skipsigninweb);
        return new RegisterPage(driver); // trimiterea actiunii catre pagina de Register

    }

    public LoginPage clicksignin(){
        functions.clickWebelement(loginbuttonWeb);
        return new LoginPage(driver);
    }
}
