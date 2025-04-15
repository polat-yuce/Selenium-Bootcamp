package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {

// 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- Business i çekleyin.
// 3- discover XYZ ye tıklatın ve online Advertising i seçin
// 4- Every day i seçin
// 5- Good u seçin
// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
// css selector
// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);

    @Test
    public void Test() {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business = driver.findElement(By.cssSelector("[id='u_uvA_4586_0']"));
        business.click();
        MyFunc.Bekle(2);

        WebElement discover = driver.findElement(By.cssSelector("[id='u_uvA_4588']"));
        discover.click();
        MyFunc.Bekle(2);

        WebElement onlineAdvertising = driver.findElement(By.cssSelector("[id='u_uvA_4588'] > :nth-child(4)"));
        onlineAdvertising.click();
        MyFunc.Bekle(2);

        WebElement everyDay = driver.findElement(By.cssSelector("[id='u_uvA_89585_0']"));
        everyDay.click();
        MyFunc.Bekle(2);

        WebElement good = driver.findElement(By.cssSelector("[id='u_uvA_4589_0']"));
        good.click();
        MyFunc.Bekle(2);

        WebElement xyz = driver.findElement(By.cssSelector("[id='u_uvA_4597']"));
        xyz.click();
        MyFunc.Bekle(2);

        WebElement uc = driver.findElement(By.cssSelector("[id='u_uvA_4597']> :nth-child(4)"));
        uc.click();

        BekleKapat();
    }

}
