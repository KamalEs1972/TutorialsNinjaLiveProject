package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;




public class Login {
	
	HeadersSection headersSection =new HeadersSection();
	LoginPage loginPage = new LoginPage();
	RegisterPage registerPage = new RegisterPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	ForgotPasswordPage forgetPasswordPage = new ForgotPasswordPage();
	
	
	
	@And("^I navigate to Account Login page$")
	public void i_navigate_to_Account_Login_page()   {
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.loginLink);
	  
	}

	@When("^I login to the application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_the_application_using_Username_and_Password(String email,String password)  {
		
		LoginPage.doLogin(email, password);
	}

	@Then("^I should see that the User is able to successfully login$")
	public void i_should_see_that_the_User_is_able_to_successfully_login() {
		
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registerAffiliateAccount));
	    
	}
	@Then("^I should see that the User is unable to successfully login$")
	public void i_should_see_that_the_User_is_unable_to_successfully_login() {
		Assert.assertTrue(Elements.isDisplayed(LoginPage.loginErrorMessage));
		//Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.loginErrorMessage,"Warning: No match for E-Mail Address and/or Password."));
	}
	@When("^I click on LoginButton$")
	public void i_click_on_LoginButton()  {
		Elements.click(LoginPage.loginButton);
	    
	}
	
	@When("^I reset Forgotten Password for email  \"([^\"]*)\"$")
	public void i_reset_Forgotten_Password_for_email(String email)  {
		Elements.click(LoginPage.forgetPasswordLink);
		Elements.TypeText(ForgotPasswordPage.emailField2,email);
		Elements.click(ForgotPasswordPage.continueButton);
	    
	  
	}

	@Then("^I should see a message that user getting an email to reset password$")
	public void i_should_see_a_message_that_user_getting_an_email_to_reset_password()  {
		
		Assert.assertTrue(Elements.isDisplayed(ForgotPasswordPage.confirmationMessage));
	}

}
