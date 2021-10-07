package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {

    public CreateContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='oro_contact_form[namePrefix]']")
    public WebElement namePrefix;

    @FindBy(xpath = "//*[@name='oro_contact_form[firstName]']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@name='oro_contact_form[middleName]']")
    public WebElement middleName;

    @FindBy(xpath = "//*[@name='oro_contact_form[lastName]']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@name='oro_contact_form[nameSuffix]']")
    public WebElement nameSuffix;

    @FindBy(xpath = "//*[@id=\"mceu_24\"]")
    public WebElement descriptionBody;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[2]/div/div[2]/div/div[1]/div[2]/div/fieldset/div[1]/div[10]/div[2]/div[1]/div/div/div/div/div/input")
    public WebElement emailsBox;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[2]/div/div[2]/div/div[1]/div[2]/div/fieldset/div[1]/div[11]/div[2]/div[1]/div/div/div/div/div/input")
    public WebElement phonesBox;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[2]/div/div[2]/div/div[1]/div[2]/div/fieldset/div[1]/div[12]/div[2]/input")
    public WebElement faxBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[skype]']")
    public WebElement skypeBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[twitter]']")
    public WebElement twitterBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[facebook]']")
    public WebElement facebookBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[googlePlus]']")
    public WebElement googleBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[linkedIn]']")
    public WebElement linkedinBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[jobTitle]']")
    public WebElement jobTitleBox;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[2]/div/div[2]/div/div[1]/div[2]/div/fieldset/div[1]/div[20]/div[2]/input")
    public WebElement birthdayBox;

    @FindBy(xpath = "//*/span[contains(.,'Please select a file')]")
    public WebElement fileUpload;

    @FindBy(xpath = "//*/span[contains(.,'Choose File')]")
    public WebElement chooseFileBtn;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][primary]']")
    public WebElement primaryCheckBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][label]']")
    public WebElement labelBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][namePrefix]']")
    public WebElement namePrefBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][firstName]']")
    public WebElement nameFirstBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][middleName]']")
    public WebElement nameMiddleBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][lastName]']")
    public WebElement nameLastBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][nameSuffix]']")
    public WebElement nameSuffixBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][organization]']")
    public WebElement organizationBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][street]']")
    public WebElement streetBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][street2]']")
    public WebElement streetBox2;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][city]']")
    public WebElement cityBox;

    @FindBy(xpath = "//*[@name='oro_contact_form[addresses][0][postalCode]']")
    public WebElement postalCodeBox;

    @FindBy(xpath = "//*[@value='billing']")
    public WebElement billingCheckBox;

    @FindBy(xpath = "//*[@value='shipping']")
    public WebElement shippingCheckBox;

    @FindBy(xpath = " //*/div/button[contains(.,'Save and Close')]")
    public WebElement saveAndClose;

    @FindBy(xpath = "//*[@id=\"flash-messages\"]/div/div")
    public WebElement savedMsg;



}
