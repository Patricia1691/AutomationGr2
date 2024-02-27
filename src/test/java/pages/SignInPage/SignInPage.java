package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By signInButton = By.id("btn1");
    private By logo = By.id("logo");
    private By emailField = By.xpath("//input[@ng-model='Email']");
    private By passwordField = By.xpath("//input[@ng-model='Password']");
    private By enterButton = By.id("enterbtn");
    private By errorMessage = By.id("errormsg");
    private By skipSignInButton = By.id("btn2");
    private By signUp = By.id("email");
    private By registerButton = By.id("enterimg");

    public void clickSignInButton() {
        LOG.info("Click 'Sign in' Button");
        driver.findElement(signInButton).click();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in' button is displayed");
        return driver.findElement(signInButton).isDisplayed();

    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo image is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void typeInSignInEmailField(String email) {
        LOG.info("Typing email address in 'E mail' field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void typeInSignInPasswordField(String password) {
        LOG.info("Typing password in 'Password' field");
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickEnterButton() {
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        LOG.info("Verify if error message is displayed");
        return driver.findElement(errorMessage).isDisplayed();

    }

    public void clickBack() {
        LOG.info("Click back in browser");
        driver.navigate().back();
    }

    public void clickSkipSignInButton() {
        LOG.info("Click 'Skip Sign in' button");
        driver.findElement(skipSignInButton).click();
    }

    public void email(String email) {
        LOG.info(" insert email address");
        driver.findElement(signUp).sendKeys(email);
    }


    public void clickRegisterButton() {
        LOG.info("click register button");
        driver.findElement(registerButton);
    }

}
