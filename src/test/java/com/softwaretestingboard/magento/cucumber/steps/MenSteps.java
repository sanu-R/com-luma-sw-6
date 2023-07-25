package com.softwaretestingboard.magento.cucumber.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }

    @When("I hover on men menu")
    public void iHoverOnMenMenu() {
        new HomePage().mouseHoverToMenMenu();
    }


    @And("I hover on bottoms")
    public void iHoverOnBottoms() {
        new HomePage().mouseHooverToBottoms();
    }

    @And("I click on pants")
    public void iClickOnPants() {
        new HomePage().clickOnPants();
    }


    @And("I hover on product name ‘Cronus Yoga Pant’")
    public void iHoverOnProductNameCronusYogaPant() {
        new MenPage().cronusSize();
    }

    @And("I click on size {string}")
    public void iClickOnSize(int num) {
        new MenPage().ClickOnSizeMen();
    }

    @And("I hover and click on colour Black")
    public void iHoverAndClickOnColourBlack() {
        new MenPage().cronusColour();
    }

    @And("I add to cart button")
    public void iAddToCartButton() {
        new MenPage().addToCartMen();
    }

    @Then("I can see text ‘You added Cronus Yoga Pant to your shopping cart.’")
    public void iCanSeeTextYouAddedCronusYogaPantToYourShoppingCart() {
        Assert.assertEquals("Text not found", "You added Cronus Yoga Pant to your shopping cart.", new MenPage().verifyTheAddText());
    }

    @And("I click on ‘shopping cart’ Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenPage().clickOnShoppingCart();
    }

    @Then("I can see the  text ‘Shopping Cart.’")
    public void iCanSeeTheTextShoppingCart() {
        Assert.assertEquals("Text not found", "Shopping Cart.", new MenPage().verifyTextShoppingCart());

    }

    @And("I can see the product name ‘Cronus Yoga Pant’")
    public void iCanSeeTheProductNameCronusYogaPant() {
        Assert.assertEquals("Text not found", "Cronus Yoga Pant", new MenPage().verifyTextCronusPant());

    }

    @Then("I can see the product size {int}")
    public void iCanSeeTheProductSize(int num) {
        Assert.assertEquals("Text not found", "32", new MenPage().verifySizeText());

    }

    @And("I can see the product colour ‘Black’")
    public void iCanSeeTheProductColourBlack() {
        Assert.assertEquals("Text not found", "Black", new MenPage().verifyColourText());
    }


}
