package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByIdNotFoundException {
    public static void main(String[] args) {

        WebDriver tarayici = new ChromeDriver();
        tarayici.get("https://form.jotform.com/221934510376353");

        // WebElement isimKutusu = tarayici.findElement(By.id("Hatalı Locater"));

        try {
            WebElement isimKutusu = tarayici.findElement(By.id("Hatalı Locater"));
        }
        catch (Exception ex){
            System.out.println("Bu locaterda bir element bulunamadı");
        }


    }
}
// locater hatalı olduğunda, bulunamadığında
// ' NoSuchElementException ' hatası verir.