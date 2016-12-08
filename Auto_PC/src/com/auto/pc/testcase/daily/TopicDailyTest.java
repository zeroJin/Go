package com.auto.pc.testcase.daily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.auto.pc.base.BaseLogin;
import com.auto.pc.base.BaseParpare;
import com.auto.pc.pages.daily.TopicDaily;
import com.auto.pc.pages.designer.DetailDesigner;
import com.auto.pc.pages.shop.DetailShop;

public class TopicDailyTest extends BaseLogin {

	@Test
	public void topicDailyTest() {
		BaseParpare bp = new BaseParpare();
		TopicDaily topicDaily = new TopicDaily(driver);
		DetailShop detailShop = new DetailShop(driver);
		DetailDesigner detailDesigner = new DetailDesigner(driver);
		//go topic page
		driver.navigate().to(url + "/topic/100");
		//check topic title
		boolean flag_title = bp.isElementExsit(driver, "Topic_title", topicDaily.xpath_title);
		if(flag_title){
			//get title detail.
			String title = driver.findElement(topicDaily.xpath_title).getText();
			System.out.println("=======" + title);
			driver.findElement(topicDaily.xpath_title).isDisplayed();
		}
		//check topic detail
		boolean flag_detail = bp.isElementExsit(driver, "Topic_detail", topicDaily.xpath_details);
		if(flag_detail){
			//get detail
			String detail = driver.findElement(topicDaily.xpath_details).getText();
			System.out.println("=========" + detail);
		}
		//check topic picture
		boolean flag_pictrue = bp.isElementExsit(driver, "Topic_picture", topicDaily.xpath_picture);
		if(flag_pictrue){
			System.out.println("获取到图片信息!!");
		}
		//check shopping
		boolean flag_shop = bp.isElementExsit(driver, "Topic_shop", topicDaily.className_shop);
		if(flag_shop){
			List<WebElement> shop = driver.findElements(topicDaily.className_shop);
//			for(int i = 0; i <= shop.size(); i ++){
				//获取列表中第一个商品，并点击。
				shop.get(0).findElement(By.cssSelector("div>a>img")).click();
//			}
		}
		//验证商品详情界面是否打开
		boolean flag_shop_title = bp.isElementExsit(driver, "shop_title", detailShop.shopTitle);
		if(flag_shop_title){
			String shopTitle = detailShop.shop_title.getText();
			System.out.println("shopTitle: " + shopTitle);
		}
		//验证设计师详情界面是否打开
		boolean flag_designer_name = bp.isElementExsit(driver, "designer_name", detailDesigner.designerName);
		if(flag_designer_name){
			String designerName = detailDesigner.designer_name.findElement(By.cssSelector("div")).getText();
			System.out.println("designerName: " + designerName);
		}
	}
}
