package Base;

import io.qameta.allure.Attachment;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseLib {


    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] attachScreenshot(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "Error Message", type = "text/plain")
    public String attachErrorMessage(String message) {
        return message;
    }




    public void clickByWantedIndex( String Css, int index, WebDriver driver) {
        List<WebElement> secenekler = driver.findElements(By.cssSelector(Css));

        if (!secenekler.isEmpty()) {

            if (secenekler.size() == 1) {
                // Eğer sadece bir seçenek varsa, doğrudan ona tıkla
                secenekler.get(0).click();
            } else {
                // Birden fazla seçenek varsa, belirtilen index'teki seçeneği tıkla
                WebElement secilebilir = secenekler.get(index);
                secilebilir.click();
            }
        } else {
            System.out.println("BULUNAMADI");

        }
    }
    public  void scrollToElementClickAction(String Css, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Css)));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.cssSelector(Css)));
        driver.findElement(By.cssSelector(Css)).click();

    }
    public  void clickByNameOnOption(String isim, String Css, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Css)));
        List<WebElement> options = driver.findElements(By.cssSelector(Css));

        for (WebElement option : options) {
            if (option.getText().contains(isim)) {
                option.click();
                break;

            }
        }


    }

    public  void click(WebDriver driver, String Css){
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Css))).click();
    }
    public  void sendKeys(WebDriver driver, String Css, String text){
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Css))).sendKeys(text);

    }


    public  void elementTextAssertion(WebDriver driver, String cssSelector, String text) {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        List<WebElement> elements = driver.findElements(By.cssSelector(cssSelector));
        for (WebElement element : elements) {
            Assert.assertTrue(element.getText().contains(text));

        }

    }

}
