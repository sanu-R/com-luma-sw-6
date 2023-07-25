package com.softwaretestingboard.magento.pages;


import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement womenTops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement womenJackets;
    @CacheLookup
    @FindBy(css = "a[id='ui-id-5'] span:nth-child(2)")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottoms;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    WebElement bags;


    public void mouseHoverToWomenMenu() {
        mouseHoverForThreeElement(womenMenu, womenTops, womenJackets);
        log.info("Hover on product and click.." + womenMenu.toString() + womenTops.toString() + womenJackets.toString());

    }


    public void clickOnJackets() {
        clickOnElement(womenJackets);
        log.info("click on women Jackets.." + womenJackets.toString());
    }

    public void mouseHoverToMenMenu() {
        mouseHoverToElement(menMenu);

        log.info("Hover on product and click.." + menMenu.toString());

    }

    public void mouseHooverToBottoms() {
        mouseHoverToElement(bottoms);
        log.info("Hover on product and click.." + bottoms.toString());
    }

    public void clickOnPants() {
        clickOnElement(pants);
        log.info("Hover on product and click.." + pants.toString());
    }

    public void gearMenuHover() {
        mouseHoverToElement(gearMenu);
        log.info("mouse hover on gear Menu.." + gearMenu.toString());
    }

    public void clickOnBags() {
        clickOnElement(bags);
        log.info("click on bags.." + bags);
    }


}
