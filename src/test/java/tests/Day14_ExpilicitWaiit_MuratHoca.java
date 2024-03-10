package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Day14_ExpilicitWaiit_MuratHoca extends TestBase {

     /*
    Given
            Go to https://the-internet.herokuapp.com/dynamic_loading/1
    When
           User clicks on the "Start" button
    Then
           Assert the "Hello World!"  Shows up on the screen
     */

    @Test
    public  void explicitWaitTest(){
        //Go to https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //     User clicks on the "Start" button
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
        /* this may work as well  as an Xpath "//button[.='Start']", as sometimes we need to go deeper in order for
        the element to be clickable, where sometimes a simple Id  may not work and you may need to  make it more
        specific by narrowing the clicable area because when we inpect the button it gives a large pool of area. so we are specifying
        it just by saying button.
         */


          //Assert the "Hello World!"  Shows up on the screen
       // String helloWorldText = driver.findElement(By.xpath("//h4[.='Hello World!']")).getText();
      //  assertEquals("Helllo World!",helloWorldText);

        //Implicit wait could not handle the waiting issue. we will try Explicit Wait:
        //1.Step:Create web driver wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //2.Step: Use waite object to handle the waiting issue(syncronization)
        WebElement helloWorld = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[.='Hello World!']")));
        assertEquals("Hello World!", helloWorld.getText() );


    }
    @Test
    public  void explicitWaitTestReusable (){
        //Go to https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //     User clicks on the "Start" button
        driver.findElement(By.xpath("//button[.='start']")).click();

        //Assert the hello world shows up on the screen
        WebElement helloWorld = driver.findElement(By.xpath("//h4[.='Hello World!'"));
        String helloWorldString =waitForVisibility(helloWorld,15).getText();
        assertEquals("Hello World!" , helloWorldString);

    }

}
