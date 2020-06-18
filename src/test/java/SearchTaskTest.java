import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTaskTest {
    static WebDriver driver;
    private final String chickenSandwich = "Фіт сендвіч з куркою";

    @BeforeSuite
    protected void setUpBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void addItemToCart() {
        StartPage StartPage = new StartPage(driver);
        StartPage.openStartPage();
        String title = StartPage
                .typeSearchingItem()
                .enterNewSearchPage()
                .readFirstTitle();
        Assert.assertEquals(title,"wrong title");
    }

    @AfterSuite
    protected void closeBrowser() {
        driver.close();
    }
}
