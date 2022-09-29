package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utlities.ConfigurationReader;
import com.cydeo.utlities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }

    @Test
    public void google_search_test(){
        //3- Write “apple” in search box
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
WebElement acceptAllCookiesBtn = driver.findElement(By.id("L2AGLb"));
acceptAllCookiesBtn.click();
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle = "apple - Google-søgning";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }

}
