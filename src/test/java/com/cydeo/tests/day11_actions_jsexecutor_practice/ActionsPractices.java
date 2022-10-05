package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utlities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

@Test
    public void task_4_and_5_test(){

    //TC #4: Scroll practice
    //1- Open a Chrome browser
    //2- Go to: https://practice.cydeo.com/
    Driver.getDriver().get("https://practice.cydeo.com/");


    //3- Scroll down to “Powered by CYDEO”
    Actions actions = new Actions(Driver.getDriver());

    WebElement cydeoLinkBtn = Driver.getDriver().findElement(By.linkText("CYDEO"));



    //4- Scroll using Actions class “moveTo(element)” method

    actions.moveToElement(cydeoLinkBtn).perform();

    //5- Scroll back up to “Home” link using PageUP button

    actions.sendKeys(Keys.PAGE_UP).perform();

    Driver.closeDriver();





}
    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test4(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }



}
