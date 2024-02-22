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
    private String newUrl = getBaseUrl() + "Register.html";

    @Test
    public void fillRegister(){
        driver.get(newUrl);

        sleep(3000L);
        LOG.info("Press consent button");
        registerPage.pressConsent();
        String firstName = "Ion";
        String lastName = "Popescu";
        String address = "Cluj, Strada Ion Barbu, nr 456";
        String email = "automation@domnain.com";
        String phone = "0123456789";

        LOG.info("Typing full name");
        LOG.info("Type in address");
        registerPage.insertAddress(address);

        LOG.info("Type in email");
        registerPage.insertEmail(email);

        LOG.info("Type in phone number");
        registerPage.insertPhoneNumber(phone);




    }
}
