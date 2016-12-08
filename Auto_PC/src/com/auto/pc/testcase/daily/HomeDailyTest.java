package com.auto.pc.testcase.daily;

import org.testng.annotations.Test;

import com.auto.pc.base.BaseLogin;
import com.auto.pc.pages.daily.HomeDaily;

public class HomeDailyTest extends BaseLogin {
	
	@Test
	public void homeDailyTest(){
		HomeDaily homeDaily = new HomeDaily(driver);
		//验证用户是否登录成功
		String profileName = homeDaily.Daily_name.getText();
		System.out.println("loginName====== " + profileName);
		if(profileName == null || profileName.equalsIgnoreCase("")){
			System.out.println("没有拿到登录用户信息，用户登录不成功!!");
		}
//		Assert.assertNotNull(profileName);
		//验证daily标签
		String daily = homeDaily.Daily_daily.getText();
		System.out.println("daily====== " + daily);
		if("DAILY".equals(daily)){
			System.out.println("daily页签验证通过!!");
		}
//		Assert.assertEquals("DAILY", daily);
		//验证designer标签
		String designers = homeDaily.Daily_designers.getText();
		if("DESIGNERS".equals(designers)){
			System.out.println("designer页签验证通过!!");
		}
		//验证SHOP标签
		String shop = homeDaily.Daily_shop.getText();
		if("SHOP".equals(shop)){
			System.out.println("shop页签验证通过!!");
		}
		//点击banner，进入banner详情
		homeDaily.Daily_banner.click();
		System.out.println("进入banner详情界面!!");
	}
}
