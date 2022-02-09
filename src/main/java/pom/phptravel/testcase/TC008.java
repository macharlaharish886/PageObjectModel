package pom.phptravel.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravel.page.PhpTravel;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC008";
		testcaseDescription="To fill a php travels application";
		author="Harish";
		category="PHP";
		browser="chrome";
		appName="phptravels";
	
	}
	
	@Test
	public void phpTravels() {
		
		new PhpTravel(driver,test)
		.enterFname("Harzds")
		.enterLname("Maktux")
		.enterEmail("Harzds@gmail.com")
		.enterPhone("897689761")
		.enterCname("Harzds tec")
		.enterAdress("120 Temple Street")
		.enterAdres("1st Line")
		.enterCity("Guntur")
		.enterState("Andhra Pradesh")
		.enterPostalc("522503")
		.enterCountry("India")
		.enterMobile("9877272727")
		.enterPwdx("Dw!234")
		.enterPwdy("Dw!234")
		.clickRegister()
		;
	}

}
