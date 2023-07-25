package com.softwaretestingboard.magento.cucumber.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GearSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {

    }

    @When("I hover on gear menu")
    public void iHoverOnGearMenu() {
        new HomePage().gearMenuHover();

    }

    @And("I click on bags")
    public void iClickOnBags() {
        new HomePage().clickOnBags();
    }

    @And("I click on Product Name {string}")
    public void iClickOnProductNameOvernightDuffle(String productName) {
        new GearPage().clickOnProductName();

    }

    @Then("I can see the text {string}")
    public void iCanSeeTheTextOvernightDuffle(String text) {
        Assert.assertEquals("Text not found", "Overnight Duffle", new GearPage().verifyTextOvernightDuffle());
    }

    @And("I change Qty {int}")
    public void iChangeQty(int quy) {
        new GearPage().clearTheQty("3");

    }

    @And("click on {string}Button")
    public void clickOnAddToCartButton() {
        new GearPage().addToTheCart();

    }

    @Then("I can see the text ‘You added Overnight Duffle to your shopping cart.’")
    public void iCanSeeTheTextYouAddedOvernightDuffleToYourShoppingCart() {
        Assert.assertEquals("Text not found", "You added Overnight Duffle to your shopping cart.", new GearPage().verifyTextAddToCart());

    }

    @And("I click on the ‘shopping cart’ Link into message")
    public void iClickOnTheShoppingCartLinkIntoMessage() {
        new GearPage().clickOnShoppingCartForDuffle();
    }

    @Then("I should see the product name ‘Cronus Yoga Pant’")
    public void iShouldSeeTheProductNameCronusYogaPant() {
        new GearPage().verifyTextCronusYogaPant();
    }

    @Then("I can see the Qty is ‘{int}’")
    public void iCanSeeTheQtyIs(int num) {
        new GearPage().verifyQtyIsThree();

    }

    @Then("I can see the product price {string}")
    public void iCanSeeTheProductPrice(String price) {
        new GearPage().verifyThePrice();
    }

    @And("change Qty to {string}")
    public void changeQtyTo(String qty) {
        new GearPage().clearQtyForYoga("5");
    }

    @And("click on ‘Update Shopping Cart’ button")
    public void clickOnUpdateShoppingCartButton() {
        new GearPage().updateTheShoppingCartClick();
    }

    @Then("I should verify the product price {string}")
    public void iShouldVerifyTheProductPrice(String price) {
        Assert.assertEquals("Text not found", "$225.00", new GearPage().verifyProductPriceLastTime());

    }


}
