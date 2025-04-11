package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {

        // Browserda incele yaptığınızda id lerden aramalar için #, class aramalar için . konabilir.

        // Senaryo:
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  Bütün label ları bulup textlerini yazdırınız

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element = driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());
        // findElement:  locator birden fazla elemanı işaret ediyorsa bile, ilkini bulur

        // Birden fazla element bulma
        List<WebElement> elemetler = driver.findElements(By.className("form-sub-label"));

        for (WebElement e : elemetler) {
            System.out.println("e.getText() = " + e.getText());
        }
        System.out.println("elemetler.size() = " + elemetler.size());

        MyFunc.Bekle(3);
        driver.quit();

    }
}
