import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondPage {


    private WebDriver driver;
    private String Name;
    private String Surname;
    private String Adress;
    private String Station;

    private String Phone;
    private By nameField = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input"); // полле имя
    private By surnameField = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input"); // поле фамилия
    private By adressField = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input"); // поле адрес
    private By stationField1 = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div"); // поле станция метро
    private By stationField2(){ return new By.ByXPath(".//*[text() = '"+Station+"']");} // выбор станции метро

    private By phoneField = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input"); // поле номер телефона
    private By nextButton = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[3]/button"); // кнопка далее

    public SecondPage(String name,String surname,String adress,String station, String phone, WebDriver driver){
        this.Name=name;
        this.Surname=surname;
        this.driver = driver;
        this.Adress = adress;
        this.Station = station;
        this.Phone = phone;
    }
    public void fillName() {
        var firstinput=driver.findElement(nameField);
        firstinput.sendKeys(Name);
    }
    public void fillSurname()
    {
        var secondinput=driver.findElement(surnameField);
        secondinput.sendKeys(Surname);  //shift + f6 периименовать все
    }
    public void fillAdress()
    {
        var thridinput=driver.findElement(adressField);
        thridinput.sendKeys(Adress);
    }
    public void fillStation()
    {
        var fourthinput=driver.findElement(stationField1);
        fourthinput.click();
        var findselecteditem = driver.findElement(stationField2());
        findselecteditem.click();
    }
    public void fillPhone()
    {
        var fifthininput=driver.findElement(phoneField);
        fifthininput.sendKeys(Phone);
    }
    public void clickNextPage()
    {
        driver.findElement(nextButton).click();
    }

}
