import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MainPage {
    private By buttonOrder = By.xpath("//button[@class='Button_Button__ra12g' and text()='Заказать']");
    private By buttonOrderBig = By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/div[2]/div[5]/button");
private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOrderButton() {
        driver.findElement(buttonOrder).click();   // Клик на верхнюю кнопку "Заказать"
    }
    public void clickBigOrderButton() {
        driver.findElement(buttonOrderBig).click();   // Клик на верхнюю кнопку "Заказать"
    }
}


