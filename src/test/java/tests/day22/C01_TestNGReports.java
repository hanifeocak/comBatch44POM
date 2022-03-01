package tests.day22;

import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNGReports extends TestBaseRapor {
    @Test
    public void windowHandleresuableTest() throws IOException {
       extentTest= extentReports.createTest("window handle","title ile 2.sayfaya gecis yapildigi test edildi");

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
       extentTest.info("herokuapp sayfasina gidildi");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
       extentTest.info("yeni window linkine tiklandi");

    ReusableMethods.switchToWindow("New Window");
extentTest.info("resuable method kullanarak acilan ikinci sayfaya gecildi");
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();


        Assert.assertEquals(actualTitle,expectedTitle);
       extentTest.pass("title'nin beklenen deger oldugu test edildi");
        ReusableMethods.getScreenshot("windowSwitch");
        Driver.closeDriver();
    }

}
