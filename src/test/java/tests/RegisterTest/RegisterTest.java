package tests.RegisterTest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import tests.BaseTest;
import org.testng.annotations.Test;
import static pages.BasePage.getBaseUrl;
import static pages.BasePage.driver;
import static pages.BasePage.*;
public class RegisterTest extends BaseTest {
    public  static final  Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl= getBaseUrl() + "Register.html";

    @Test
    public void fillRegister(){
        driver.get(newUrl);
        sleep(3000L);
        String firstName = "Ion";
        String lastName = "Popescu";

        LOG.info("Typing full name");

        registerPage.insertFullName(firstName, lastName);


    }
}
