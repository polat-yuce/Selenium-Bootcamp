package Gun05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindingElements_tag {
    public static void main(String[] args) {
        // amazon.com un sayfasındaki bütün linkleri gçrmek istiyorum, tıklatabililir ve görünen yazısı
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr");

        List<WebElement> linkler = driver.findElements(By.tagName("a")); // bütün a olan tagli elemanları bul.

        System.out.println("linkler.size() = " + linkler.size());
        for (WebElement e : linkler) {
            // tıklatabilir, görünen yazısı olan ve href i olan
            if (!e.getText().equals("") && e.getAttribute("href") != null)
                System.out.println("e.getText() = " + e.getText());
        }

        driver.quit();
    }
}
