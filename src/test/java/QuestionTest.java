import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionTest {
    private WebDriver Driver;
    private String Content1;
    private String Content2;
    private String Content3;
    private String Content4;
    private String Content5;
    private String Content6;
    private String Content7;
    private String Content8;

    public QuestionTest(String content1,String content2,String content3,String content4,String content5,String content6,String content7,String content8, WebDriver driver)
    {
        Content1=content1;
        Content2=content2;
        Content3=content3;
        Content4=content4;
        Content5=content5;
        Content6=content6;
        Content7=content7;
        Content8=content8;
        Driver=driver;
    }
    public void Test(){
        Driver.get("https://qa-scooter.praktikum-services.ru/");
        Driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[1]/div[1]")).click();
        var text1 = Driver.findElement(new By.ByXPath("//*[@id='accordion__panel-0']/p")).getText();
        assert text1.equals(Content1);
        Driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[2]/div[1]")).click();
        var text2 = Driver.findElement(new By.ByXPath("//*[@id='accordion__panel-1']/p")).getText();
        assert text2.equals(Content2);
        Driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[3]/div[1]")).click();
        var text3 = Driver.findElement(new By.ByXPath("//*[@id='accordion__panel-2']/p")).getText();
        assert text3.equals(Content3);
        Driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[4]/div[1]")).click();
        var text4 = Driver.findElement(new By.ByXPath("//*[@id='accordion__panel-3']/p")).getText();
        assert text4.equals(Content4);
        Driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[5]/div[1]")).click();
        var text5 = Driver.findElement(new By.ByXPath("//*[@id='accordion__panel-4']/p")).getText();
        assert text5.equals(Content5);
        Driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[6]/div[1]")).click();
        var text6 = Driver.findElement(new By.ByXPath("//*[@id='accordion__panel-5']/p")).getText();
        assert text6.equals(Content6);
        Driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[7]/div[1]")).click();
        var text7 = Driver.findElement(new By.ByXPath("//*[@id='accordion__panel-6']/p")).getText();
        assert text7.equals(Content7);
        Driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[8]/div[1]")).click();
        var text8 = Driver.findElement(new By.ByXPath("//*[@id='accordion__panel-7']/p")).getText();
        assert text8.equals(Content8);

    }
}