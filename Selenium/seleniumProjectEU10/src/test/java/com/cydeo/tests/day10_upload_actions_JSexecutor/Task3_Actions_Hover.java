package com.cydeo.tests.day10_upload_actions_JSexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3_Actions_Hover {

//    TC #3: Hover Test
//1. Go to https://practice.cydeo.com/hovers
    @Test
    public void hovering_test(){
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        //Locate all images here:
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //Locate all the "user" texts here
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        //Locate all the “view profile”
        WebElement viewProfileText1 = Driver.getDriver().findElement(By.xpath("(//div/a[.='View profile'])[1]"));
        WebElement viewProfileText2 = Driver.getDriver().findElement(By.xpath("(//div/a[.='View profile'])[2]"));
        WebElement viewProfileText3 = Driver.getDriver().findElement(By.xpath("(//div/a[.='View profile'])[3]"));

        Actions actions = new Actions(Driver.getDriver());
//2. Hover over to first image
        BrowserUtils.sleep(2);
        actions.moveToElement(img1).perform();
//3. Assert:
//    a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());

//    b. “view profile” is displayed
        BrowserUtils.sleep(2);
        actions.moveToElement(viewProfileText1).perform();
        Assert.assertTrue(viewProfileText1.isDisplayed());

//4. Hover over to second image
        BrowserUtils.sleep(2);
        actions.moveToElement(img2).perform();
//5. Assert:
//    a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());

//    b. “view profile” is displayed
        BrowserUtils.sleep(2);
        actions.moveToElement(viewProfileText2).perform();
        Assert.assertTrue(viewProfileText2.isDisplayed());

//6. Hover over to third image
        BrowserUtils.sleep(2);
        actions.moveToElement(img3).perform();

//7. Confirm:
//    a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());

//    b. “view profile” is displayed
        BrowserUtils.sleep(2);
        actions.moveToElement(viewProfileText3).perform();
        Assert.assertTrue(viewProfileText3.isDisplayed());



    }




}
