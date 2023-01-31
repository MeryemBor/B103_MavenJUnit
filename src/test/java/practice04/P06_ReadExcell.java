package practice04;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

public class P06_ReadExcell {
    @Test
    public void name() throws IOException {
        //Bilgisayarınızdaki data isimli excel dosyasından kullanıcı bilgilerini alıp
        String dosyaYolu = "c:\\Users\\merye\\Desktop";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);

    }
}


    //https://www.bluerentalcars.com/ adresine gidip
    //Excel dosyasından aldığımız kullanıcı bilgileri ile login olalım
    // Login olduğumuzu doğrulayalım
