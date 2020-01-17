package com.claimaster.adjudication.pageobjects.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FFSInstitutionalQueuePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By ffsInstTab=By.xpath("//*[@id='ffsinstitutional']/b");
	
	public FFSInstitutionalQueuePage(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}
	
	public void navigatedToFFSInst() throws Exception{
		wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ffsInstTab));
		//System.out.println(driver.findElement(ffsTab).getText());
		if(!driver.findElement(ffsInstTab).getText().equalsIgnoreCase("FFS Institutional"))
			throw new Exception("FFS Institutional Queue is not loaded");
		
	}

}
