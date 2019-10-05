package framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public FileInputStream file;
    public static Properties property;


    //folosire @Before
    @Before
    public void setup(){

        //setare driver de Chrome, trebuie specificata de fiecare data, in fiecare test
        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");

        //initializarea variabilei driver cu browserul pe care vrem sa il folosim;
        driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Index.html");

        //browser mare (full screen)
        driver.manage().window().maximize();

        //declarare wait implicit
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        loadfileproperties();
    }

    public void loadfileproperties(){

        property=new Properties();
        try {
            file=new FileInputStream("E:\\Automation\\automation_practice\\src\\test\\resources\\inputdata\\Inputdata.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            property.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //metoda care returneaza valoarea dintr-un property file pe baza unei chei
    public static String returnvalue(String key){

        return property.getProperty(key);

    }

    //folosire @After
   /* @After
    public void end(){
        driver.quit();

    }

    */

}
