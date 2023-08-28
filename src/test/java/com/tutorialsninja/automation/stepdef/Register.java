package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class Register {
	
	HeadersSection headersSection = new HeadersSection();
	RegisterPage   registerPage = new RegisterPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	   
	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page()  {
	   
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.registerLink);
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) {
		
	RegisterPage.enterAllDetails(dataTable, "unique");
		
		
		
		
	    
	}

	@And("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy()  {
		
		Elements.selectCheckBox(RegisterPage.privacyPolicy);
	    
	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button()  {
		
		Elements.click(RegisterPage.continueButton);
	    
	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created()  {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.accountCreated));
		//Assert.assertTrue("Your Account Has Been Created!", true);
	    
	}
	
	@Then("^I should see that the User Account has not created$")
	public void i_should_see_that_the_User_Account_has_not_created()  {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerButton));
	    
	}

	@Then("^I should see the errors message informing the user to fill the mandotery fields$")
	public void i_should_see_the_errors_message_informing_the_user_to_fill_the_mandotery_fields() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstNameWarning));
	  
	}
	
	@And("^I subscribe to newsletter$")
	public void i_subscribe_to_newsletter()  {
		
		Elements.click(RegisterPage.yesToSubscribeRadioButton);
	    
	}

	@When("^I provide the below duplicate valid details$")
	public void i_provide_the_below_duplicate_valid_details(DataTable dataTable)  {
		RegisterPage.enterAllDetails(dataTable, "duplicate");
	}

	@Then("^I should see that the User is restricted from  creating a duplicate account$")
	public void i_should_see_that_the_User_is_restricted_from_creating_a_duplicate_account() {
	    Assert.assertTrue(Elements.VerifyTextEquals(registerPage.mainWarning,"Warning: E-Mail Address is already registered!"));
	}

}
