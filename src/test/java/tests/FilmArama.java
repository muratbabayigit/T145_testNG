package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.babayigitPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FilmArama {
    String filmName;

     /*
        https://www.babayigit.net/test adresine gidin
        1-arama kutusuna "12 Angry Men" yazip, cikan sonuc sayisini yazdirin
        2-arama kutusuna "Vizontele” yazip, cikan sonuc sayisini yazdirin
        3-arama kutusuna "Saving Private Ryan” yazip, cikan sonuc sayisini yazdirin
  */

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));
        babayigitPage obj=new babayigitPage();
        filmName="12 Angry Men";
        obj.searchBox.sendKeys(filmName+ Keys.ENTER);
        obj.toolsButton.click();
        System.out.println("Aradığınız "+filmName+" için bulunan sonuç sayısı"+obj.result.getText());
        //Driver.quitDriver();
    }
    @Test
    public void test02(){
        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));
        babayigitPage obj=new babayigitPage();
        filmName="Vizontele";
        obj.searchBox.sendKeys(filmName+ Keys.ENTER);
        obj.toolsButton.click();
        System.out.println("Aradığınız "+filmName+" için bulunan sonuç sayısı"+obj.result.getText());
       // Driver.quitDriver();
    }
    @Test
    public void test03(){
        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));
        babayigitPage obj=new babayigitPage();
        filmName="Saving Private Ryan";
        obj.searchBox.sendKeys(filmName+ Keys.ENTER);
        obj.toolsButton.click();
        System.out.println("Aradığınız "+filmName+" için bulunan sonuç sayısı"+obj.result.getText());
        Driver.quitDriver();
    }
}
