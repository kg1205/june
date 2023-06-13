package com.lumacart.Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver d) {
		driver = d;
	}

	By mail = By.id("email");
	By passes = By.id("pass");
	By clicks = By.name("send");

	public void email(String name) {
		driver.findElement(mail).sendKeys(name);

	}

	public void password(String name) {
		driver.findElement(passes).sendKeys(name);
	}

	public void click() {
		driver.findElement(clicks).click();
	}
}
