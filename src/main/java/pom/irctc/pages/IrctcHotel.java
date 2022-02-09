package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotel extends GenericWrappers {

	
	
	
	public IrctcHotel(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}

	public IrctcHotel switchWin() {
		
		switchToLastWindow();
		return this;
	}
	
	public IrctcHotel printHotel() {
		getTextByXpath(prop.getProperty("IrctcHotel.printHotel.Xpath"));
		return this;
	}
	
	public IrctcHotel printPrice() {
		//getTextByXpath("(//p[contains(text(),'+ taxes')]/preceding::strong)[4]");
		getTextByXpath(prop.getProperty("IrctcHotel.printPrice.Xpath"));
		return this;
	}
	
	public IrctcHotelForm clickContinue() {
		clickByXpath(prop.getProperty("IrctcHotel.clickContinue.Xpath"));
		return new IrctcHotelForm(driver,test);
	}
	
		
	
}
