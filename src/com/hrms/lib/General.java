package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
	WebDriver driver;
	
	public  void startup() 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Driver\\geckodriver-v0.31.0-win64\\firefoxdriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Log.info("Application opened");
		Reporter.log("Application Opened");
	}
	
	public void teardown()
	{
		driver.close();
		Reporter.log("application closed");
		Log.info("application closed");
	}
	
	public void login() 
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		
		driver.findElement(By.name(btn_login)).click();
		
		Reporter.log("Login completed");
		Log.info("Login completed");
		
	}
	public void logout() 
	{
		driver.findElement(By.linkText(link_logout)).click();
		
		Reporter.log("Logout completed");
		Log.info("Logout completed");
	}
	

}
