package teste;

import framework.BaseTest;
import org.junit.Test;
import pages.RegisterPage;

import java.util.ArrayList;
import java.util.List;

public class RegisterPom_test extends BaseTest {

    @Test
    public void test(){

        RegisterPage registerPage=new RegisterPage(driver);
        List<String> registerValues=new ArrayList<String>();
        String initialValues=BaseTest.returnvalue("registerValues");
        String [] split=initialValues.split(",");
        for (int index=0;index<split.length;index++){
            registerValues.add(split[index]);
        }
        registerPage.registerValidProcess(registerValues);

    }


}
