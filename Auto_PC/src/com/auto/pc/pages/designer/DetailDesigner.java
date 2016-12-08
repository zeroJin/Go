package com.auto.pc.pages.designer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailDesigner {

	//get designer names
	@FindBy(className="flex-fullJustified")
	@CacheLookup
	public WebElement designer_name;
	public By designerName = By.className("flex-fullJustified");
	
	public DetailDesigner(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
