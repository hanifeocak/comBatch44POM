package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_E2ETesting {

    @Test
    public void createHotel(){
        //1. Tests packagenin altına class olusturun: CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://www.hotelmycamp.com adresine git.

        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
        //	a. Username : manager
        //	b. Password  : Manager1!
       //5. Login butonuna tıklayın.
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hotelMyCampPage.bekle(3);
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.hotelListLinki.click();
        hotelMyCampPage.addHotelLinki.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(hotelMyCampPage.addHotelCodeKutusu)
                .sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().country()).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).
                sendKeys(Keys.TAB).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(faker.internet().emailAddress()).perform();
        hotelMyCampPage.bekle(3);
        Select select = new Select(hotelMyCampPage.addHotelDropdown);
        select.selectByIndex(1);
        //8. Save butonuna tıklayın.
        hotelMyCampPage.saveButton.click();
        hotelMyCampPage.bekle(3);
        //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hotelMyCampPage.saveUyariBoxYazisi.isDisplayed());
        hotelMyCampPage.bekle(3);
        //10. OK butonuna tıklayın.
        hotelMyCampPage.saveUyariBoxOk.click();
        hotelMyCampPage.bekle(3);
        Driver.closeDriver();
    }
}