package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewSearchPage {
    WebDriver driver;
    private final WebElement title;

    public NewSearchPage(WebDriver driver) {
        this.driver = driver;
        this.title = driver.findElement(By.xpath("//h3[1]"));
    }

    public void readFirstTitle() {
        String titleText = title.getText();
        System.out.println(" *** " + titleText + " *** ");
    }

}
