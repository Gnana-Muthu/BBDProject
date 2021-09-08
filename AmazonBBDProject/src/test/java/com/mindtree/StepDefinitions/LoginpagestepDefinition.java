package com.mindtree.StepDefinitions;

import org.openqa.selenium.WebDriver;


import com.mindtree.Pageobjects.Loginpage;
import com.mindtree.Reusable.Reusablecomponents;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginpagestepDefinition extends Reusablecomponents {
	
WebDriver driver;

@Given("^Initialize the Browser$")
public void initialize_the_Browser() throws Throwable {
	driver=setup();
    
}

@Given("^Navigate to website$")
public void navigate_to_website() throws Throwable {
	driver.get(baseURL);;
}

@Then("^Click login button$")
public void click_login_button() throws Throwable {
	Loginpage lp=new Loginpage(driver);
    lp.clicksign().click();
}

@When("^User login into application with username and password$")
public void user_login_into_application_with_username_and_password() throws Throwable {
	Loginpage lp=new Loginpage(driver);
	lp.username().sendKeys(username);
	lp.continueA().click();
	lp.password().sendKeys(password);
	
        
}

@Then("^User click login button$")
public void user_click_login_button() throws Throwable {
	Loginpage lp=new Loginpage(driver);
	lp.submit().click();
    }

}
