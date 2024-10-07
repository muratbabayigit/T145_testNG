package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class AmazonArama extends TestBaseRapor {

    // amazon anasayfaya gidin
    // arama kutusunun yanindaki dropdown menuyu locate edin
    // dropdown menudeki tum options listesini olusturup
    // menude Electronics basligi oldugunu test edin
    @Test
    public void test01(){

        extentTest=extentReports.createTest("DropDownTest","Aranan Elmenti KOntrol Etme");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon Sitesine Gidildi");

        AmazonPage amazonPage=new AmazonPage();

        Select select=new Select(amazonPage.dropdownMenu);
        extentTest.info("DropdownMenu Locate edildi.");

        //Dropdown Menü içindeki elemanları bir list'e kaydedelim
        List<WebElement> optionsElements=select.getOptions();
        extentTest.info("Tüm elementler bir list içine kaydedildi.");

        List<String> optionsStringList= ReusableMethods.getElementsText(optionsElements);
        extentTest.info("Elementler String yapılarak yeni bir list içine kaydedildi.");
        Assert.assertTrue(optionsStringList.contains(ConfigReader.getProperty("dropdownArananOption")));
        extentTest.pass("Menü de aranan elemanın varolduğu görüldü\nTest başarılı bir şekilde bitirildi.");


        Driver.quitDriver();

    }
}
