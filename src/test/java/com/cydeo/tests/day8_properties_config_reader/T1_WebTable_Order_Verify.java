package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utlities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {
public WebDriver driver;
@BeforeMethod
public void setupMethod(){
   driver = WebDriverFactory.getDriver("chrome");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.get("https://practice.cydeo.com/web-tables");

}


@Test
        public void order_name_verify_test(){

    //2. VerifyBob’snameislistedasexpected.
    //Expected: “Bob Martin”


    //3. VerifyBobMartin’sorderdateisasexpected
    //Expected: 12/31/2021

}

}
