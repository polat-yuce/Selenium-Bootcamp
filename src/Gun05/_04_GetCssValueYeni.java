package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_GetCssValueYeni extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement aramaKutusu=driver.findElement(By.id("inputValEnter"));

        //parametrenin değerini veriyor
        System.out.println("aramaKutusu.class = " + aramaKutusu.getAttribute("class"));

        // elementi şekillendiren değerleri veriyor
        System.out.println("aramaKutusu.color = " + aramaKutusu.getCssValue("color"));
        System.out.println("aramaKutusu.background = " + aramaKutusu.getCssValue("background"));
        System.out.println("aramaKutusu.font-size = " + aramaKutusu.getCssValue("font-size"));
        System.out.println("aramaKutusu.border = " + aramaKutusu.getCssValue("border"));
        System.out.println("aramaKutusu.font-family = " + aramaKutusu.getCssValue("font-family"));

        BekleKapat();
    }
}
