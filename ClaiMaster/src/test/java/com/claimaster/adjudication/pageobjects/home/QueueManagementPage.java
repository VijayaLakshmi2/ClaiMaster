package com.claimaster.adjudication.pageobjects.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QueueManagementPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public QueueManagementPage(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}
	
	@SuppressWarnings("static-access")
	By ffsProfessional=By.className("text_beside_icon").id("FFS Professional");
	@SuppressWarnings("static-access")
	By capProfessional=By.className("text_beside_icon").id("CAP Professional");
	@SuppressWarnings("static-access")
	By ffsInstitutional=By.className("text_beside_icon").id("FFS Institutional");
	@SuppressWarnings("static-access")
	By capInstitutional=By.className("text_beside_icon").id("CAP Institutional");
	@SuppressWarnings("static-access")
	By dental=By.className("text_beside_icon").id("Dental");
	
	public WebDriver clickOnFFSProfessional(){
		wait=new WebDriverWait(driver,240);
		wait.until(ExpectedConditions.elementToBeClickable(ffsProfessional)).click();
		
		return driver;
	}

	public WebDriver clickOnCapProfessional(){
		wait=new WebDriverWait(driver,240);
		wait.until(ExpectedConditions.elementToBeClickable(capProfessional)).click();
		return driver;
	}
	
	public WebDriver clickOnFFSInstitutional() throws Exception{
		wait=new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.elementToBeClickable(ffsInstitutional)).click();
		FFSInstitutionalQueuePage queue=new FFSInstitutionalQueuePage(driver);
		queue.navigatedToFFSInst();
		return driver;
	}
	
	public WebDriver clickOnCapInstitutional(){
		wait=new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.elementToBeClickable(capInstitutional)).click();
		return driver;
	}
	
	public WebDriver clickOnDental(){
		wait=new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.elementToBeClickable(dental)).click();
		return driver;
	}

}

