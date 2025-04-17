package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_Soru extends BaseDriver {

//    https://www.mediamarkt.com.tr/ sayfasına gidiniz.
//    Tüm Kategoriler -> Beyaz Eşya -> Kombiler click
//    tıklatma işleminden sonra URL de
//    kombi kelimesinin geçtiğini doğrulayın.
//    Yukarıdaki aksyonlar için Actions sınıfını kullanınız

    @Test
    public void Test() {
        driver.get("https://www.mediamarkt.com.tr/");

        Actions aksiyonlar = new Actions(driver);

        WebElement tumKategoriler = driver.findElement(By.xpath("//div[text()='Tüm kategoriler']"));
        aksiyonlar.moveToElement(tumKategoriler).click().build().perform();

        MyFunc.Bekle(2);

        WebElement beyazEsya = driver.findElement(By.id("category-208"));
        aksiyonlar.moveToElement(beyazEsya).build().perform();

        MyFunc.Bekle(3);

        WebElement kombiler = driver.findElement(By.xpath("(//span[text()='Kombiler'])[1]"));
        aksiyonlar.moveToElement(kombiler).click().build().perform();

        MyFunc.Bekle(2);

        Assert.assertTrue("kombi geçmiyor", driver.getCurrentUrl().toLowerCase().contains("kombi"));

        BekleKapat();

    }
}
