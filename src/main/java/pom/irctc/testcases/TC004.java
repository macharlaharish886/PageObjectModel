package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;

import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC004";
		testcaseDescription="To book a hotel from the irctc homepage";
		author="Harish";
		category="Reserve";
		browser="chrome";
		appName="hotel";
	
	}
	
	
	@Test
	public void bookHotels() {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWin()
		.clickHotels()
		.switchWin()
		.clickLogin()
		.clickGuest()
		.enterEmail("harish224@gmail.com")
		.enterMobile("8712222222")
		.clickLogIn()
		.enterDestn("Vijayawada")
		.enterCheckinYear("2022")
		.enterCheckinMonth("Jan")
		.enterCheckinDay("5")
		.enterCheckoutYear("2022")
		.enterCheckoutMonth("Jan")
		.enterCheckoutDay("9")
		.enterRooms("1")
		.enterGuestsAdult("3")
		.enterGuestsChild("0")
		.cllickDone()
		.clickFind()
		.selectHotel()
		.switchWin()
		.printHotel()
		.printPrice()
		.clickContinue()
		.selectTitle("Mr")
		.enterFname("Harish")
		.enterLname("Macharla")
		.selectState("ANDHRA PRADESH")
		.selectGstNo()
		.clickCntn()
		.clickAgree()
		.clickPayment()
		.clickVerify()
		.verifyOtp("otp is required.")
		;
	}

}
