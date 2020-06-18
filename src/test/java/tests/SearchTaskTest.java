package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class SearchTaskTest {
    static WebDriver driver;
    private final String searchingTitle = "wrong title";

    @BeforeSuite
    protected void setUpBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void searchTest() {
        StartPage startPage = new StartPage(driver);
        startPage.openStartPage();
        startPage
                .typeSearchingItem()
                .enterNewSearchPage()
                .readFirstTitle();
    }

    @AfterSuite
    protected void closeBrowser() {
        driver.close();
    }
}
