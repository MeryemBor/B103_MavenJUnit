package home_work;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class C02_DropDownTekrar extends TestBase{


    @Test
    public void test01() {

        //Test01
        //1- amazon gidin
        driver.get("https://www.amazon.com/");

        //Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırız

        WebElement aramasonucu = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(aramasonucu);
        List<WebElement> options = select.getOptions();
        options.forEach(t -> System.out.println(t.getText()));
        int listSayisi = options.size();

        //dropdown menude 40 eleman olduğunu doğrulayın
        Assert.assertEquals(28, listSayisi);

        //Test02
        //dropdown menuden elektronik bölümü seçin
        select.selectByVisibleText("Electronics");

        //arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        driver.findElement(By.id("twotabsearchtextbox" )).sendKeys("iphone", Keys.ENTER);
        String result = findCss("div[class='s-desktop-width-max sg-row-align-items-center sg-row']").getText();
        System.out.println("result = " + result);

        List<WebElement> iphoneList = driver.findElements(By.cssSelector("div[class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']"));
        iphoneList.get(1).click();

        //ürünün title'ni ve fiyatını variable’a  assign edip ürünü sepete ekleyelim
        String title = findId("productTitle").getText();
        String fiyat = findCss("div[class='a-section a-spacing-none aok-align-center']").getText();
        findId("add-to-cart-button").click();
    }
    //Test03


    @Test
    public void name() {

        //yeni bir sekme açarak amazon anasayfaya gidin
        driver.get("https://www.amazon.com/");
        //dropdown’dan bebek bölümüne secin
        WebElement aramasonucu = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(aramasonucu);
        select.selectByVisibleText("Baby");
        //bebek puset aratıp bulundan sonuç sayısını yazdırın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bebek puset", Keys.ENTER);
        String result=driver.findElement(By.xpath("//*[@class='a-size-base s-desktop-toolbar a-text-normal']")).getText();
        //sonuç yazsının puset içerdiğini test edin


        //5-üçüncü ürüne relative locater kullanarak tıklayin
        //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin  Test 4
        //1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın
    }
}

