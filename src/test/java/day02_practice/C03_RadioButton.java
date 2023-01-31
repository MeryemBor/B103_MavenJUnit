package day02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RadioButton {

    // https://demo.guru99.com/test/radio.html adresine gidin
    // radiobutton elementlerini locate edin
    // option2'yi secin
    // option2 elementlerinin secili oldugunu Test edin
    // option1 elementlerinin secili olmadıgını test edin
    // option3 elementlerinin secili olmadıgını test edin

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() {

        driver.close();
    }
        @Test
                public void test03() {
            // https://demo.guru99.com/test/radio.html adresine gidin
        driver.get("https://demo.guru99.com/test/radio.html");

            // radiobutton elementlerini locate edin
            WebElement Opsion1 = driver.findElement(By.id("idvfb-7-1"));
            WebElement Opsion2 = driver.findElement(By.id("idvfb-7-2"));
            WebElement Opsion3 = driver.findElement(By.id("idvfb-7-3"));
            // option2'yi secin
        Opsion2.click();

            // option2 elementlerinin secili oldugunu Test edin
            Assert.assertTrue(Opsion2.isSelected());

            // option1 elementlerinin secili olmadıgını test edin
        Assert.assertFalse(Opsion1.isSelected());

            // option3 elementlerinin secili olmadıgını test edin
            Assert.assertFalse(Opsion3.isSelected());


        }

    }





