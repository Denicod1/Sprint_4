import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderBigTest {
    private WebDriver driver;
    private MainPage mainPage;

    @Test
    public void ButtonTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver(); // GoogleChrome

        mainPage = new MainPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().window().maximize();  //Расширение экрана
        driver.findElement(new By.ByXPath("//*[@id=\"rcc-confirm-button\"]")).click();;
        mainPage.clickBigOrderButton();
        new WebDriverWait(driver, 10).until(ExpectedConditions.numberOfElementsToBe(By.tagName("input"), 6));
        var firstinput=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input"));
        firstinput.sendKeys("тестимя");
        var secondinput=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input"));
        secondinput.sendKeys("тестфамилия");//shift + f6
        var thridinput=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input"));
        thridinput.sendKeys("тестадрес");
        var fourthinput=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div"));
        fourthinput.click();
        var findselecteditem = driver.findElement(By.xpath(".//*[text() = 'Черкизовская']"));
        findselecteditem.click();
        var fifthinput=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input"));
        fifthinput.sendKeys("01234567890");

        driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[3]/button")).click();

        var comment = driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input"));
        comment.sendKeys("тесткоммент");
        var days = driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]"));
        days.click();
        var daysselect = driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]"));
        daysselect.click();
        var date = driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input"));
        date.sendKeys("02.02.2024");
        driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]")).click();
        driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]")).click();
    }
}