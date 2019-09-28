package teste;

/*webdriver e un tip de variabila ( la fel ca string, int etc.)
selenium e un framework
*/

import framework.BaseTest;
import framework.HelperMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Register_test extends BaseTest {

  // declarare variabila tip webdriver
    // public WebDriver driver;
    //salut

    @Test //specifica faptul ca aceasta metoda e un test;
    public void test(){

        //declarare obiect de tip HelperMethods;
        HelperMethods functions=new HelperMethods(driver);


        /*
        //setare driver de Chrome, trebuie specificata de fiecare data, in fiecare test
        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");

        //initializarea variabilei driver cu browserul pe care vrem sa il folosim;
        driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");

        //broswer mare (full screen)
        driver.manage().window().maximize();

        inclus in BaseTest */


        //validare pagina de register
        String expectedRegistervalue=BaseTest.returnvalue("registertitle");
        functions.validareTitle(expectedRegistervalue);

        //String actualRegistervalue=driver.getTitle();
        //Assert.assertEquals(expectedRegistervalue,actualRegistervalue);

        //validare textpepagina
        /*String expectedText1="Full Name*";
        WebElement text1Web = driver.findElement(By.className("form-group"));
        String actualText1=text1Web.getText();
        Assert.assertEquals(expectedText1,actualText1);
        */

        //validaretextpagina_Full Name
        String expectedText1="Full Name*";
        WebElement text1Web = driver.findElement(By.xpath("//div[@class='form-group'][1]/label"));
        String actualText1=text1Web.getText();
        Assert.assertEquals(expectedText1,actualText1);

        //validaretextpagina_Address
        String expectedText2="Address";
        WebElement text2Web = driver.findElement(By.xpath("//div[@class='form-group'][2]/label"));
        String actualText2=text2Web.getText();
        Assert.assertEquals(expectedText2,actualText2);

        //validaretextpagina_Email Address
        String expectedText3="Email address*";
        WebElement text3Web = driver.findElement(By.xpath("//div[@class='form-group'][3]/label"));
        String actualText3=text3Web.getText();
        Assert.assertEquals(expectedText3,actualText3);



        //automatizare flow creare cont si interactiune cu elementele
        /*o pagina are unul sau mai multe web elemente (buton, cerc, titlu etc.) cu care se poate interactiona de unul
        sau mai multe ori*/
        //un web element are o adresa exact, data de codul HTML din spate (xpath);



        //completare camp First Name
        WebElement firstnameWeb=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        String firstnameValue=BaseTest.returnvalue("firstname");
        functions.completareWebelement(firstnameWeb,firstnameValue);

        //firstnameWeb.sendKeys(firstnameValue);
        //sendkeys completeaza o valoare pe un web element;

        //completare camp Last Name
        WebElement lastnameWeb=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        String lastnameValue="Catalin";
        functions.completareWebelement(lastnameWeb,lastnameValue);
        //lastnameWeb.sendKeys(lastnameValue);


        //completare camp email
        WebElement emailWeb=driver.findElement(By.xpath("//input[@type='email']"));
        String emailValue="catalin@yahoo.com";
        emailWeb.sendKeys(emailValue);


        //completare camp telefon
        WebElement phoneWeb=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
        String phoneValue="0741079704";
        phoneWeb.sendKeys(phoneValue);

        //click pe gen
        WebElement genderWeb=driver.findElement(By.xpath("//input[@value='Male']"));
        genderWeb.click();

        //click pe hobby
        WebElement hobbyWeb=driver.findElement(By.id("checkbox1"));
        hobbyWeb.click();

        //selectare skills
        WebElement skillsWeb=driver.findElement(By.id("Skills"));
        String skillsvalue="C";
        Select skillsSelect=new Select(skillsWeb);
        skillsSelect.selectByVisibleText(skillsvalue);

        //selectare country
        WebElement countryWeb=driver.findElement(By.id("countries"));
        String countryValue="Romania";
        Select countrySelect=new Select(countryWeb);
        countrySelect.selectByValue(countryValue);

/*
        //selectare country2
        WebElement countryWeb2=driver.findElement(By.xpath("//span[@role='combobox']"));
        countryWeb2.click();
        String country2="Japan";
        WebElement selectBara=driver.findElement(By.xpath("//input[@role='textbox']"));
        selectBara.sendKeys(country2);
        driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);

*/
        //selectare year
        WebElement yearWeb=driver.findElement(By.id("yearbox"));
        String yearvalue="2000";

        functions.selectareWebelementvaloare(yearWeb,yearvalue);
        //Select yearSelect=new Select(yearWeb);
        //yearSelect.selectByValue(yearvalue);

        //selectare month
        WebElement monthWeb=driver.findElement(By.xpath("//select[@placeholder='Month']"));
        String monthvalue="August";
        Select monthSelect=new Select(monthWeb);
        monthSelect.selectByValue(monthvalue);

        //select day
        WebElement dayWeb=driver.findElement(By.xpath("//select[@placeholder='Day']"));
        String dayvalue="19";
        Select daySelect=new Select(dayWeb);
        daySelect.selectByValue(dayvalue);

        //validare mesaj Date of Birth
        WebElement dateofbirthWebmessage=driver.findElement(By.xpath("//label[contains(text(),'Birth')]"));
        String expectedMessage="Date Of Birth";
        String actualMessage=dateofbirthWebmessage.getText(); // .getText() preia textul de pe un webelement
        Assert.assertEquals("Valorile sunt diferite",expectedMessage,actualMessage);


        //completare parola
        WebElement parolaWeb=driver.findElement(By.id("firstpassword"));
        String parolaValue="Catalin1";
        parolaWeb.sendKeys(parolaValue);

        //completare confirmparola
        WebElement confirmparolaWeb=driver.findElement(By.id("secondpassword"));
        String confirmparolaValue="Catalin12";
        confirmparolaWeb.sendKeys(confirmparolaValue);


/*      //selectare uploadphoto
        WebElement uploadphotoWeb=driver.findElement(By.xpath("//input[@type='file']"));
        uploadphotoWeb.sendKeys("C:\\Users\\Catalin\\Desktop\\Azimut\\picture.jpg");


        //click refresh
        WebElement refreshWeb=driver.findElement(By.id("Button1"));
        refreshWeb.click();
*/

        //click submit
        WebElement submitWeb=driver.findElement(By.id("submitbtn"));
        submitWeb.click();

        //validation text passwords_don't_match


        /*
        //verify validationtext_email
        WebElement emailWeb2=driver.findElement(By.xpath("//input[@type='email']"));
        String validationMessage=emailWeb2.getAttribute("validationMessage");
        System.out.println(validationMessage);
*/


/*



        //verify validationtext_FirstName
        WebElement firstnameWeb2=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        String validationMessage=firstnameWeb2.getAttribute("validationMessage");
        System.out.println(validationMessage);
*/


        //hover
        //Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        //action.moveToElement(we).build().perform();
        we.clear(); //sterge valoarea de pe un webelement;
        functions.hoverWebelement(we);


        /*
        //hover2
        Actions action2 = new Actions(driver);
        WebElement we2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        action2.moveToElement(we2).build().perform();



        //hover3
        Actions action3 = new Actions(driver);
        WebElement we3 = driver.findElement(By.xpath("//input[@type='file']"));
        action3.moveToElement(we3).build().perform();
 */


        //validare pagina Windows
        String expectedWindowsvalue="Frames & windows";
        String actualWindowsvalue=driver.getTitle();
        Assert.assertEquals(expectedWindowsvalue,actualWindowsvalue);
/*
        //selectare country2_metoda2
        WebElement countryWeb2=driver.findElement(By.xpath("//span[@role='combobox']"));
        countryWeb2.click();
        String country2="a";
        WebElement selectBara=driver.findElement(By.xpath("//input[@role='textbox']"));
        selectBara.sendKeys(country2);
        driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
        //(?)driver.findElement(By.xpath("//input[@role='textbox']")).click();
*/

        //inchide fereastra automat
        //driver.quit(); //inchide browserul complet, cu sau fara taburi
        //driver.close(); //inchide browserul curent



    }

}
