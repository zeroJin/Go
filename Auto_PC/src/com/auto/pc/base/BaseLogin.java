package com.auto.pc.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.auto.pc.pages.Login;

public class BaseLogin {
	protected WebDriver driver;
	protected final String url = "http://test.pc.motif.me";
	BaseParpare bp = new BaseParpare();
	@BeforeTest
	public void login() throws InterruptedException{
		/**
		 * 1：火狐
		 * 2：谷歌
		 * 3：IE
		 * */
		try {
			driver = bp.startTest(driver, 1, url, 1000);
			Login login = new Login(driver);
//			login.Login(driver);
			login.Keyword_signin.click();
			login.Keyword_username.clear();
			login.Keyword_username.sendKeys("jinzhenguo@evermarker.net");
			login.Keyword_password.clear();
			login.Keyword_password.sendKeys("123456");
			login.keyword_login.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("browers open's error!!");
		}
	}
	@AfterMethod
	public void testClose(){
		bp.CloseBrowser(driver);
	}
}
