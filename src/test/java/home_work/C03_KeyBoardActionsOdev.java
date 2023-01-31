package home_work;

import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
                                                                                                   //note:
public class C03_KeyBoardActionsOdev extends TestBase {//bu sorunun aynicini burak hocaylada yapmistik
                                                                                              //package03_practice ,C01_iframe' de
    //Bir Class olusturalim KeyboardActions2
    //https://html.com/tags/iframe/ sayfasina gidelim
    //video’yu gorecek kadar asagi inin
    //videoyu izlemek icin Play tusuna basin
    //videoyu calistirdiginizi test edin

   @Test
   public void test01(){
       //https://html.com/tags/iframe/ sayfasina gidelim
       driver.get("https://html.com/tags/iframe/ ");
       //video’yu gorecek kadar asagi inin
       Actions actions = new Actions(driver);
       WebElement mainSite=driver.findElement(By.cssSelector("div#site-main"));
       actions.sendKeys(Keys.PAGE_DOWN )
               .sendKeys(Keys.ARROW_DOWN)
               .build().perform();

       //videoyu izlemek icin Play tusuna basin
       WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
       driver.switchTo().frame(iframe);
       findCss("button[class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']").click();
       waitFor(3);
       //videoyu calistirdiginizi test edin
       WebElement youTubeLable=driver.findElement(By.cssSelector("a[class='ytp-youtube-button ytp-button yt-uix-sessionlink']"));
       Assert.assertTrue(youTubeLable.isDisplayed());

   }



}
