package com.cydeo.tests.day11_driver_close_actions_jsexecutor_practices;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_Circle_Drag_and_Drop {

    @Test//    TC #: Drag and drop
    public void drag_and_drop(){

//1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //Locate "Accept cookies" button and click
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        BrowserUtils.sleep(2);
        acceptCookiesButton.click();
//Locate small and big circles to be able to drag them around
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

//2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.clickAndHold(smallCircle).
                pause(2000).
                moveToElement(bigCircle).
                pause(2000).
                release().
                perform();
        BrowserUtils.sleep(2);
//3. Assert:
//-Text in big circle changed to: “You did great!”
        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";
        Assert.assertEquals(actualBigCircleText,expectedBigCircleText);



    }




}
