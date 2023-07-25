package com.softwaretestingboard.magento.pages;


import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class JacketsPage extends Utility {
    private static final Logger log = LogManager.getLogger(JacketsPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement sortBy;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]")
    WebElement alphabetical;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]")
    WebElement priceFilter;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]")
    WebElement lowTo;


    public void clickOnSortBy() {
        clickOnElement(sortBy);

    }

    public void sortByProduce(String name) {
    selectByVisibleTextFromDropDown (sortBy, name);
        log.info("sort by produce.." + sortBy.toString());
    }

    public String alphabeticalOder() {
        String text = getTextFromElement(alphabetical);
        log.info("alphabetical oder text .." + alphabetical.toString());
        return text;
    }

    public void sortByPriceFilter(String value) {
        selectByValueFromDropDown(priceFilter, value);
        log.info("sort by Price filter.." + priceFilter);
    }

    public String verifyLowToHighText() {

        String text = getTextFromElement(lowTo);
        log.info("verify lot to high text.." + lowTo);
        return text;



    }


}
