package com.softwaretestingboard.magento.cucumber.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WomenSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }


    @And("I hover on women menu")
    public void iHoverOnWomenMenu() {
        new HomePage().mouseHoverToWomenMenu();
    }


    @And("I click on jackets")
    public void iClickOnJackets() {
        new HomePage().clickOnJackets();
    }

    @And("I click on sort by")
    public void iClickOnSortBy() {
        new JacketsPage().clickOnSortBy();
    }

    @And("I select on sort by filter product name")
    public void iSelectOnSortByFilterProductName() {
        new JacketsPage().sortByProduce("Product Name");

    }
    @Then("verify the product name display in alphabetical order")
    public void verifyTheProductNameDisplayInAlphabeticalOrder() {
        Assert.assertEquals("Text not in alphabetical order", "Set Ascending Direction", new JacketsPage().alphabeticalOder());

    }


    @And("I select on sort by filter price")
    public void iSelectOnSortByFilterPrice() {
        new JacketsPage().sortByPriceFilter("name");
    }
    @Then("verify the product price display in low to high")
    public void verifyTheProductPriceDisplayInLowToHigh() {
        Assert.assertEquals("Text not in Ascending Direction ", "Set Descending Direction", new JacketsPage().verifyLowToHighText());

    }



}
