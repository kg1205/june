package com.lumacart.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lumacart.Pageobjects.LoginPage;

public class Tc_001_login extends BaseClass {

	@Test
	public void logintest() {
		
		driver.get(baseurl);
		logg.info("url has opened");
		// driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.email(usename);
		logg.info("username entered");
		lp.password(pass);
		logg.info("password entered");
		lp.click();
		logg.info("clicked on submit");

		/*
		 * String as = driver.findElement(By.xpath("//a[@class='logo']")).getText();
		 * String ss = driver.getTitle();
		 * 
		 * Assert.assertEquals(as, ss);
		 */
		
		
	}
}
