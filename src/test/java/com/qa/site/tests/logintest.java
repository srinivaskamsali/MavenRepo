package com.qa.site.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logintest {
	
	private WebDriver driver;
	private By user=By.xpath("//input[@id='username']");
	private By pass=By.xpath("//input[@id='password']");
	private By lgbtn=By.xpath("//i[@class='fa fa-2x fa-sign-in']");
	
	
	public logintest (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String validateTitle()
	{
		String title=driver.getTitle();
		System.out.println("title is" + title);
		return title;
	}
	
	public String getcurrenturl()
	{
		String url=driver.getCurrentUrl();
		System.out.println("url is" + url);
		return url;
	}
	
	public Boolean logibutexists()
	{
		Boolean logexist=driver.findElement(lgbtn).isDisplayed();
		return logexist;
	}
}
