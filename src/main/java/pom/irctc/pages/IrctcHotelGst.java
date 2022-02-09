package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelGst extends GenericWrappers {
	
	
	
	public IrctcHotelGst(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}
	

	public IrctcHotelGst enterCompanyName(String cName) {
		
		waitProperty(2000);
		enterByXpath(prop.getProperty("IrctcHotelGst.enterCompanyName.Xpath"), cName);
		return this;
	}
	
	public IrctcHotelGst enterCompanyAd(String ad) {
		enterByXpath(prop.getProperty("IrctcHotelGst.enterCompanyAd.Xpath"), ad);
		waitProperty(1900);
		pageDown();
		return this;
	}
	
	public IrctcHotelGst clickCntn() {
		clickByXpath(prop.getProperty("IrctcHotelGst.clickCntn.Xpath"));
		return this;
		}
	
	public IrctcHotelGst verifyText(String txt) {
		verifyTextByXpath(prop.getProperty("IrctcHotelGst.verifyText.Xpath"),txt);
		return this;
	}

}
