package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

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

}
