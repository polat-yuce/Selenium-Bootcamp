package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru extends BaseDriver {
//    Senaryo: (Sadece CSSSelector)
//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//    Calculator'e tıklayınız.
//    İlk input'a herhangi bir sayı giriniz.
//    İkinci input'a herhangi bir sayı giriniz.
//    Calculate button'una tıklayınız.
//    Sonucu yazdırınız.

    @Test
    public void Test() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement Calculator=driver.findElement(By.cssSelector("a[id='calculatetest']"));
        Calculator.click();MyFunc.Bekle(2);

        WebElement input1=driver.findElement(By.cssSelector("[id='number1']"));
        input1.sendKeys("1");MyFunc.Bekle(2);

        WebElement input2=driver.findElement(By.cssSelector("[id='number2']"));
        input2.sendKeys("2");MyFunc.Bekle(2);

        WebElement calcute=driver.findElement(By.cssSelector("[id='calculate']"));
        calcute.click();

        WebElement answer=driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println("answer.getText() = " + answer.getText());

        //TODO: Assert.assertTrue(); sonucu doğruluğunu kontrol edin.
        // Assert.assertEquals(answer.getText());

        Assert.assertTrue("Hatalı işlem",answer.getText().equals("3"));


    }
}
