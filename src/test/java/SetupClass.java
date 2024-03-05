import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetupClass {
    private WebDriver driver;
    private By cookieButton = new By.ByXPath("//*[@id=\"rcc-confirm-button\"]");

    @Test
    public void Testing() {
        System.setProperty("webdriver.gecko.driver", "D:\\WebDriver\\bin\\geckodriver.exe");
        driver = new ChromeDriver(); // GoogleChrome
        //driver = new FirefoxDriver(); // Fox
        driver.manage().window().maximize();  //Расширение экрана
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(cookieButton).click();
        var firstBigTest = new OrderBigTest("имя","фамилия","адрес","Черкизовская","88005003020","коммент","02.02.2024",driver);
        firstBigTest.TestStart();
        var secondBigTest = new OrderBigTest("имя1","фамилия1","адрес1","Черкизовская","88005003020","коммент1","02.02.2024",driver);
        secondBigTest.TestStart();
        var firstTest = new OrderTest("имя","фамилия","адрес","Черкизовская","88005003020","коммент","02.02.2024",driver);
        firstTest.TestStart();
        var secondTest = new OrderTest("имя2","фамилия2","адрес2","Черкизовская","88005003020","коммент2","02.02.2024",driver);
        secondTest.TestStart();
        var questionTest = new QuestionTest("Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                "Да, обязательно. Всем самокатов! И Москве, и Московской области.",driver);
        questionTest.Test();
        driver.quit();
    }
}
