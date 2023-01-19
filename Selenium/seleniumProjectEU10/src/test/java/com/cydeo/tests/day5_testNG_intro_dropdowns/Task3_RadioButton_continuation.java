package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task3_RadioButton_continuation {

    public static void main(String[] args) {

        // TC #2: Radiobutton handling
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        // Locate name = 'sports' radio buttons and store them in a list of Web Element
        clickAndVerifyRadioButton(driver,"sport","hockey");

        clickAndVerifyRadioButton(driver,"sport","football");

        clickAndVerifyRadioButton(driver,"color", "yellow");

    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> sportRadioButtons = driver.findElements(By.name(nameAttribute));
        for (WebElement each : sportRadioButtons) {//shortcut iter
            String eachId = each.getAttribute("id");
            //System.out.println("eachId = " + eachId);

            if (eachId.equals(idValue)) {
                each.click();
                System.out.println(eachId + " is selected : " + each.isSelected());
                break;
            }
        }
    }
}
/*


XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #3: Utility method task for (continuation of Task2)
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.

USE XPATH LOCATOR FOR ALL WEB ELEMENT LOCATORS

Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)

Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true


 */