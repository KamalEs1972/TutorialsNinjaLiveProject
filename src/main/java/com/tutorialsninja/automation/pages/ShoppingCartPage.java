package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class ShoppingCartPage {
	
	
	@FindBy(linkText="Checkout")
	public static WebElement checkoutButton;
	
	@FindBy(xpath="//input[@id='button-payment-address']")
	public static WebElement continueButton;
	
	@FindBy(xpath="//*[@id=\"button-shipping-address\"]")
	public static WebElement continueButton2;
	
	@FindBy(xpath="	//input[@id='button-shipping-method']")
	public static WebElement continueButton3;
	
	@FindBy(xpath="//input[@name='agree']")
	public static WebElement checkBox;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	public static WebElement continueButton4;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	public static WebElement confirmOrderButton;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	public static WebElement orderPlacedMessage;
	
	
	
	

	
	
	
	public ShoppingCartPage () {
		PageFactory.initElements(Base.driver, this);
	}
	
	public static void checkoutProcess() {
		Elements.click(checkoutButton);
		Elements.click(continueButton);
		Elements.click(continueButton2);
		Elements.click(continueButton3);
		Elements.click(checkBox);
		
	}
	


}
