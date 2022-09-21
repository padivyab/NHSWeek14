package com.nhs.steps;

import com.nhs.pages.HomePage;
import com.nhs.pages.NHSFormPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.testng.Assert;

public class nhssteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on start button$")
    public void iClickOnStartButton() throws InterruptedException {

        new HomePage().ClickOnStart();
        Thread.sleep(1000);
    }

    @And("^I click on wales$")
    public void iClickOnWales() throws InterruptedException {
        new NHSFormPage().ClickWales();
        Thread.sleep(1000);
    }
    @And("^I click on next button$")
    public void iClickOnNextButton() throws InterruptedException {
        new NHSFormPage().ClickOnNextButton();
        Thread.sleep(1000);
    }

    @And("^I click on yes button$")
    public void iClickOnYesButton() throws InterruptedException {
        new NHSFormPage().ClickOnYesButton();
        Thread.sleep(1000);
    }

    @And("^I click on day$")
    public void iClickOnDay() throws InterruptedException {
        new NHSFormPage().EnterDay();
        Thread.sleep(1000);
    }

    @And("^I click on month$")
    public void iClickOnMonth() throws InterruptedException {
        new NHSFormPage().EnterMonth();
        Thread.sleep(1000);
    }

    @And("^I click on year$")
    public void iClickOnYear() throws InterruptedException {
        new NHSFormPage().EnterYear();
        Thread.sleep(1000);
    }

    @And("^I click on no button$")
    public void iClickOnNoButton() throws InterruptedException {
        new NHSFormPage().SelectNo();
        Thread.sleep(1000);
    }

    @And("^I click on next a button$")
    public void iClickOnNextAButton() throws InterruptedException {
        new NHSFormPage().ClickOnNext();
        Thread.sleep(1000);
    }

    @And("^I click on link$")
    public void iClickOnLink() throws InterruptedException {
        new NHSFormPage().ClickOnLink();
        Thread.sleep(1000);

    }

    @And("^I click on northern ireland$")
    public void iClickOnNorthernIreland() throws InterruptedException {
        new NHSFormPage().SelectNorthernIrealnd();
        Thread.sleep(1000);
    }

    @Then("^I verify costs \"([^\"]*)\"$")
    public void iVerifyCosts(String msg)
    {
        Assert.assertEquals(msg,new NHSFormPage().VerifyCostPageWales());
    }

    @Then("^I verify costs page \"([^\"]*)\"$")
    public void iVerifyCostsPage(String msg1)
    {
        Assert.assertEquals(msg1,new NHSFormPage().VerifyCostNorthrenIreland());
    }
}
