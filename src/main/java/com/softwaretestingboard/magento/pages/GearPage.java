package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());



    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Overnight Duffle')]")
    WebElement duffle;
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement clear;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addTo;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyAddToCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement clickOnShopp;
    @CacheLookup
    @FindBy(css = "td[class='col item'] strong[class='product-item-name']")
    WebElement verifyCronusYoga;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement verifyQty;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement verifyPrice;
    @CacheLookup
    @FindBy(css = "td[class='col qty'] input[class*='input-text qty']")
    WebElement clearQty;
    @CacheLookup
    @FindBy(css = "td[class='col qty'] input[class*='input-text qty']")
    WebElement reWriteQty;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShopping;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][text()='$225.00']")
    WebElement verifyProductPrice;

    public void clickOnProductName() {
        clickOnElement(duffle);
        log.info("click on product name .." + duffle.toString());
    }

    public String verifyTextOvernightDuffle() {
        String text = getTextFromElement(verifyText);

        log.info("get text over night duffle.. " + verifyText.toString());
        return text;
    }

    public void clearTheQty(String a) {
        clear.clear();
        sendTextToElement(clear, a);
        log.info("send text to element.." + clear.toString());
    }

    public void addToTheCart() {
        clickOnElement(addTo);
        log.info("click on cart button.. " + addTo.toString());
    }

    public String verifyTextAddToCart() {
        String text = getTextFromElement(verifyAddToCart);

        log.info("get text add to cart.." + verifyAddToCart.toString());
        return text;
    }

    public void clickOnShoppingCartForDuffle() {
        clickOnElement(clickOnShopp);
        log.info("click on shopping cart for duffle.." + clickOnShopp.toString());

    }

    public String verifyTextCronusYogaPant() {
        String text =getTextFromElement(verifyCronusYoga);

    log.info("get text cronus yoga pant.."+verifyCronusYoga.toString());
        return text;
    }

    public void verifyQtyIsThree() {
        getTextFromElement(verifyQty);
        log.info("check the qty is three.." + verifyQty.toString());
    }

    public String verifyThePrice() {
        String text =getTextFromElement(verifyPrice);

        log.info("verify the price.."+verifyPrice.toString());
        return text;
    }

    public void clearQtyForYoga(String q) {
        clearQty.clear();
        sendTextToElement(clearQty, q);
        log.info("clear qty for yoga pants.." + clearQty.toString());
    }


    public void updateTheShoppingCartClick() {
        clickOnElement(updateShopping);
        log.info("update the shopping cart" + updateShopping.toString());
    }

    public String verifyProductPriceLastTime() {
        String text = getTextFromElement(verifyProductPrice);

        log.info("product price.." + verifyProductPrice.toString());
        return  text;
    }


}