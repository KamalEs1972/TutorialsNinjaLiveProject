package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultsPage {
	
	public SearchResultsPage () {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(css="h4>a")
	public static WebElement samsungSyncMasterResult;
	
	@FindBy(xpath="//button[@id='button-cart']")
	public static WebElement addToCart2;
	
	@FindBy(xpath="//h1[normalize-space()='Search - Apple Iphone']2")
	public static WebElement noResultsMessage;
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")
	public static WebElement firstAddToCartOption;
	
	@FindBy(css="#cart-total")
	public static WebElement cartTotal;
	
	public static void addFirstProductToCart() {
		Elements.click(firstAddToCartOption);
		Elements.click(addToCart2);
	}

}
