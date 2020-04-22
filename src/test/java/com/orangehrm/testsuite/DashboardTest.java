package com.orangehrm.testsuite;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Chaitanya
 */
public class DashboardTest extends TestBase {
    DashboardPage dashboardPage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"regression", "smoke", "sanity"})
    public void setUp() {
        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"regression", "smoke", "sanity"})
    public void verifyUserShouldClickOnAdminFeature() {
        loginPage.setUserNameField("Admin");
        loginPage.setPasswordField("admin123");
        loginPage.setClickOnLoginButton();
        dashboardPage.clickOnAdminFeature();

    }

    @Test(groups = {"sanity", "smoke"})
    public void verifyUserShouldAddEmployeeName() {
        loginPage.setUserNameField("Admin");
        loginPage.setPasswordField("admin123");
        loginPage.setClickOnLoginButton();
        dashboardPage.clickOnAdminFeature();
        dashboardPage.clickOnAdminFeature();
        dashboardPage.clickOnAdminFeature();
        dashboardPage.clickOnAddButton();


    }

}
