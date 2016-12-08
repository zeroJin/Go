package com.auto.pc.pages.daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDaily {

	//get Daily label
	@FindBy(linkText="DAILY")
	@CacheLookup
	public WebElement Daily_daily;
	//get Designers label
	@FindBy(linkText="DESIGNERS")
	@CacheLookup
	public WebElement Daily_designers;
	//get Shop label
	@FindBy(linkText="SHOP")
	@CacheLookup
	public WebElement Daily_shop;
	//get profile name
	@FindBy(xpath="html/body/header/div/nav[2]/ul/li[1]/a")
//	@CacheLookup
	public WebElement Daily_name;
	//get daily banner in home page
	@FindBy(xpath=".//ul[@id='daily-wookmark']/li[1]/div/a/img")
	@CacheLookup
	public WebElement Daily_banner;
	
	public HomeDaily(WebDriver driver){
		PageFactory.initElements(driver, this);
	} 
}
