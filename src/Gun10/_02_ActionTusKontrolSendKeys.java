package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demoqa.com/auto-complete");
        MyFunc.Bekle(2);

        WebElement txtBox = driver.findElement(By.id("autoCompleteMultipleInput"));
        new Actions(driver)
                .moveToElement(txtBox)  // kutucuğa git
                .click()                // yazabilmek için tıkla
                .sendKeys("b")
                .build()
                .perform()
        ;

        MyFunc.Bekle(3); // tuşa basıldığında seçeneklerin çokması için süre gerekiyor

        new Actions(driver)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform()
        ;

        BekleKapat();



    }
}
