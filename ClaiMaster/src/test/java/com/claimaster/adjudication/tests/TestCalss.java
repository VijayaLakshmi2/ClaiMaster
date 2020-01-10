package com.claimaster.adjudication.tests;

import org.testng.annotations.Test;

import com.claimaster.adjudication.baseTest.BaseTest;
import com.claimaster.adjudication.home.HomePage;

public class TestCalss extends BaseTest {
	@Test
	public void transactionFailsForIncorrectPaymentInfo() {
		// PropertyConfigurator.configure("Log4j.properties");
		// ActivityLogger.intializeLogger("transactionFailsForIncorrectPaymentInfo");
		HomePage homePage = new HomePage(driver);
		homePage.open();

	}
}
