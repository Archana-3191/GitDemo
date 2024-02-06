package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class NewIndividualsPage extends BaseClass {

	public NewIndividualsPage EnterLastName() {
	//enterlast name
	driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys("Kumars");
	return this;
	}
	public ServicePage clickSaveButton() {
	driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	return new ServicePage();
	}
}
