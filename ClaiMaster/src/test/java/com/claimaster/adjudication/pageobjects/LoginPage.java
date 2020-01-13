package com.claimaster.adjudication.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	
	private final String siteUrl = "https://uatint-adjudication-kalos.mirrahealthcare.com/";
	private final String expectedUrl = "https://uatint-adjudication-kalos.mirrahealthcare.com/";
	private final String expectedTitle = "MIRRA - LOGIN";
	
	private final String loginPageError = "Login page is not displayed";
	
	By username=By.id("userId");
	By password=By.id("Password");
	By loginButton=By.id("btnSubmit");
	
	WebDriver driver;
	WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage open() throws Exception {
		driver.get(siteUrl);

		if (!driver.getCurrentUrl().contains((expectedUrl)) || !driver.getTitle().contains((expectedTitle))) {
			throw new Exception(loginPageError);
		}
		
		return this;
	}

	public WebDriver Logintoapplication(String Username, String Password) {
		wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(username)).click();
		driver.findElement(username).sendKeys(Username);
		wait.until(ExpectedConditions.elementToBeClickable(password)).click();
		driver.findElement(password).sendKeys(Password);
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
		
		return driver;
	}
}
