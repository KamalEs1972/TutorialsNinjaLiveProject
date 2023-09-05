package com.tutorialsninja.automation.stepdef;

import javax.naming.directory.SearchResult;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;
import com.tutorialsninja.automation.pages.RegisterPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders {
	
	HeadersSection headersSection =new HeadersSection();
	LoginPage loginPage = new LoginPage();
	RegisterPage registerPage = new RegisterPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	SearchResultsPage  searchResultsPage = new SearchResultsPage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	
	
	
	@Given("^I login to the application$")
	public void i_login_to_the_application() {
		Browser.openApplicationURL();
		HeadersSection.navigateToLoginPage();
		loginPage.doLogin();
		
				
	}  

	@When("^I add any product to Bag and checkout$")
	public void i_add_any_product_to_Bag_and_checkout() {
		
		HeadersSection.searchProduct();
		SearchResultsPage.addFirstProductToCart();
		HeadersSection.navigateToShoppingCart();
		ShoppingCartPage.checkoutProcess();
						 
	}
	

	@And("^I place an order$")
	public void i_place_an_order() 
 {
		Elements.click(ShoppingCartPage.continueButton4);
		Elements.click(ShoppingCartPage.confirmOrderButton);
		
		
	}

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully()  {
		
		Assert.assertTrue(Elements.isDisplayed(ShoppingCartPage.orderPlacedMessage));
		
		
	   
	}



}
