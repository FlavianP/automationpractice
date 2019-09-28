package teste;

import framework.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class List_webElements_Test extends BaseTest {

    @Test
    public void testbutoane(){

        List<WebElement>hobbiesWeb=driver.findElements(By.xpath("//input[@type='checkbox']")); // heap=spatiu dinamic
        List<WebElement>hobbiesTextWeb=driver.findElements(By.xpath("//label[@class='checks']"));

        //validare butoane
        int expectedresult=3; //stack = spatiu static
        int actualresult=hobbiesWeb.size();
        Assert.assertEquals(expectedresult,actualresult);

        for (int i=0;i<hobbiesWeb.size();i++){
            String expectedResult="Movies";
            String actualResult=hobbiesTextWeb.get(i).getText();
            if(actualResult.equals(expectedResult)){
                hobbiesWeb.get(i).click();
            }

        }

    }

}
