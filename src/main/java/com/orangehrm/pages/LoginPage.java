package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Chaitanya
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //below variables stored locators
    @FindBy(id = "txtUsername")
    WebElement _userNameField;
    @FindBy(id = "txtPassword")
    WebElement _passwordField;
    @FindBy(id = "btnLogin")
    WebElement _clickOnLoginButton;
    @FindBy(id = "welcome")
    WebElement _welcomeAdminText;


    //below methods created for each element and doing action on each element
    public void setUserNameField(String admin) {
        Reporter.log("Enter user name " + admin + "Username field " + _userNameField.toString() + "<br>");
        sendTextToElement(_userNameField, admin);
        log.info("Enter user name " + admin + "Username field " + _userNameField.toString());
    }

    //below methods created for each element and doing action on each element
    public void setPasswordField(String password) {
        Reporter.log("Enter password " + password + "Password field " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Enter password " + password + "Password field " + _passwordField.toString());
    }

    public void setClickOnLoginButton() {
        Reporter.log("Clicking on login button " + _clickOnLoginButton.toString() + "<br>");
        clickOnElement(_clickOnLoginButton);
        log.info("Clicking on login button " + _clickOnLoginButton.toString());
    }

    public String getWelcomeAdminText() {
        Reporter.log("Getting welcome admin text " + _welcomeAdminText.toString() + "<br>");
        log.info("Getting welcome admin text " + _welcomeAdminText.toString());
        return getTextFromElement(_welcomeAdminText);
    }


}
