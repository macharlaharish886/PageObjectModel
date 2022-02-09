package pom.irctc.pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers {
	
	
	public AccommodationPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}
	
	public AccommodationPage switchWin() {
		
		switchToLastWindow();
		return this;
	}

	public AccommodationPage clickSidebar(){
		clickByXpath(prop.getProperty("AccommodationPage.clickSidebar.Xpath"));
		return this;
	}
	public FtrService clickBookCoach() {
		clickByXpath(prop.getProperty("AccommodationPage.clickBookCoach.Xpath"));
		return new FtrService(driver,test);
	}
	public IrctcHotels clickHotels() {
		clickByXpath(prop.getProperty("AccommodationPage.clickHotels.Xpath"));
		return new IrctcHotels(driver,test);
	}
	public Charter clickCharter() {
		clickByXpath(prop.getProperty("AccommodationPage.clickCharter.Xpath"));
		waitProperty(3000);
		return new Charter(driver,test);
	}
	
	
	
}