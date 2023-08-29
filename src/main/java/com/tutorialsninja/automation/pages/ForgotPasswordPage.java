package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class ForgotPasswordPage {
	

		
		
		public ForgotPasswordPage () {
			PageFactory.initElements(Base.driver, this);
		}
		
		
		@FindBy(css=".alert.alert-success.alert-dismissible")
		public static WebElement confirmationMessage;
		
		@FindBy(css="#input-email")
		public static WebElement emailField2;
		
		@FindBy(css="input[type='submit']")
		public static WebElement continueButton;
		
		

}
