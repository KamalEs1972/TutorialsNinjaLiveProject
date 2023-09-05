package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {
	
	
	public HeadersSection () {
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement myAccountLink;
	
	@FindBy(xpath="//a[text()=\"Register\"]")
	public static WebElement registerLink;
	
	@FindBy(xpath="//a[text()=\"Login\"]")
	public static WebElement loginLink;
	
	@FindBy(name="search")
	public static WebElement searchField;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement searchButton;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement viewShoppingCart;
	
	
	
	public static void navigateToLoginPage() {
		
		Elements.click(myAccountLink);
		Elements.click(loginLink);
		//Elements.TypeText(LoginPage.., null);
	}
	public static void searchProduct() {
		Elements.TypeText(HeadersSection.searchField, Base.reader.getProduct());
		Elements.click(HeadersSection.searchButton);
	}
	
	public static void navigateToShoppingCart() {
		
		Elements.click(viewShoppingCart);
	}

}
