package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//LoginPage lp = new LoginPage();//if the object stays in the samme page create an object for same class
		//return lp;
		return this;
	}
   public LoginPage enterPassword() {
	   driver.findElement(By.id("password")).sendKeys("Testleaf@1234");
	  return this; //this represe nt the current class object 
	}
   public SetupPage clickLogin() {
	   driver.findElement(By.id("Login")).click();
	  // SetupPage sp =new SetupPage();
	   //return sp;
	   return new SetupPage();
	  
	   
 }

 }
		/*LoginPage lp = new LoginPage();
           return lp;*/

		/*return this;*/

		//both expressions are same we can write anyone but for coding perspective need to choose less code 