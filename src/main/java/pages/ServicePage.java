package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class ServicePage extends BaseClass {
		
public ServicePage	clickDownArrow(){
	
	//click down arrow
			driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
			return this;}

			//click New Individual
public NewIndividualsPage	clickNewIndividuals(){
			WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
			driver.executeScript("arguments[0].click();", clk);
			
				return new NewIndividualsPage();
				
				
				}
	
	
}
