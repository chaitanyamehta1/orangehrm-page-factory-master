package com.orangehrm.testsuite;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Chaitanya
 */
public class LoginTest extends TestBase {
    LoginPage loginPage;

    @BeforeMethod(groups = {"regression", "smoke", "sanity"})
    public void setUp() {
        loginPage = new LoginPage();
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyUserShouldEnterValidUsername() {
        //below methods calling from pages package
        loginPage.setUserNameField("Admin");
        loginPage.setPasswordField("admin123");
        loginPage.setClickOnLoginButton();
        //compare expected with actual result
        String expectedResult = "Welcome Admin";
        String actualResult = loginPage.getWelcomeAdminText();
        Assert.assertEquals(expectedResult, actualResult);

    }
}