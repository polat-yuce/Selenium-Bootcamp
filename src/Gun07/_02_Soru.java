package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_Soru extends BaseDriver {
    //        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
    //    Assert.assertTrue(urunFiyatToplamlam == itemTotal)

    @Test
    public void Test() {
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(2);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        MyFunc.Bekle(2);

        WebElement SauceLabsBackpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        SauceLabsBackpack.click();
        MyFunc.Bekle(2);

        WebElement addToCard = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCard.click();
        MyFunc.Bekle(2);

        WebElement backToProducts = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProducts.click();
        MyFunc.Bekle(2);

        WebElement SauceLabsBoltTShirt = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        SauceLabsBoltTShirt.click();
        MyFunc.Bekle(2);

        WebElement addToCard2 = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCard2.click();
        MyFunc.Bekle(2);

        WebElement sepet = driver.findElement(By.xpath("//div[@id='shopping_cart_container']//a"));
        sepet.click();
        MyFunc.Bekle(2);

        WebElement Checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        Checkout.click();
        MyFunc.Bekle(2);

        WebElement firstName = driver.findElement(By.xpath("//div[@class='checkout_info']/div/input[1]"));
        firstName.sendKeys("Polfdsafasat");
        MyFunc.Bekle(2);

        WebElement lastName = driver.findElement(By.xpath("(//div[@class='checkout_info']/div/input)[2]"));
        lastName.sendKeys("dasf");
        MyFunc.Bekle(2);

        WebElement zip = driver.findElement(By.xpath("(//div[@class='checkout_info']/div/input)[3]"));
        zip.sendKeys("4321");
        MyFunc.Bekle(2);

        WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
        Continue.click();
        MyFunc.Bekle(3);

        List<WebElement> ucretler = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam = 0;
        for (WebElement ucret : ucretler) {
            System.out.println(ucret.getText());
            System.out.println(ucret.getText().replaceAll("[^0-9,.]", ""));
            toplam = toplam + Double.parseDouble(ucret.getText().replaceAll("[^0-9,.]", ""));
        }

        WebElement itemTotalElement = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double itemTotal = Double.parseDouble(itemTotalElement.getText().replaceAll("[^0-9,.]", ""));
        System.out.println("itemTotal = " + itemTotal);

        Assert.assertTrue("Toplamlar eşit değil = ", toplam == itemTotal);

        BekleKapat();


    }
}
