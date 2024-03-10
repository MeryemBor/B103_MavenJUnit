package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day14_TimeOutException  extends TestBase {

    @Test
    public void timeOutExceptionTest(){
        driver.get("https://techproeducation.com/");


//On the Tutor's page, org.openqa.selenium.TimesOutException: is written
// but on mine  i see org.openqa.selenium.InvalidSelectorException:
   //    waitForVisibility(By.xpath("//123"),3);// If it can not find the element in 3 seconds it will throw exception
    }
}
