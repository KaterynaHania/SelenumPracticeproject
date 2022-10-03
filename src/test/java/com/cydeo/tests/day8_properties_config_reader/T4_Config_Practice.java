package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utlities.ConfigurationReader;
import com.cydeo.utlities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

  /*  public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

   */

    @Test
    public void google_search_test(){
        Driver.getDriver().get("https://www.google.com");

        //3- Write “apple” in search box
        WebElement googleSearchBox =
        Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
WebElement acceptAllCookiesBtn = Driver.getDriver().findElement(By.id("L2AGLb"));
acceptAllCookiesBtn.click();
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Google-søgning";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }

}
