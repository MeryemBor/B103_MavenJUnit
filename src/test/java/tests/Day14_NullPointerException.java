package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utilities.TestBase;

public class Day14_NullPointerException {

    WebDriver driver;//Null it is not assigned to a Web browser  such as " =new EdgeDriver();"
    int number; //gives 1 in the console because it is primitive and primitive int as a default value of 0 anyway which adds to 1.
    Integer number2;  // NonPrimitive data types cannot be assigned to a default value like 0, it is null.
    String str;

    @Test
    public void nullpointerExceptionTest() {
        driver.get("https://techproeducation.com/");

    }

    @Test
    public void nullpointerExceptionTest2() {
        System.out.println(number + 1);
        System.out.println(number2);// It will work just by saying null but when in an operation
                                                       // it will give the null pointer exception
        System.out.println(number2 + 1); //number is not assigned. so it is null
    }

    @Test
    public void nullpointerExceptionTest3() {
        System.out.println(str);
        str.substring(0);//nullPointerException
    }
}
