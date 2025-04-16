package Gun08;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElemanStatusu extends BaseDriver {

    @Test
    public void Test(){
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        System.out.println("sali.isDisplayed() = " + sali.isDisplayed()); // Gözükür durumda mı
        System.out.println("sali.isEnabled() = " + sali.isEnabled()); // Etkin durumda mı
        System.out.println("sali.isSelected() = " + sali.isSelected()); // Çekli ve seçilmiş durumda mı

        sali.click(); // Salı çeklendi ve tiklendi
        System.out.println("sali.isSelected() = " + sali.isSelected()); // true

        WebElement cumartesi=driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
        System.out.println("cumartesi.isDisplayed() = " + cumartesi.isDisplayed()); // true
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled()); // false
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected()); // false

        Assert.assertTrue(cumartesi.isDisplayed()==true);

        BekleKapat();

    }
}
