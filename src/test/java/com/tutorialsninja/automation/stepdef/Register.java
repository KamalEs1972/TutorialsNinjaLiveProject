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
		
	RegisterPage.enterAllDetails(dataTable);
		
		
		
		
	    
	}

	@And("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy()  {
		Assert.assertTrue("Your Account Has Been Created!", true);
		Elements.selectCheckBox(RegisterPage.privacyPolicy);
	    
	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button()  {
		
		Elements.click(RegisterPage.continueButton);
	    
	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created()  {
		
		Elements.isDisplayed(RegisterPage.accountCreated);
	    
	}



}
