package com.claimaster.adjudication.pageobjects.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FFSProfessionalQueuePage {

	WebDriver driver;
	WebDriverWait wait;
	
	By ffsProfTab=By.xpath("//*[@id='ffsprofessional']/b");
	
	public FFSProfessionalQueuePage(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}
	
	public void navigatedToFFSInst() throws Exception{
		wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ffsProfTab));
		//System.out.println(driver.findElement(ffsTab).getText());
		if(!driver.findElement(ffsProfTab).getText().equalsIgnoreCase("FFS Professional"))
			throw new Exception("FFS Professional Queue is not loaded");
		
	}
}
