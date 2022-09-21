package com.nhs.pages;

import com.nhs.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NHSFormPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement radiobtnwales;

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement Nextbtn;

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement yes;

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-day']")
    WebElement day;

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-month']")
    WebElement month;

    @CacheLookup
    @FindBy(xpath = "//input[@id='dob-year']")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement no;

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextbtn;

    @CacheLookup
    @FindBy(xpath = "//span[@class='summary']")
    WebElement link;

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-nire']")
    WebElement northernireland;

    @CacheLookup
    @FindBy(xpath = "//h1[@id='result-heading']")
    WebElement costwales;

    @CacheLookup
    @FindBy(xpath = "//h2[@id='FREE-heading']")
    WebElement costnothrenirealnd;

    public void ClickWales()  {
        clickOnElement(radiobtnwales);
    }
    public void ClickOnNextButton()
    {
        clickOnElement(Nextbtn);
    }
    public void ClickOnYesButton()
    {
        clickOnElement(yes);
    }
    public void EnterDay()
    {
        sendTextToElement(day,"25");
    }
    public void EnterMonth()
    {
        sendTextToElement(month,"10");
    }
    public void EnterYear()
    {
        sendTextToElement(year,"1997");
    }
    public void SelectNo()
    {
        clickOnElement(no);
    }
    public void ClickOnNext()
    {
        clickOnElement(nextbtn);
    }
    public void ClickOnLink()
    {
        clickOnElement(link);
    }
    public void SelectNorthernIrealnd()
    {
        clickOnElement(northernireland);
    }
    public String VerifyCostPageWales()
    {
        return getTextFromElement(costwales);
    }
    public String VerifyCostNorthrenIreland()
    {
        return getTextFromElement(costnothrenirealnd);
    }
}
