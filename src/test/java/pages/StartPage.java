package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage {
    private final WebDriver driver;
    private final WebElement searchEdit;
    private final WebElement searchBtn;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        this.searchEdit = driver.findElement(By.name("q"));
        this.searchBtn = driver.findElement(By.name("btnK"));
    }

    public StartPage typeSearchingItem(){
        String searchItem = "book";
        searchEdit.sendKeys(searchItem);
        searchEdit.click();
        return this;
    }

    public NewSearchPage enterNewSearchPage() {
        searchBtn.submit();
        return new NewSearchPage(driver);
    }
}
