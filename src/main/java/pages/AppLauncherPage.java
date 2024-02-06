package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class AppLauncherPage extends BaseClass {
	public AppLauncherPage scrollElementToPartyConsent() {
	//scroll to party consent
			WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
			driver.executeScript("arguments[0].scrollIntoView();", scroll);
			return this;
			
	}
	public ServicePage Clickindividuals() {
			//scroll and click individuals 
			WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
			driver.executeScript("arguments[0].click();", individual);
			return new ServicePage();
}
	}
