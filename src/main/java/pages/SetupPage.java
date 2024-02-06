package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class SetupPage extends BaseClass {
	public SetupPage	verifySetUpPage(){
		String setUpPageVerification=driver.findElement(By.xpath("//span[@title='Setup']")).getText();
		if(setUpPageVerification.contains("Setup")) {
			System.out.println("SetUp Page Displayed");
		}else
		{
			System.out.println("SetUp Page  is not Displayed");
	    }
		return this;
		
		}
	public SetupPage clickWaffleIcon(){
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}	
	
	public AppLauncherPage	clickViewAll(){
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return new AppLauncherPage();
	}
  
}
