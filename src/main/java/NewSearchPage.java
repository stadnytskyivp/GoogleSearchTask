import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewSearchPage {
    WebDriver driver;

    public NewSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public String readFirstTitle() {
        WebElement title = driver.findElement(By.xpath("//h3[1]"));
        String titleText = title.getText();
//        System.out.println(" *** " + titleText + " *** ");
        return titleText;
    }
}
