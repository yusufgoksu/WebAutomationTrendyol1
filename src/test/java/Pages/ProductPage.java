package Pages;


import Base.BaseLib;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BaseLib {
    private WebDriver driver;
    public WebDriverWait wait;

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    @Step("Beden Seç")
    public ProductPage ChooseSize() throws InterruptedException {
        clickByWantedIndex(".sp-itm",0,driver);

        return this;
    }
    @Step("Sepete ekleme butonuna tıklar")
    public ProductPage AddToBasket() throws InterruptedException {
        click(driver,".add-to-basket-button-text");

        return this;
    }




}