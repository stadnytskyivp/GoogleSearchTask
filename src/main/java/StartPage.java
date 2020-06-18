import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage {
    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    public StartPage openStartPage() {
        driver.get("https://www.google.com/");
        return this;
    }

    public StartPage typeSearchingItem(){
        WebElement searchEdit = driver.findElement(By.name("q"));
        searchEdit.sendKeys("book");
        searchEdit.click();
        return this;
    }

    public NewSearchPage enterNewSearchPage() {
        driver.findElement(By.name("btnK")).submit();
        return new NewSearchPage(driver);
    }
}
