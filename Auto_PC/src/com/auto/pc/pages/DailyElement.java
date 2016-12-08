package com.auto.pc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DailyElement {

//	private WebDriver driver;
	public DailyElement(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//获取Daily管理元素
	@FindBy(partialLinkText="Daily管理")
	@CacheLookup
	public WebElement Keyword_daily;
	//获取Daily内容管理元素
	@FindBy(linkText="Daily内容管理")
	@CacheLookup
	public WebElement Keyword_daily_detail;
	//获取创建Daily内容按钮
	@FindBy(linkText="创建Daily内容")
	@CacheLookup
	public WebElement Keyword_add;
	//获取运营标题
	@FindBy(id="searchName")
	@CacheLookup
	public WebElement searchName;
	//获取上传图片按钮
	@FindBy(id="feed_imgPath_id")
	@CacheLookup
	public WebElement feed_imgPath_id;
	//获取跳转界面
	@FindBy(id="feed_skip_type")
	@CacheLookup
	public WebElement feed_skip_type;
	//获取跳转界面跳转的ID
	@FindBy(id="feed_skip_id")
	@CacheLookup
	public WebElement feed_skip_id;
	//获取开始时间
	@FindBy(id="d11")
	@CacheLookup
	public WebElement dll;
	//获取结束时间，时间不限
	@FindBy(name="select_etime")
	@CacheLookup
	public WebElement select_etime;
	//获取排序值
	@FindBy(id="sortNo")
	@CacheLookup
	public WebElement sortNo;
}
