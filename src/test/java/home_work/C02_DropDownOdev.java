package home_work;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class C02_DropDownOdev extends TestBase {

    //Test01 :  1- amazon gidin
    //Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
    //dropdown menude 40 eleman olduğunu doğrulayın
    //Test02
    //dropdown menuden elektronik bölümü seçin

    @Test
    public void dropDownTest01(){

 //        1- amazon gidin
        driver.get("https://www.amazon.com");

//    2-Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
      WebElement dropDownMenue= driver.findElement(By.cssSelector("select#searchDropdownBox"));
      dropDownMenue.click();

      List<WebElement> Menue = driver.findElements(By.cssSelector("select#searchDropdownBox"));
      Select select= new Select(dropDownMenue);
      for (WebElement eachListItem: select.getOptions()){
          System.out.println(eachListItem.getText());
      }

      //dropdown menude 40 eleman olduğunu doğrulayın //bende 28 eleman var.
        int numOfElements;
        System.out.println( numOfElements =driver.findElements(By.xpath("//option")).size());
        Assert.assertEquals(28, numOfElements);

    }

    @Test
    public void Test02(){
        //dropdown menuden elektronik bölümü seçin
      // driver.findElement(By.cssSelector("select#searchDropdownBox")).sendKeys("Electronics");

    }

}
