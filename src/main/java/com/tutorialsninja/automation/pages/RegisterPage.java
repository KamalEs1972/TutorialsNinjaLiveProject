package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	public RegisterPage () {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	public static WebElement  firstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	public static WebElement  lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	public static WebElement  email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	public static WebElement  telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	public static WebElement  password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	public static WebElement  passwordConfirm;
	
	@FindBy(xpath="//input[@name='agree']")
	public static WebElement  privacyPolicy;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public static WebElement  continueButton;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	public static WebElement  accountCreated;
	
	@FindBy(xpath="//*[@id=\"account-register\"]/ul/li[3]/a")
	public static WebElement  registerButton;
	
	@FindBy(css="input[id=input-firstname]+div")
	public static WebElement  firstNameWarning;
	
	@FindBy(css="[value='1'][name='newsletter']")
	public static WebElement  yesToSubscribeRadioButton;
	
	@FindBy(css=".alert.alert-danger.alert-dismissible")
	public static WebElement  mainWarning;
	
	
	public static void enterAllDetails(DataTable dataTable , String detailsType) {
		
		Map<String,String> map=	dataTable.asMap(String.class, String.class);
		
		Elements.TypeText(RegisterPage.firstName, map.get("FirstName"));
		
		Elements.TypeText(RegisterPage.lastName, map.get("Lastname"));
		
	//	Elements.TypeText(RegisterPage.email, map.get("Email"));
		
		Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
		
	//	Elements.TypeText(RegisterPage.password,System.currentTimeMillis()+ map.get("Password"));
		Elements.TypeText(RegisterPage.password,map.get("Password"));
		Elements.TypeText(RegisterPage.passwordConfirm, map.get("Password"));
		if (detailsType.equalsIgnoreCase("duplicate"))
			
			Elements.TypeText(RegisterPage.email, map.get("Email"));
		else 
			Elements.TypeText(RegisterPage.email,System.currentTimeMillis()+ map.get("Email"));
		
		
		
	}
	

		
		
		
		
	}
	
	
	


