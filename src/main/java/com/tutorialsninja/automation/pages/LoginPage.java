package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public LoginPage () {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(css="#input-email")
	public static WebElement emailField;
	
	@FindBy(css="#input-password")
	public static WebElement passwordField;
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement loginButton;
	
	@FindBy(css=".alert.alert-danger.alert-dismissible")
	public static WebElement loginErrorMessage;
	
	@FindBy(css="div[class='form-group'] a")
	public static WebElement forgetPasswordLink;
	
	
	
	
	
	public static void doLogin(String email,String password) {
		
		Elements.TypeText(LoginPage.emailField, email);
		Elements.TypeText(LoginPage.passwordField, password);
	    Elements.click(LoginPage.loginButton);
	}
	  public static void doLogin() {
		  Elements.TypeText(emailField, Base.reader.getUsername());
			Elements.TypeText(passwordField, Base.reader.getPassword());
			Elements.click(loginButton);
	  }

}
