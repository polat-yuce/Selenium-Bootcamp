package Gun11;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _07_Soru extends BaseDriver {

    /*
    Senaryo:
    https://google.com/ da selenium kelimesini aratınız.
    ilk çıkan sonuca tıklatıp,(selenium)
    çıkan URL yi ekrana yazdırınız.
    Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız
 */

    @Test
    public void Test() {
        driver.get("https://google.com/");

        //bulursan tıklat, bulamzsan geç
        List<WebElement> acceptAll = driver.findElements(By.id("L2AGLb"));
        if (acceptAll.size() > 0)
            acceptAll.get(0).click();

        WebElement google = driver.findElement(By.id("APjFqb"));
        google.sendKeys("selenium" + Keys.ENTER);

        WebElement selenium = driver.findElement(By.xpath("//h3[text()='Selenium']"));
        wait.until(ExpectedConditions.elementToBeClickable(selenium));
        selenium.click();

        Assert.assertTrue("Aynı url değil", driver.getCurrentUrl().toLowerCase().equalsIgnoreCase("https://www.selenium.dev/"));

        BekleKapat();
    }
}
