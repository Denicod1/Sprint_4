import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionTest {
    private WebDriver driver;
    private MainPage mainPage;

    @Test
    public void ButtonTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver(); // GoogleChrome

        mainPage = new MainPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().window().maximize();  //Расширение экрана
        var text = driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div[1]/div[5]/div[2]"));
        var text1 = driver.findElement(new By.ByXPath("//*[@id=\"accordion__panel-0\"]/p"));
        var text2 = driver.findElement(new By.ByXPath("//*[@id=\"accordion__panel-0\"]/p")).getText();
        var text3 = driver.findElement(new By.ByXPath("//*[@id=\"accordion__panel-0\"]/p")).getText();

    }
}


//private By metroStation = (By.xpath(".//*[text() = 'Черкизовская']"));  //Выбор нужной станции
