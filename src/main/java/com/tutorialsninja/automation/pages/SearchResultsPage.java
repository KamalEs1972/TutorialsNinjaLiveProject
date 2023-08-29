package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class SearchResultsPage {
	
	public SearchResultsPage () {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(css="h4>a")
	public static WebElement samsungSyncMasterResult;
	
	@FindBy(xpath="//h1[normalize-space()='Search - Apple Iphone']2")
	public static WebElement noResultsMessage;
	

}
