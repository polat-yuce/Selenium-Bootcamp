package Gun11;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _06_Soru extends BaseDriver {
    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

    @Test
    public void Test() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.demoblaze.com/index.html");

        WebElement s6 = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        s6.click();


        WebElement addToCar = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCar.click();

        wait.until(ExpectedConditions.alertIsPresent());// alert gözükene kadar bekle
        driver.switchTo().alert().accept();

        MyFunc.Bekle(5);

        WebElement anaSayfa = driver.findElement(By.id("nava"));
        anaSayfa.click();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        Assert.assertTrue("Aynı değil",driver.getTitle().toUpperCase().equals("STORE"));

        BekleKapat();

    }


}
