package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utlities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    @BeforeMethod
            public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();
    }
    LibraryLoginPage libraryLoginPage;

    @Test
    public void required_field_error_message_test(){

        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Do not enter any information
        //4- Click to “Sign in” button


        libraryLoginPage.signInBtn.click();

        //5- Verify expected error is displayed:

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        //Expected: This field is required. NOTE: FOLLOW POM DESIGN PATTERN

        Driver.closeDriver();

    }

    @Test
    public void invalid_email_format_error_message_test() {
        //TC #2: Invalid email format error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        //3- Enter invalid email format

        libraryLoginPage.inputUsername.sendKeys("dsfrgthyuijo");
        libraryLoginPage.signInBtn.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.

        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMassage.isDisplayed());
        Driver.closeDriver();

    }
    @Test
    public void library_negative_login_test() {
        //TC #3: Library negative login
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Enter incorrect username or incorrect password

        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");

        libraryLoginPage.signInBtn.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());


    }


    }
