package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utlities.ConfigurationReader;
import com.cydeo.utlities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_tesr(){



   //TC#1: Registration form confirmation
    //Note: Use JavaFaker OR read from configuration.properties file when possible.
    //1. Openbrowser
    //2. Gotowebsite:https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
    //Create JavaFaker input
        Faker faker = new Faker();

    //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

    //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

    //5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUserName.sendKeys(faker.name().username().replaceAll(".",""));
        String user = faker.bothify("helpdesk###");
        inputUserName.sendKeys(user);


    //6. Enter email address
        WebElement inputEmailAddress = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmailAddress.sendKeys(user+"@gmail.com");

    //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.bothify("###???###??"));

    //8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("571-###-####"));

    //9. Select a gender from radio buttons
        WebElement genderRadioBtn = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        genderRadioBtn.click();

    //10.Enter date of birth
        WebElement inputBirthDate = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputBirthDate.sendKeys("04/10/1999");

    //11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

    //12.Select Job Title
        Select jobTitleDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropdown.selectByIndex(faker.number().numberBetween(1,8));


    //13.Select programming language from checkboxes
        WebElement inputCheckbox = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        inputCheckbox.click();

    //14.Click to sign up button
        WebElement signUpBtn = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        signUpBtn.click();

    //15.Verify success message “You’ve successfully completed registration.” is
    //displayed.




}




}
