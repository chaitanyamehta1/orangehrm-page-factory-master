package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Pradip
 */
public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement _adminFeature;
    @FindBy(id = "btnAdd")
    WebElement _add;

    public void clickOnAdminFeature() {
        Reporter.log("Clicking on admin button " + _adminFeature.toString() + "<br>");
        clickOnElement(_adminFeature);
        log.info("Clicking on admin button " + _adminFeature.toString());
    }

    public void clickOnAddButton() {
        Reporter.log("Clicking on add button " + _add.toString() + "<br>");
        clickOnElement(_add);
        log.info("Clicking on add button " + _add.toString() + "<br>");
    }





}
