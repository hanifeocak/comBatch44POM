package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class

RShoppingPage {
    public RShoppingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



   @FindBy(xpath = "//div[@class='shelf-item']")
           public List<WebElement> tumElementler;

    @FindBy(xpath = "//p[@class='shelf-item__title']")
    public List<WebElement> urunIsimElementler;




}

