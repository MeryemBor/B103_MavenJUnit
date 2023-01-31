package day18;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


public class C02_Log4J {
    //3. Logger object olustur:
//    private static Logger logger = LogManager.getLogger(Demo1.class.getName());
//4. Logger fonksiyonuyla istenilen fonksiyonu kullan
//                 logger.debug("Debug logger");
//        logger.info("Info logger");
//        logger.error("Error logger");
//        logger.fatal("Fatal logger");
    private static Logger logger = LogManager.getLogger(C02_Log4J.class.getName());
    @Test
    public void log4JTest(){
//   logger islemi ile yazdirma islemini yap
        logger.fatal("Fatal Log");//22:48:23.950 [main] FATAL day18.C02_Log4J - Fatal Log
        logger.error("Eror Log"); //22:48:23.955 [main] ERROR day18.C02_Log4J - Eror Log
        logger.warn("Warn Log");
        logger.debug("Debug Log");
        logger.info("Info Log");



    }
}





