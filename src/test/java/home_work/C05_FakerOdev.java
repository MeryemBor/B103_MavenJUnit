package home_work;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class C05_FakerOdev extends TestBase {

   //Faker Kutuphanesi HOMEWORK
    //Faker class’i testlerimizi yaparken ihtiyav duydugumuz isim, soyisim, adres vb bilgiler icin fake
    //degerler uretmemize imkan tanir.
    //Faker degerler uretmek icin Faker class’indan bir obje uretir ve var olan method’lari kullaniriz.
    //"https://facebook.com"  Adresine gidin
    //“create new account”  butonuna basin
    //“firstName” giris kutusuna bir isim yazin
    //“surname” giris kutusuna bir soyisim yazin
    //“email” giris kutusuna bir email yazin
    //“email” onay kutusuna emaili tekrar yazin
    //Bir sifre girin
    //Tarih icin gun secin
    //Tarih icin ay secin
    //Tarih icin yil secin
    //Cinsiyeti secin
    //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
    //Sayfayi kapatin

@Test
    public void test01() {
    //"https://facebook.com"  Adresine gidin
    driver.get("https://facebook.com");

    //“create new account”  butonuna basin
    driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

    //“firstName” giris kutusuna bir isim yazin
    Faker faker = new Faker();
    String Name = faker.name().firstName();
    driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys(Name);

    //“surname” giris kutusuna bir soyisim yazin
    //String lastName
    String lastName = faker.name().lastName();
    driver.findElement(By.name("lastname")).sendKeys(lastName);

    //“email” giris kutusuna bir email yazin
    String email = faker.internet().emailAddress();
    driver.findElement(By.name("reg_email__")).sendKeys(email);

    //“email” onay kutusuna emaili tekrar yazin
    driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);

//Bir sifre girin
    String password = faker.internet().password();
    driver.findElement(By.cssSelector("input#password_step_input")).sendKeys(password);

//Tarih icin gun secin
    int day = faker.number().numberBetween(1, 31);
    String dayy = String.valueOf(day);
    driver.findElement(By.name("birthday_day")).sendKeys(dayy);

    //Tarih icin ay secin DROPDOWN KULLANDIK
    int month=faker.number().numberBetween(1,12);
    WebElement moonth=driver.findElement(By.name("birthday_month"));
    Select slc= new Select(moonth);
    slc.selectByIndex(month);
    ;
    //Cinsiyeti secin
    WebElement man =driver.findElement(By.xpath("//input[@value='2']"));
    man.click();
    WebElement woman =driver.findElement(By.xpath("//input[@value='1']"));
    WebElement other =driver.findElement(By.xpath("//input[@value='-1']"));
    int randomIndex= faker.number().numberBetween(1,3);


    //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
    assertTrue(man.isSelected());
    assertFalse(woman.isSelected());
    assertFalse(other.isSelected());
    //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.

    //Sayfayi kapatin TestBase den  KAPANIYOR
}

}

