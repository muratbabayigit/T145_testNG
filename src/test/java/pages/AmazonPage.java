package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id='searchDropdownBox']")
    public WebElement dropdownBox;

    @FindBy(xpath = "//select[@name='url']")
    public WebElement dropdownMenu;


}
