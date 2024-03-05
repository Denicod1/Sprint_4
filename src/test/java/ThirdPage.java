import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class ThirdPage {


    private WebDriver Driver;
    private String Comment;
    private String Date;
    private String confirmText = "Заказ оформлен";
    private By commentField = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input"); // поле комментарий
    private By daysField = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]"); // поле кол-во дней аренды
    private By dateField = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input"); // поле с выбором даты
    private By orderButton = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]"); // кнопка заказать
    private By confirmButton = new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]"); // кнопка подтверждения заказа
    private By orderText = new By.ByXPath("/html/body/div/div/div[2]/div[5]/div[1]"); // текст принятого заказа

    public ThirdPage(String comment, String date, WebDriver driver)
    {
        Comment=comment;
        Date=date;
        Driver=driver;
    }
    public void fillComment()
    {
        var comment = Driver.findElement(commentField);
        comment.sendKeys(Comment);
    }
    public void fillRent()
    {
        var days = Driver.findElement(daysField);
        days.click();
        var daysselect = Driver.findElement(new By.ByXPath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]"));
        daysselect.click();
    }
    public void fillDate()
    {
        var date = Driver.findElement(dateField);
        date.sendKeys(Date);
    }
    public void clickOrder()
    {
        Driver.findElement(orderButton).click();
    }
    public void clickConfirm()
    {
        Driver.findElement(confirmButton).click();
    }
    public void checkOrder()
    {
        var text1 = Driver.findElement(orderText).getText();
        Assert.assertTrue(text1.contains(confirmText));
    }
}
