package pom.irctc.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{

	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC002";
		testcaseDescription="To book a coach from the irctc homepage";
		author="Harish";
		category="Booking";
		browser="chrome";
		appName="BookCoach";
	
	}
	
	
	@Test
	public void bookCoach() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWin()
		.clickSidebar()
		.clickBookCoach()
		.switchWin()
		.clickNewUser()
		.enterUserId("Hariss234")
		.enterUsrPwd("Hari@222")
		.enterCnfPwd("Hari@222")
		.selectSeqNo("What is your pet name?")
		.enterSecAns("don")
		.clickDob()
		.enterDobYear("1998")
		.enterDobMonth("Jan")
		.enterDobDay("6")
		.selectGender("M")
		.selectStatuss("UnMarried")
		.enterEmail("harish345@gmail.com")
		.selectOcptn("Government")
		.enterFirstName("Harish")
		.enterMiddleName("Rao")
		.enterLastName("Macharla")
		.selectNationality("Indian")
		.enterDoor("336")
		.enterStreet("fourth street")
		.enterArea("temple area")
		.selectCountry("India")
		.enterMobile("8712222222")
		.enterPincode("522503")
		.selectPostOff("Mangalagiri Busstand S.O")
		.selectNo()
		.enterOffDoor("556")
		.enterOffStreet("fifth street")
		.enterOffArea("bus stand area")
		.selectOffCountry("India")
		.enterOffMobile("8712222222")
		.enterPincodeOff("522503")
		.selectOffPostOff("Mangalagiri Bazar S.O")
		;
		
	}
}
