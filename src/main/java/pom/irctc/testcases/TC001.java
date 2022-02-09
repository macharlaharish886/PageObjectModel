package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;


public class TC001 extends ProjectWrappers {
	
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC001";
		testcaseDescription="To verify the irctc sign up for new user";
		author="Harish";
		category="Registration";
		browser="chrome";
		appName="Irctc";
	
	}
	@Test
	public void irctcRegistration() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickOnRegister()
		.enterUserName("Harish123")
		.enterPassword("Hari!1234")
		.enterConfirmPassword("Hari!1234")
		.clickOnPreferedLanguage()
		.clickOnSpecificLanguage("English")
		.clickOnSeq()
		.selectSeQ("What is your pet name?")
		.enterSecAnswer("don")
		.clickContinue()
		.enterFirstName("Harish")
		.enterMiddleName("Rao")
		.enterLastName("Macharla")
		.selectOccuptn()
		.selectOccupton("PRIVATE")
		.clickDob()
		.selectYear("1990")
		.selectMonth("May")
		.selectDate("5")
		.selectMaritalStatus()
		.selectcountry("India")
		.clickGender()
		.enterEmail("harish224@gmail.com")
		.enterMobile("8712222222")
		.selectNationality("94")
		.clickContnue()
		.enterDoor("4-333")
		.enterStreet("third street")
		.enterArea("temple area")
		.enterPincode("522503")
		.enterState("Andhra Pradesh")
		.waitforcity(5000)
		.selectCity("GUNTUR")
		.waitforcity(5000)
		.selectPostoff("Mangalagiri Busstand S.O")
		.enterPhone("7878787878")
		.clickNo()
		.waitforcity(2000)
		.enterOffDoor("4-2225")
		.enterOffStreet("second street")
		.enterOffArea("temple street")
		.enterOffPincode("522503")
		.selectOffCountry("India")
		.selectOffCity("Guntur")
		.enterOffPostoff("Mangalagiri Busstand S.O")
		.enterOffPhone("7897897897")
		
		;
		
		
		
	}


}
