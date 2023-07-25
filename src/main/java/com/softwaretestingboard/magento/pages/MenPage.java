package com.softwaretestingboard.magento.pages;


import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYoga;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement clickSize;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement colour;
    @CacheLookup
    @FindBy(xpath = "//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement textYouAdded;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyName;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifySize;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyColour;


    public void cronusSize() {
        mouseHoverToElement(cronusYoga);
        log.info("crous size.." + cronusYoga.toString());
    }

    public void ClickOnSizeMen() {
        clickOnElement(clickSize);
        log.info("click on size Men.." + clickSize.toString());
    }

    public void cronusColour() {
        mouseHoverToElementAndClick(colour);
        log.info("cronus colour.." + colour.toString());
    }

    public void addToCartMen() {
        clickOnElement(addToCart);
        log.info("Add to cart" + addToCart.toString());
    }

    public String verifyTheAddText() {
        String text = getTextFromElement(textYouAdded);
        log.info("verify the add text.." + textYouAdded.toString());
        return text;

    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
        log.info("click on shopping cart" + shoppingCart.toString());
    }

    public String verifyTextShoppingCart() {
        String  text =getTextFromElement(verifyCart);

       log.info("verify text.. "+ verifyCart.toString());
        return text;

    }

    public String verifyTextCronusPant() {
        String text =getTextFromElement(verifyName);
     log.info("verify text cronus pant... "+ verifyName.toString());
        return text;
    }

    public String verifySizeText() {
        String text =getTextFromElement(verifySize);


     log.info("verify text cronus pant... "+ verifySize.toString());
        return text;
    }

    public String verifyColourText() {
        String text = getTextFromElement(verifyColour);

        log.info("verify text colour .." + verifyColour.toString());
        return text;
    }


}
