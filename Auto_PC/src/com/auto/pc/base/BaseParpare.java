package com.auto.pc.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.auto.pc.uitls.SeleniumUtil;


public class BaseParpare {

//	protected SeleniumUtil seleniumUtil = null;
	SeleniumUtil seleniumUtil = new SeleniumUtil();
	public WebDriver startTest(WebDriver driver, int browserId, String webUrl, int timeOut){
		SeleniumUtil seleniumUtil = new SeleniumUtil();
		try {
			driver = seleniumUtil.launchBrowser(driver, browserId, webUrl, timeOut);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("浏览器不能正常工作，请检查是不是手动关闭或者其他原因");
		}
		return driver;
	}
	//close the Browser.
	public void CloseBrowser(WebDriver driver){
		seleniumUtil.closeBrowser(driver);
	}
	//check isElementExsit 
	public boolean isElementExsit(WebDriver driver, String name, By by) {
		boolean flag = seleniumUtil.isElementExsit(driver, name, by);
		return flag;
	}
}
