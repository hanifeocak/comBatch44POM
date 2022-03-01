package tests.Sirus;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TrendyolPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Trendyol {



    //trendyol gidelim  //gittigimiz sayfanın trendyol oldugunu dogrulayalım //arama kutusuna elma yazıp aratalım //elma aramasının yapıldıgını dogrulayalım ve sonuc yazısını yazdıralım
    // boolean aramaDogrulama=tp.sonucYazisi.getText().contains("elma");  //  WebElement urun100=Driver.getDrive().findElement(By.xpath("(//div[@class='image-overlay-body'])[100]"));
    // scrollKulan(Driver.getDrive());
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("TrendyolUrl"));
        TrendyolPage trendyolPage=new TrendyolPage();
        trendyolPage.kadinElementi.click();
    //amazona gittigimizi dogrulayalim
       // String actual=(ConfigReader.getProperty("TrendyolUrl"));
     //   Assert.assertTrue(actual.contains("trendyol"));
    Assert.assertTrue(trendyolPage.logoElementi.isDisplayed());
    trendyolPage.aramaKutusuElementi.sendKeys("elma"+ Keys.ENTER);
  //  String sonucYazisiElementi.
    Assert.assertTrue(trendyolPage.elmasonucYazisiElementi.isDisplayed());
    String dogrulama=trendyolPage.elmasonucYazisiElementi.getText();
        System.out.println(dogrulama);
        trendyolPage.sepeteEkleElementi.click();
        //urunun sepete eklendigini kontrol edelim
        trendyolPage.sepetElementi.click();

    }







}
