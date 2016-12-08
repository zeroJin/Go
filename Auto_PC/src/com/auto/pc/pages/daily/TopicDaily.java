package com.auto.pc.pages.daily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopicDaily {

	//get topic title
	@FindBy(xpath=".//*[@id='gaProductClick']/div/div/div[1]/h2")
	@CacheLookup
	public WebElement topic_title;
	public By xpath_title = By.xpath(".//*[@id='gaProductClick']/div/div/div[1]/h2");
	//get topic details
	@FindBy(xpath=".//*[@id='gaProductClick']/div/div/div[2]/p")
	@CacheLookup
	public WebElement topic_details;
	public By xpath_details = By.xpath(".//*[@id='gaProductClick']/div/div/div[2]/p");
	//get picture
	@FindBy(xpath=".//*[@id='gaProductClick']/div/div/a[1]/img")
	@CacheLookup
	public WebElement topic_picture;
	public By xpath_picture = By.xpath(".//*[@id='gaProductClick']/div/div/a[1]/img");
	//get shopping
	@FindBy(className="productList-item")
	@CacheLookup
	public List<WebElement> topic_shopping;
	//获取topic中的商品唯一class标签“productList-item”
	public By className_shop = By.className("productList-item");
	
	public TopicDaily(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
