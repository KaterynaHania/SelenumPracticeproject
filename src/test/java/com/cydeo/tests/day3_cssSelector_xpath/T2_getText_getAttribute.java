package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utlities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED!");
        }else {
            System.out.println("Label verification FAILED!");
        }

        //Expected: Remember me on this computer
        // 4- Verify “forgot password” link text is as expected:
        WebElement forgetPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText = "Forgot your password?";
        String actualForgotPasswordLinkText = forgetPasswordLink.getText();

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("Forgot Password Link Text PASSED!");
        }else {
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
            System.out.println("Forgot Password Link Text FAILED!");
        }

        //Expected: Forgot your password?
        //5- Verify “forgot password” href attribute’s value contains expected:
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgetPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualForgotPasswordLinkText.contains(expectedInHref)){
            System.out.println("HREF attribute value is PASSED");
        }else {
            System.out.println("HREF attribute value is FAILED");
        }


        //Expected: forgot_password=yes



    }

}
