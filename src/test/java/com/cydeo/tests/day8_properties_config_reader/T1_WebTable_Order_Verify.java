package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utlities.WebDriverFactory;
import com.cydeo.utlities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

    //Locate the cell that has Bob Martin text in it
    WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
  //  System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());
    //2. VerifyBob’s name is listed as expected.
    String expectedBobName = "Bob Martin";
    String actualBobName = bobMartinCell.getText();

    Assert.assertEquals(actualBobName,expectedBobName);
    //Expected: “Bob Martin”


    //3. VerifyBobMartin’s order date is as expected.
    //Expected: 12/31/2021

    WebElement bobMartinDateCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

    String expectedBobDate = "12/31/2021";
    String actualBobDate = bobMartinDateCell.getText();

    Assert.assertEquals(actualBobDate,expectedBobDate);




}

@Test
    public void test2(){
    String customerOrderData1 = WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
    System.out.println("customerOrderData1 = " + customerOrderData1);
}


//Using WebTablesUtils.orderVerify(): method
@Test
    public void test3(){

    WebTableUtils.orderVerify(driver,"Bart Fisher", "01/16/2021");

}



}
