package com.auto.pc.pages.shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailShop {

	//get shop title
	@FindBy(className="product-title")
	@CacheLookup
	public WebElement shop_title;
	public By shopTitle = By.className("product-title");
	
	public DetailShop(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
