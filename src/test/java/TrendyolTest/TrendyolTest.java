package TrendyolTest;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductListingPage;
import Pages.ProductPage;
import io.qameta.allure.Feature;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Feature("Trendyol Test Senaryoları")
public class TrendyolTest extends BaseTest {
    public WebDriverWait wait;

    @Test(description = "TS1 Başarılı Login Control")
    public void TS1() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);

        homePage
                .ClosePopUp()
                .CloseCokkies()
                .ClickLoginButton();

        loginPage
                .TypeMail()
                .TypePassword()
                .ClickLoginButton();

    }

    @Test(description = "TS2  Başarısız Login Control")
    public void TS2() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);

        homePage
                .ClosePopUp()
                .CloseCokkies()
                .ClickLoginButton();

        loginPage
                .TypeMail()
                .TypeWrongPassword()
                .ClickLoginButton()
                .CheckFailLogin();

    }


    @Test(description = " TS3 Ürün arama")
    public void TS3() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        ProductListingPage productListingPage = new ProductListingPage(driver, wait);
        homePage
                .ClosePopUp()
                .CloseCokkies()
                .SearchProduct("Gömlek")
                .ClickSearchButton();

        productListingPage
                .CheckProductListing("Gömlek");
    }

    @Test(description = " TS4 Ürünü Facvoriye ekleme ekleme")
    public void TS4() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        ProductListingPage productListingPage = new ProductListingPage(driver, wait);
        ProductPage productPage = new ProductPage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);
        homePage
                .ClosePopUp()
                .CloseCokkies()
                .SearchProduct("Gömlek")
                .ClickSearchButton();

        productListingPage.
                AddToFav();


        loginPage
                .TypeMail()
                .TypePassword()
                .ClickLoginButton();
        homePage
                .ClickFavButton();
    }

}

