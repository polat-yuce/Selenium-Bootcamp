package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {
        // By.Name()
        // Senaryo: (locator olarak name kullanılacak)
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  isim kutucuğuna "ismet" yazdırınız
        // 3-  soyad kutucuğuna "temur" yazdırınız

        WebDriver tarayici = new ChromeDriver();
        tarayici.get("https://form.jotform.com/221934510376353");
        tarayici.manage().window().maximize(); // Ekranı max yani Tam Ekran yapıyor


        WebElement firstName = tarayici.findElement(By.name("q8_name[first]"));
        firstName.sendKeys("Polat");

        WebElement lastName = tarayici.findElement(By.name("q8_name[last]"));
        lastName.sendKeys("Yüce");
        lastName.clear(); // kutucuğu temizler, burada kullanılmasa idi, TemurYılmaz
        lastName.sendKeys("Yüce2");

        WebElement btnSubmit = tarayici.findElement(By.id("input_2"));
        btnSubmit.click();

        MyFunc.Bekle(5);
        tarayici.quit();
    }
}
