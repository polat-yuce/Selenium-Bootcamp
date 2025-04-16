package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseDriver {

//        Test Senaryosu
//        1- https://www.ebay.co.uk/  sayfasına gidiniz
//        2- Kategorilerden Baby seçeneğini seçiniz.
//        3- Arama butonuna tıklatınız.
//        4- Sonuçları çıktığı ekranda sol başlık
//            kısmında Baby kelimesinin geçtiğini doğrulayınız

    @Test
    public void Test() {
        driver.get("https://www.ebay.co.uk/");

        WebElement categories = driver.findElement(By.cssSelector("select[id='gh-cat']"));
        Select kategori = new Select(categories);
        kategori.selectByVisibleText("Baby");
        MyFunc.Bekle(2);

        WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
        search.click();
        MyFunc.Bekle(2);

        WebElement babyEssentials = driver.findElement(By.xpath("//h1[text()='Baby Essentials']"));

        Assert.assertTrue("Aradığın kelime yok. ", babyEssentials.getText().toLowerCase().contains("baby"));

        BekleKapat();
    }
}
