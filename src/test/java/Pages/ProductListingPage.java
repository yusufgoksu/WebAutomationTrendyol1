package Pages;


import Base.BaseLib;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListingPage extends BaseLib {
    private WebDriver driver;
    public WebDriverWait wait;

    public ProductListingPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Step("aranan productlarda bu isim var mı kontrol eder")
    public ProductListingPage CheckProductListing(String string) {
        elementTextAssertion(driver,".p-card-wrppr.with-campaign-view",string);

        return this;
    }

    @Step("favoriye ekleme ")
    public ProductListingPage AddToFav() {
        clickByWantedIndex(".fvrt-btn",0,driver);

        return this;
    }

}
