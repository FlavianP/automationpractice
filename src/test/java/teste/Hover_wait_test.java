package teste;

import framework.BaseTest;
import framework.HelperMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hover_wait_test extends BaseTest {

    @Test
    public void Hoverwaittest(){

        HelperMethods functions= new HelperMethods(driver);


        //hover 4 - hover la un SwitchElement
        WebElement switchtoWeb=driver.findElement(By.xpath("//a[contains(text(),'Switch')]"));
        functions.hoverWebelement(switchtoWeb);

        //Actions action4=new Actions(driver);
        //action4.moveToElement(switchtoWeb).build().perform();

        //aplicare de wait explicit

        WebElement windowsWeb=driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
        new WebDriverWait(driver,5000).until(ExpectedConditions.visibilityOf(windowsWeb));
        windowsWeb.click();
    }

}
