package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionClickTest extends BaseDriver {

    @Test
    public void Test() {
        driver.get("http://demoqa.com/buttons");

        WebElement btnClick=driver.findElement(By.xpath("//button[text()='Click Me']"));
        // btnClick.click();

        // 1. Yöntem
        Actions actions=new Actions(driver);

        Action action = actions.moveToElement(btnClick).click().build();
        // elementin üzerin click için git orda bekle, aksiyonu HAZIRLA.

        MyFunc.Bekle(2);
        action.perform(); // aksiyon gerçekleşiyor, işleme al, uygula.

        // kısa hali
        // actions.moveToElement(btnClick).click().build().perform();

        //kıpkısa hali
        // new Actions(driver).click(btnClick).build().perform(); // bir tek aksiyon için

        BekleKapat();

    }
}
