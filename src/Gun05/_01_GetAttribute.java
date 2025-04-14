package Gun05;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetAttribute {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        // Bir Web. Elementinin Attribute (Özelliklerini) ni alma
        System.out.println("siparislerimLinki.getAttribute(href) = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(title) = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(rel) = " + siparislerimLinki.getAttribute("rel"));

        MyFunc.Bekle(3);
        driver.quit();
    }
}
