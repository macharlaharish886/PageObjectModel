package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}

	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.clickOnRegister.Xpath"));
		return new RegistrationPage(driver,test);
	}
	
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXPath(prop.getProperty("HomePage.mouseHoverOnHolidays.Xpath"));
		return this;
	}
	
	
	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXPath(prop.getProperty("HomePage.mouseHoverOnStays.Xpath"));
		return this;
	}
	
	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.clickOnLounge.Xpath"));
		return new AccommodationPage(driver,test);
		
	}
}
