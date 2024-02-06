package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateIndividuals extends BaseClass {
	@Test
	public void runCreateIndividualsTestCase() {
		LoginPage lp = new LoginPage();
		lp.enterUsername().enterPassword().clickLogin().verifySetUpPage().clickWaffleIcon().clickViewAll().Clickindividuals().clickDownArrow().clickNewIndividuals().EnterLastName().clickSaveButton();
		
	}

}
