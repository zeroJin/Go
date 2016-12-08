package com.auto.pc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(linkText="SIGN IN")
	@CacheLookup
	public WebElement Keyword_signin;
	@FindBy(name="email")
	@CacheLookup
	public WebElement Keyword_username;
	@FindBy(name="pw")
	@CacheLookup
	public WebElement Keyword_password;
	@FindBy(className="btn-primary")
	public WebElement keyword_login;
	@FindBy(xpath="html/body/header/div/nav[2]/ul/li[1]/a")
	public WebElement username_title;
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
}
