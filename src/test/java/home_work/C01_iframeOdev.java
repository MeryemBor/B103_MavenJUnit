package home_work;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C01_iframeOdev extends TestBase {
    @Test
    public void iframeTest () throws InterruptedException {
//   1) https://the-internet.herokuapp.com/iframe sitesine gidiniz
//   2) sayfadaki toplam iframe sayisini bulunuz.
//   3)Sayfa basliginda 'Editor' yazisini icerdigini test edelim.
//  4)Prargraftaki yaziyi silelim
//  5)Sonrasinda paragrafa "iframein icindeyim " yazisini yazdiralim
//  6)Alt kisimdaki yazinin 'Elemental Selenium' yazisini icerdigini test edelim

//***********************ODEV*******************

//   1) https://the-internet.herokuapp.com/iframe sitesine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe ");

//   2) sayfadaki toplam iframe sayisini bulunuz.
        List<WebElement> l=driver.findElements(By.tagName("iframe"));
        System.out.println("No. of frames in webpage= "+ l.size());

//   3)Sayfa basliginda 'Editor' yazisini icerdigini test edelim.

        String actualTitle =
                driver.findElement(By.xpath("//*[.='An iFrame containing the TinyMCE WYSIWYG Editor']")).getText();
        String expectedWord="Editor";
        Assert.assertTrue(actualTitle.contains(expectedWord));

//  4)Prargraftaki yaziyi silelim
        Thread.sleep(5000);
        driver.switchTo().frame(0).findElement(By.xpath("//p")).clear();

//  5)Sonrasinda paragrafa "iframein icindeyim " yazisini yazdiralim
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p")).sendKeys("iframein icindeyim");

        Thread.sleep(5000);
//  6)Alt kisimdaki yazinin 'Elemental Selenium' yazisini icerdigini test edelim
        driver.switchTo().parentFrame();
        String actualFooterText=driver.findElement(By.xpath("//*[.='Elemental Selenium']")).getText();
        String expectedFooterText ="Elemental Selenium";
        Assert.assertEquals(actualFooterText,expectedFooterText);

    }
}
