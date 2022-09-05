package com.cydeo.tests.day1_selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //TC #1: Yahoo Title Verification
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        // 3. Verify title:
        String expectedTitle = "Yahoo er en del af Yahoo-familien af brands";

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

       if (currentTitle.equals(expectedTitle)){
           System.out.println("Passed!");
       }else {
           System.out.println("Failed");
       }


        //Expected: Yahoo









    }

}
