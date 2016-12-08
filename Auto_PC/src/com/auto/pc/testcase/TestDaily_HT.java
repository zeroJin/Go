package com.auto.pc.testcase;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.auto.pc.base.BaseLogin;
import com.auto.pc.pages.DailyElement;

/**
 * @author Zero J
 *
 */
public class TestDaily_HT extends BaseLogin {
	
	@Test
	public void testDaily() {
		DailyElement daily = new DailyElement(driver);
		daily.Keyword_daily.click();
		daily.Keyword_daily_detail.click();
	}
	@Test(dependsOnMethods = {"testDaily"})
	public void addBanner() throws InterruptedException {
		DailyElement daily = new DailyElement(driver);
		driver.navigate().to("http://192.168.0.233:8089/feed/addreq");//因为元素在其他界面，暂时还没有想到把driver传过去。
		Thread.sleep(3000);
		daily.searchName.sendKeys("运营标题");
		daily.feed_imgPath_id.click();	//点击上传图片按钮
		openExe();	//上传图片
		Select select = new Select(daily.feed_skip_type);
		select.selectByVisibleText("专题");
		daily.feed_skip_id.sendKeys("88");
		
		System.out.println("-----------依赖测试！-------------");
		
//		DailyElement daily = new DailyElement(driver);
//		driver.findElement(By.linkText("Daily管理"));
//		daily.Keyword_daily.click();
	}
	
//	@Test	
	public void addTuWen(){
		
	}
	
	//调用外部的exe文件
	public static void openExe() {
		Runtime rn = Runtime.getRuntime();
		try {
			String str = "C:\\D\\workspace\\evermarker\\resources\\upload.exe";
			Process p = rn.exec(str);
		} catch (Exception e) {
			System.out.println("Error exec!");
			e.printStackTrace();
		}
		}
}
