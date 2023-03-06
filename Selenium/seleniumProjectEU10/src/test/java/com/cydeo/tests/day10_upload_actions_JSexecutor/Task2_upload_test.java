package com.cydeo.tests.day10_upload_actions_JSexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_upload_test {

    @Test
    public void upload_test(){
        //    TC #2 Upload Test
//1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

//2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\kuwwa\\OneDrive\\Desktop\\HTML files\\Cybertruck.jpg";

//3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        BrowserUtils.sleep(3);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();
//4. Assert:
//-File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed(),"File uploaded text is not displayed");









    }



}
