package home_work;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_BaseActions extends TestBase {

  //Keyboard Base Actions
    //Homework
    //Yeni Class olusturun ActionsClassHomeWork
    //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
    // 2- Hover over Me First" kutusunun ustune gelin
    //Link 1" e tiklayin
    //Popup mesajini yazdirin
    //Popup'i tamam diyerek kapatin
    //“Click and hold" kutusuna basili tutun
    //7-“Click and hold" kutusunda cikan yaziyi yazdirin
    //8- “Double click me" butonunu cift tiklayin

@Test
    public void teat01(){
    //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
    driver.get("http://webdriveruniversity.com/Actions");
    // 2- Hover over Me First" kutusunun ustune gelin
    WebElement firstBox=driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
    hoverOverOnElementActions(firstBox);

    //Link 1" e tiklayin
    driver.findElement(By.linkText("Link 1")).click();
    //Popup mesajini yazdirin
    System.out.println("Popup Messaji :"+driver.switchTo().alert().getText());

    //Popup'i tamam diyerek kapatin

    driver.switchTo().alert().accept();
    //“Click and hold" kutusuna basili tutun
    Actions actions = new Actions(driver);
   WebElement clickBox= driver.findElement(By.id("click-box"));
   actions.clickAndHold().perform();
    //7-“Click and hold" kutusunda cikan yaziyi yazdirin
    System.out.println("Click and hold kutusundaki yazi: "+clickBox.getText());
    //8- “Double click me" butonunu cift tiklayin
    WebElement doubleClickMe = driver.findElement(By.xpath("//*[text()='Double Click Me!']"));
    actions.doubleClick(doubleClickMe).perform();


}

}
