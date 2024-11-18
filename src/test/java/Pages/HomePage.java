package Pages;

import Base.BaseLib;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseLib {

    private WebDriver driver;
    public WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    @Step("Close Pop up")
    public HomePage ClosePopUp() {
        click(driver,".modal-close");

        return this;
    }
    @Step("Close Cokkies")
    public HomePage CloseCokkies() {
        click(driver,"#onetrust-reject-all-handler");

        return this;
    }

    @Step("Clicking Login Button")
    public HomePage ClickLoginButton() {
        click(driver,".link.account-user");

        return this;
    }
    @Step("Ürün Arama")
    public HomePage SearchProduct(String product) {
        sendKeys(driver,".V8wbcUhU",product);

        return this;
    }
    @Step("Ürün Arama tuşuna bas")
    public HomePage ClickSearchButton() {
        click(driver,".cyrzo7gC");

        return this;
    }
    @Step("Facvorilere git")
    public HomePage ClickFavButton() {
        click(driver,".account-nav-item.account-favorites");

        return this;
    }


}
