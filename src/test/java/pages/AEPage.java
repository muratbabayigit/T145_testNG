package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AEPage {
    public AEPage (){PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (linkText = " Signup / Login")
    public WebElement singupLink;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement signupName;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement signupMail;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signupButton;



    @FindBy(xpath = "//*[@data-qa='password']")
    public WebElement password;


    @FindBy(xpath = "//*[@data-qa='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@data-qa='last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//*[@data-qa='address']")
    public WebElement address;
    @FindBy(xpath = "//*[@data-qa='state']")
    public WebElement state;
    @FindBy(xpath = "//*[@data-qa='city']")
    public WebElement city;
    @FindBy(xpath = "//*[@data-qa='zipcode']")
    public WebElement zipcode;
    @FindBy(xpath = "//*[@data-qa='mobile_number']")
    public WebElement mobileNumber;
    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement createButton;
    @FindBy(xpath = "//*[@data-qa='account-created']")
    public WebElement created;

    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement continueButton;
     @FindBy(xpath = "(//*[@style='color:brown;'])[2]")
    public WebElement deleteButton;
    @FindBy(xpath = "//*[@data-qa='account-deleted']")
    public WebElement deleted;







}
