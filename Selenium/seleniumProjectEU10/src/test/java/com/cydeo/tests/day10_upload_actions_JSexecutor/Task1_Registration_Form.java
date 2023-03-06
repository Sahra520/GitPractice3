package com.cydeo.tests.day10_upload_actions_JSexecutor;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Locale;

public class Task1_Registration_Form {

/*            Note:
          1. Use new Driver utility class and method
          2. User JavaFaker when possible
          3. User ConfigurationReader when it makes sense
*/
    @Test
    public void registration_form_test(){
        //    TC#1: Registration form confirmation
//    Note: Use JavaFaker OR read from configuration.properties file when possible.
//            1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
      //  Driver.getDriver()-->driver.get(url)
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //Create JavaFaker Object
        Faker faker = new Faker(new Locale("en"));

//3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

//4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

//5. Enter username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUsername.sendKeys(faker.bothify("?????###").replaceAll(".",""));
        String user = faker.bothify("helpdesk###");
        inputUsername.sendKeys(user);

//6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@gmail.com");

//7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));
       // System.out.println("faker.internet().password() = " + faker.internet().password());//h65r0c8o7s

//8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("###-###-####"));

//9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

//10. Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(1,12); faker.number().numberBetween(1,31); faker.number().numberBetween(2003,1980);
        inputBirthday.sendKeys("10/18/1997");

//11. Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")) );
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

//12. Select Job Title
        Select jobTitleDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")) );
        jobTitleDropdown.selectByIndex(faker.number().numberBetween(1,4));

//13. Select programming language from checkboxes
        WebElement inputJava = Driver.getDriver().findElement(By.xpath("//div/input[@id='inlineCheckbox2']"));
        inputJava.click();

//14. Click to sign up button
        WebElement inputSignUpButton = Driver.getDriver().findElement(By.xpath("//button[.='Sign up']"));
        inputSignUpButton.click();

//15. Verify success message “You’ve successfully completed registration.” is displayed.
        WebElement alertMessage = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));
        System.out.println("alertMessage.isDisplayed() = " + alertMessage.isDisplayed());
    }

}
