package Pages;

import Base.BaseLib;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseLib {

    private WebDriver driver;
    public WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    @Step("Type Mail")
    public LoginPage TypeMail() {
        sendKeys(driver,"#login-email","yusufgoksu1414@gmail.com");

        return this ;
    }
    @Step("Login with google")
    public LoginPage ClickLoginGoogle() {
        click(driver,"#login-register > div.lr-container > div.social-account-login-buttons > div:nth-child(2)");

        return this ;
    }

    @Step("Enter Password")
    public LoginPage TypePassword() {
        sendKeys(driver,"#login-password-input","Deneme1Tech.Ödev!");

        return this ;
    }
    @Step("Enter Password")
    public LoginPage TypeWrongPassword() {
        sendKeys(driver,"#login-password-input","şifre");

        return this ;
    }
    @Step("Enter Password")
    public LoginPage ClickLoginButton() {
        click(driver,".q-primary.q-fluid.q-button-medium.q-button.submit");

        return this ;
    }



    @Step("Checking the message that shows that fail login")
    public LoginPage CheckFailLogin() {

        elementTextAssertion(driver,"#error-box-wrapper","");

        return this ;
    }
}
