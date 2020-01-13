package com.claimaster.adjudication.tests;

import org.testng.annotations.Test;

import com.claimaster.adjudication.pageobjects.LoginPage;

public class Login extends BaseTest {
	
	@Test
	public void loginIntoApplication() throws Exception{
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.open();
		driver=loginPage.Logintoapplication("g_vijayalakshmi@ahcpllc.com", "Password@123");
	}

}
