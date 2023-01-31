package practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class P06_Actions extends TestBase {

  /*
    - http://szimek.github.io/signature_pad/ sayfasına gidiniz
    - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
    - Çizimden sonra clear butonuna basalım
    - Son olarak sayfayı temizleyiniz
     */

@Test
    public void test01(){
    //- http://szimek.github.io/signature_pad/ sayfasına gidiniz
    driver.get("http://szimek.github.io/signature_pad/");
    //    - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
    WebElement drawingBoard=driver.findElement(By.xpath("//*[@style='touch-action: none; user-select: none;']"));
    Actions actions=new Actions(driver);
     actions.clickAndHold(drawingBoard).
           moveByOffset(200,100)
           .dragAndDropBy(drawingBoard,200,500)
             .release().build().perform();
    WebElement backGChanger= driver.findElement(By.xpath("//*[.='Change background color']"));
    backGChanger.click();
    backGChanger.click();
    //    - Çizimden sonra clear butonuna basalım
    waitFor(5);
    driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();

 //  colorChanger.click();
    WebElement colorChanger=driver.findElement(By.xpath("(//*[@type='button'])[3]"));
    colorChanger.click();
  //  actions.sendKeys(clickWithTimeOut(drawingBoard,5000);;
    //    - Son olarak sayfayı temizleyiniz
    driver.quit();

}
}
