package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest extends BaseLib {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String tarayici = System.getProperty("browser");
        if (tarayici == null) {
            tarayici = "Chrome";
        }

        System.out.println(tarayici);

        if (tarayici.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(co);
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            attachScreenshot(driver);
            attachErrorMessage("Istenen şart sağlanmadı ");
        }
        driver.quit();  // Tarayıcıyı kapat
    }
}
