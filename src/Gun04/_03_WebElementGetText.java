package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_WebElementGetText {
    public static void main(String[] args) {

        WebDriver tarayici = new ChromeDriver();
        tarayici.get("https://form.jotform.com/221934510376353");

        // sublabel_8_first
        // sublabel_8_last

        WebElement labelFirstTime=tarayici.findElement(By.id("sublabel_8_first"));
        System.out.println(labelFirstTime.getText());

        WebElement labelLastTime=tarayici.findElement(By.id("sublabel_8_last"));
        System.out.println(labelLastTime.getText());

        MyFunc.Bekle(3);
        tarayici.quit();

    }
}
