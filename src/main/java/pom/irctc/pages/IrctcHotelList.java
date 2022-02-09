package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelList extends GenericWrappers {

	
	
	public IrctcHotelList(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}

	

	
	public IrctcHotel selectHotel() {
		clickByXpath(prop.getProperty("IrctcHotelList.selectHotel.Xpath"));
		return new IrctcHotel(driver,test);
	}
}
