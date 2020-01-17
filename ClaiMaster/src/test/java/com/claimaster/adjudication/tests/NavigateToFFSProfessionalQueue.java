package com.claimaster.adjudication.tests;

import org.testng.annotations.Test;

import com.claimaster.adjudication.pageobjects.LoginPage;
import com.claimaster.adjudication.pageobjects.home.QueueManagementPage;

public class NavigateToFFSProfessionalQueue extends BaseTest {
	
	@Test
	public void NavigateToFFSInstitutional() throws Exception{
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.open();
		loginPage.Logintoapplication("g_vijayalakshmi@ahcpllc.com", "Password@123");
		
		QueueManagementPage queueManagementPage=new QueueManagementPage(driver);
		queueManagementPage.clickOnFFSInstitutional();
		
	}

	@Test
	public void NavigateToFFSProfessional() throws Exception{
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.open();
		loginPage.Logintoapplication("g_vijayalakshmi@ahcpllc.com", "Password@123");
		
		QueueManagementPage queueManagementPage=new QueueManagementPage(driver);
		queueManagementPage.clickOnFFSProfessional();
		
	}
	
	@Test
	public void NavigateToCAPProfessional() throws Exception{
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.open();
		loginPage.Logintoapplication("g_vijayalakshmi@ahcpllc.com", "Password@123");
		
		QueueManagementPage queueManagementPage=new QueueManagementPage(driver);
		queueManagementPage.clickOnCapProfessional();
	}
	
	
	
	@Test
	public void NavigateToCAPInstitutional() throws Exception{
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.open();
		loginPage.Logintoapplication("g_vijayalakshmi@ahcpllc.com", "Password@123");
		
		QueueManagementPage queueManagementPage=new QueueManagementPage(driver);
		queueManagementPage.clickOnCapInstitutional();
	}
	
	@Test
	public void NavigateToDental() throws Exception{
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.open();
		loginPage.Logintoapplication("g_vijayalakshmi@ahcpllc.com", "Password@123");
		
		QueueManagementPage queueManagementPage=new QueueManagementPage(driver);
		queueManagementPage.clickOnDental();
	}
}
