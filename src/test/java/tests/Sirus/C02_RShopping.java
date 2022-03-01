package tests.Sirus;

import com.github.javafaker.Faker;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.RShoppingPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;


public class C02_RShopping {
    RShoppingPage rShoppingPage;


    // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
    // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
    // (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
    // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
    // 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
    // (Her ürün 1 defadan fazla eklenemez!)
    // 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
    // 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
    // 7.Checkout'a tıklayın
    @Test
    public void RShopping() {


        Driver.getDriver().get(ConfigReader.getProperty("RShoppingUrl"));
        rShoppingPage = new RShoppingPage();

        for (WebElement each : rShoppingPage.tumElementler
        ) {
            System.out.println(each.getText());
        }

        // (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
        int sayac = 1;
        for (WebElement each : rShoppingPage.urunIsimElementler
        ) {
            System.out.println(sayac + "urun : " + each.getText());
            sayac++;

        }
        // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < rShoppingPage.urunIsimElementler.size(); i++) {
            arrayList.add(rShoppingPage.urunIsimElementler.get(i).getText());
        }
        System.out.println(arrayList);
// 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın

       // Select select = new Select(rShoppingPage.urunIsimElementler);
     //   select.selectByIndex(rShoppingPage.random().nextInt(1, 16));

     //   WebElement rShoppingPageElement = rShoppingPage.findElement(By.xpath("//select[@id='SELECTOR_2']"));

   //     System.out.println(random.nextInt(5));
    }
    }












