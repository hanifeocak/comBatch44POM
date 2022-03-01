package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPage {

   public TrendyolPage(){
        PageFactory.initElements(Driver.getDriver(),this);

}
    @FindBy(xpath ="//div[@class='homepage-popup-content']")
    public WebElement kadinElementi;

    @FindBy(xpath ="//img[@alt='Trendyol']")
    public WebElement logoElementi;

    @FindBy(xpath = "//input[@class='search-box']")
    public WebElement aramaKutusuElementi;

    @FindBy(xpath = "//div[@class='dscrptn']")
    public WebElement elmasonucYazisiElementi;

    @FindBy(xpath ="(//div[.='Sepete Ekle'])[2]")
    public  WebElement sepeteEkleElementi;

    @FindBy(xpath = "(//p[@class='link-text'])[3]")
    public WebElement sepetElementi;
}
