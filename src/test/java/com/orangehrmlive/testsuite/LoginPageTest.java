package com.orangehrmlive.testsuite;


import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage =new LoginPage();
    @Test
    public  void userShouldloginSuccessfullyWithValidCredentials(){
        loginPage.enterToUserNameField("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getAfterLoginText(), "Dashboard", "Text not found");
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgotPasswordLink();
        Assert.assertEquals(loginPage.getResetText(), "Reset Password", "Text not found");

    }

    }
