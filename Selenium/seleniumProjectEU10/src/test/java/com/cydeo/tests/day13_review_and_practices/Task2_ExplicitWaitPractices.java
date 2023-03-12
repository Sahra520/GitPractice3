package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task2_ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage;
    //    TC #2: Explicit wait practice
    @BeforeMethod
    public void setupMethod(){
        //1- Open a Chrome browser
    //2- Go to: https://practice.cydeo.com/dynamic_controls
    Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
    dynamicControlsPage = new DynamicControlsPage();
}


    @Test
    public void remove_button_test(){

//3- Click to “Remove” button
    dynamicControlsPage.removeButton.click();

//4- Wait until “loading bar disappears”
//        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//        //we turned off implicitly wait
//
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

        //we use from utility package
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

//            5- Verify:
        try {
//    a. Checkbox is not displayed
            Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());

            //assertFalse method will pass if the boolean value returned is : false
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        }catch (NoSuchElementException n) {
            Assert.assertTrue(true);

        }
//    b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));
//            NOTE: FOLLOW POM-page object model

    }


    @Test
    public void enable_button_test(){
//3- Click to “Enable” button
        System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
                + dynamicControlsPage.inputBox.isEnabled());

        dynamicControlsPage.enableButton.click();

        System.out.println("dynamicControlsPage.enableButton.isEnabled() = "
                + dynamicControlsPage.enableButton.isEnabled());

//4- Wait until “loading bar disappears”
        //Calling our ExplicitWait utility method to wait loadingBar to disappear
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
                + dynamicControlsPage.inputBox.isEnabled());

//            5- Verify:
//    a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());

//    b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());

        //check the String value is matching as expected: “It’s enabled!”
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's enabled!"));



    }



}
