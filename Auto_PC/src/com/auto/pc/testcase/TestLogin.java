package com.auto.pc.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.auto.pc.base.BaseParpare;
import com.auto.pc.pages.Login;

public class TestLogin {
	WebDriver driver;
	private final String url = "http://192.168.0.235:81/";
	@Test
	public void login() throws InterruptedException{
		/**
		 * 1：火狐
		 * 2：谷歌
		 * 3：IE
		 * */
		BaseParpare bp = new BaseParpare();
		driver = bp.startTest(driver, 1, url, 1000);
		Login login = new Login(driver);
		Thread.sleep(3000);
//		login.Login(driver);
		login.Keyword_signin.click();
		login.Keyword_username.clear();
		login.Keyword_username.sendKeys("jinzhenguo@evermarker.net");
		login.Keyword_password.clear();
		login.Keyword_password.sendKeys("123456");
		Thread.sleep(3000);
		login.keyword_login.click();
		Thread.sleep(3000);
//		System.out.println("界面内容：" + login.username_title.getText());
		Assert.assertEquals("靳振国", login.username_title.getText()); 
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		bp.CloseBrowser(driver);
	}
	
}
