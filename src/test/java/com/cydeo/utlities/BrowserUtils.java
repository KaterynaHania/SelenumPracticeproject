package com.cydeo.utlities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/*
In this class only general utility methods that are not related
to some specific page
 */
public class BrowserUtils {

    /*
    This method will accept int (in seconds) and execute Thread.sleep
    for given duration
     */
    public void sleep(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);
            System.out.println("Current URL: "+driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }

        }

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
    /*
    This method accepts a String "expectedTitle"
     and Asserts if it's true
     */
public static void verifyTitle(WebDriver driver, String expectedTitle){

    Assert.assertEquals(driver.getTitle(),expectedTitle);

}

}
