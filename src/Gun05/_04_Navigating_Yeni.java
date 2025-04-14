package Gun05;

import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utlity.BaseDriver.BekleKapat;
import static Utlity.BaseDriver.driver;

public class _04_Navigating_Yeni {

    @Test
    public void Test1()
    {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); //siteye git,aç
        MyFunc.Bekle(2);

        WebElement link=driver.findElement(By.id("alerttest"));
        link.click();
        MyFunc.Bekle(2);

        driver.navigate().back();
        MyFunc.Bekle(2);

        driver.navigate().forward();

//        if (driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/alerts/alert-test.html"))
//            System.out.println("Test passed");
//        else
//            System.out.println("Test fail");

        Assert.assertTrue("Beklenen sayfaya ulaşılamadı",driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/alerts/alert-test.html"));
        //Ben true bekliyorum, değilse göster, yoksa test passed

        BekleKapat();
    }
}
