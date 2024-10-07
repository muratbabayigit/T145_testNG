package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AEPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomtionExercise {

    @Test
    public void test01(){

        //Driver penceresi açılıp adrese gidilir
        Driver.getDriver().get("https://automationexercise.com/login");

        //Kullnıcı assertion işlemini işlem sonunda yapabileceği gibi
        // işlem devam ederken de yapabilir
        SoftAssert softAssert=new SoftAssert();
        String expectedUrl="https://automationexercise.com/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Anasayfada değilsiniz");
        Faker faker=new Faker();
        AEPage aePage=new AEPage();
        aePage.singupLink.click();
        ReusableMethods.bekle(2);
        aePage.signupName.sendKeys("Murat");
        aePage.signupMail.sendKeys("murat242@murat.com");
        aePage.signupButton.click();
        ReusableMethods.bekle(2);
        aePage.password.sendKeys("Mb3471");
        aePage.firstName.sendKeys("Murat");
        aePage.lastName.sendKeys("Yiğit");
        aePage.address.sendKeys("Üsküdar");
        aePage.state.sendKeys("nonUSA");
        aePage.city.sendKeys("İstanbul");
        aePage.zipcode.sendKeys("34670");
        aePage.mobileNumber.sendKeys("905555553322");
        aePage.createButton.click();
        ReusableMethods.bekle(2);

        if (aePage.created.isDisplayed()){
            System.out.println("Hesap başarıyla oluşturuldu");
        }else {
            System.out.println("İşlem Başarısız");
        }
        aePage.continueButton.click();
        ReusableMethods.bekle(2);
        aePage.deleteButton.click();

        if(aePage.deleted.isDisplayed()){
            System.out.println("Hesap Silindi");
        }else{
            System.out.println("Hesap Silinemedi");
        }
        Driver.quitDriver();










    }
}
