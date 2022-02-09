package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;

import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC003";
		testcaseDescription="To verify the purpose of charter from the irctc homepage";
		author="Harish";
		category="charter";
		browser="chrome";
		appName="charter";
	
	}
	
	
	@Test
	public void saloon() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWin()
		.clickSidebar()
		.clickCharter()
		.clickDismiss()
		.clickEnquiryform()
		.enterName("Harish")
		.enterOrganization("Apple Tree")
		.enterAddress("224 vanierdrive, ten street, AP")
		.enterMobile("8712222")
		.enteremail("harish224@gmail.com")
		.selectRqst("Saloon Charter")
		.enterOriginstn("Chennai")
		.enterDestStn("Vijayawada")
		.enterYearArrvl("2022")
		.enterMonthArrvl()
		.enterDayArrvl("5")
		.enterYearDep("2022")
		.enterMonthDep()
		.enterDayDep("9")
		.enterDays("4")
		.enterCoach("s3")
		.enterNumCoach("1")
		.enterPassenger("24")
		.enterPurpose("Business")
		.enterServices("NA")
		.selectSubmit()
		.verifyMobile("Mobile no. not valid")
		;
	}
}
