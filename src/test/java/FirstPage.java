import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPage {
    private WebDriver driver; // драйвер для браузера
    private By buttonOrderBig = By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/div[2]/div[5]/button"); // большая кнопка заказать по центру экрана
    private By buttonOrder = By.xpath("//button[@class='Button_Button__ra12g' and text()='Заказать']");// кнопка заказать вверху экрана

    public FirstPage(WebDriver driver) {
        this.driver = driver;
    }
        public void clickBigOrderButton() {
            driver.findElement(buttonOrderBig).click();
        }
        public void clickOrderButton() {
            driver.findElement(buttonOrder).click();
        }
    }
