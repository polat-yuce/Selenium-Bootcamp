package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_Soru extends BaseDriver {
//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz

    @Test
    public void Test() {
        driver.get("https://www.facebook.com/");

        WebElement CreateNewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        CreateNewAccount.click();   MyFunc.Bekle(2);

        WebElement name=driver.findElement(By.cssSelector("input[name='firstname']"));
        name.sendKeys("sdafasdfds"); MyFunc.Bekle(2);

        WebElement lastName=driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("sdafdsfasdfds"); MyFunc.Bekle(2);

        WebElement days=driver.findElement(By.cssSelector("[id='day']"));
        WebElement monts=driver.findElement(By.cssSelector("[id='month']"));
        WebElement years=driver.findElement(By.cssSelector("[id='year']"));

        Select gün=new Select(days);
        Select ay=new Select(monts);
        Select yıl=new Select(years);

        gün.selectByIndex(3);
        ay.selectByIndex(3);
        yıl.selectByValue("2000");

//        WebElement sex= driver.findElement(By.xpath("(//input[@id='sex'])[2]"));
//        sex.click(); MyFunc.Bekle(2);
//
//        WebElement eposta=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
//        eposta.sendKeys("kasdfkasdgkl2141@gmail.com"); MyFunc.Bekle(2);
//
//        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
//        password.sendKeys("2321fds234dsa"); MyFunc.Bekle(3);
//
//        WebElement register=driver.findElement(By.xpath("//div[@class='_1lch']/button"));
//        register.click();

        BekleKapat();
    }
}
