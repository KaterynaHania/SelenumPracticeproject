package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utlities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

   @Test
   public void upload_test(){
      //1. Go to https://practice.cydeo.com/upload
      Driver.getDriver().get("https://practice.cydeo.com/upload");

      //2. Find some small file from your computer, and get the path of it.
      String path = "/Users/katerynahania/Pictures/изображение_viber_2022-04-22_22-18-23-741.jpg";

      //3. Upload the file.
      WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
      fileUpload.sendKeys(path);
      WebElement uploadBtn = Driver.getDriver().findElement(By.id("file-submit"));
      uploadBtn.click();

      //4. Assert:
      //-File uploaded text is displayed on the page
     WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
      Assert.assertTrue(fileUploadedHeader.isDisplayed());







   }











}
