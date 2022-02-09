package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;

import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{


	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC005";
		testcaseDescription="To book a hotel & validate GST from the irctc homepage";
		author="Harish";
		category="ReserveGST";
		browser="chrome";
		appName="hotelgst";
	
	}
	
	@Test
	public void bookHotelsGst() {
		
 
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWin()
		.clickSidebar()
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
		.selectGstYes()
		.enterCompanyName("Apple Tree")
		.enterCompanyAd("224 vanierdrive, ten street, AP")
		.clickCntn()
		.verifyText("gstNumber is required.")
		;
		
	}
}
