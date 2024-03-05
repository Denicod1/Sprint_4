import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderTest {

    private WebDriver Driver;
    private String Name;
    private String Surname;
    private String Adress;
    private String Station;
    private String Phone;
    private String Comment;
    private String Date;


    public OrderTest(String name, String surname,String adress,String station,String phone,String comment, String date, WebDriver driver)
    {
        Name=name;
        Surname=surname;
        Adress=adress;
        Driver=driver;
        Station=station;
        Phone=phone;
        Comment=comment;
        Date=date;
    }

    public void TestStart() {
        //System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\bin\\chromedriver.exe");
        Driver.get("https://qa-scooter.praktikum-services.ru/");
        var firstPageObject = new FirstPage(Driver);
        new WebDriverWait(Driver, 10).until(ExpectedConditions.numberOfElementsToBe(By.tagName("input"), 6));
        var secondPageObject = new SecondPage(Name,Surname,Adress,Station,Phone,Driver);
        secondPageObject.fillName();
        secondPageObject.fillSurname();
        secondPageObject.fillAdress();
        secondPageObject.fillStation();
        secondPageObject.fillPhone();
        secondPageObject.clickNextPage();
        var thirdPageObject = new ThirdPage(Comment,Date,Driver);
        thirdPageObject.fillComment();
        thirdPageObject.fillRent();
        thirdPageObject.fillDate();
        thirdPageObject.clickOrder();
        thirdPageObject.clickConfirm();
        thirdPageObject.checkOrder();
    }
}