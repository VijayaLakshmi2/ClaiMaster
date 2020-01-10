package com.claimaster.adjudication.home;

import org.openqa.selenium.WebDriver;

import com.claimaster.loader.*;

import com.claimaster.adjudication.page.Page;

public class HomePage extends Page {
	private final String siteUrl = "https://uatint-adjudication-kalos.mirrahealthcare.com/";

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		HtmlElementLoader.populatePageObject(this, driver);
	}

	public HomePage open() {
		getDriver().get(siteUrl);
		/*
		 * TestListener.reportLog("Application opened  "+siteUrl); if
		 * (!urlContains(expectedUrl) || !titleContains(expectedTitle)) {
		 * TestListener.reportLog(homePageError); throw new
		 * HtmlElementsException(homePageError); }
		 */
		return this;
	}

}
