package com.auto.pc.uitls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumUtil {

	public WebDriver driver = null;
//	public WebDriver driver = null;
	/**
	 * Select the browser.
	 * */
	public WebDriver selectExplorerByName(int browserId){
		switch (browserId) {
		case 1:
			driver = new FirefoxDriver();
			break;
		case 2:
			driver = new ChromeDriver();
			break;
		case 3:
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("传入的浏览器代码错误！！请确认:1为火狐，2为谷歌，3为IE");
			break;
		}
		return driver;
	}
	/**
	 * Open the test interface.
	 * */
	public WebDriver launchBrowser(WebDriver driver, int browserId, String webUrl, int timeOut){
		driver = selectExplorerByName(browserId);
		try {
			maxWindows(driver, browserId);
			waitForPageLoading(driver, timeOut);
			get(driver, webUrl);
		} catch (Exception e) {
			refresh(driver);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String status = (String)js.executeScript("retrun document.readyState");
			System.out.println("打印状态" + status);
		}
		return driver;
	}
	/**
	 * 最大化浏览器
	 * */
	public void maxWindows(WebDriver driver, int browserId){
		String browser = null;
		switch (browserId) {
		case 1:
			browser = "Firefox";
			break;
		case 2:
			browser = "Chrome";
			break;
		case 3:
			browser = "InternetExplorer";	
			break;
		default:
			System.out.println("你选择的浏览器错误，请重新选择！！！");
			break;
		}
		System.out.println("最大化浏览器： " + browser);
		driver.manage().window().maximize();
	}
	/**
	 * pageLoadTimeout。页面加载时的超时时间。因为webdriver会等页面加载完毕在进行后面的操作，
	 * 所以如果页面在这个超时时间内没有加载完成，那么webdriver就会抛出异常
	 * */
	public void waitForPageLoading(WebDriver driver, int pageLoadTime){
		driver.manage().timeouts().pageLoadTimeout(pageLoadTime, TimeUnit.SECONDS);
	}
	/**
	 * 打开URL
	 * */
	public void get(WebDriver driver, String URL){
		driver.get(URL);
		System.out.println("打开测试界面：" + URL);
	}
	/**
	 * 刷新浏览器
	 * */
	public void refresh(WebDriver driver){
		driver.navigate().refresh();
		System.out.println("界面被刷新！");
	}
	/**
	 * 退出浏览器
	 * */
	public void closeBrowser(WebDriver driver){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		System.out.println("关闭浏览器!!");
	}
	/**
	 * 切换浏览器窗口
	 * */
	
	
	/**
	 * 判断元素是否存在
	 * */
	public boolean isElementExsit(WebDriver driver, String name, By by) {
		boolean flag = false;
		try {
			driver.findElement(by);
			flag = true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println(name + ": Element is not exsit!!");
		}
		return flag;
	}
	
	/**
	 * sleep 
	 * */ 
	public void zeroSleep(int i){
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
