package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.SetupPage;

public class RunLogin extends BaseClass {
	@Test
	public void runLoginTestCase() {
		/*LoginPage lp = new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		
		SetupPage sp=new SetupPage();
		sp.verifySetUpPage();*/
		LoginPage lp = new LoginPage();
		lp.enterUsername().enterPassword().clickLogin().verifySetUpPage();
		
	}

}
