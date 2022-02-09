package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelForm extends GenericWrappers{
	
	
	public IrctcHotelForm(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}
	
	
	public IrctcHotelForm selectTitle(String title) {
		waitProperty(1200);
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelForm.selectTitle.Xpath"), title);
		return this;
	}
	public IrctcHotelForm enterFname(String fname) {
		enterByXpath(prop.getProperty("IrctcHotelForm.enterFname.Xpath"), fname);
		return this;
	}
	public IrctcHotelForm enterLname(String lname) {
		enterByXpath(prop.getProperty("IrctcHotelForm.enterLname.Xpath"),lname);
		return this;
	}
	
	public IrctcHotelForm selectState(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelForm.selectState.Xpath"), state);
		return this;
	}
	
	
	public IrctcHotelForm selectGstNo() {
		clickByXpath(prop.getProperty("IrctcHotelForm.selectGstNo.Xpath"));
		return this;
	}
	
	public IrctcHotelGst selectGstYes() {
		clickByXpath(prop.getProperty("IrctcHotelForm.selectGstYes.Xpath"));
		return new IrctcHotelGst(driver,test);
	}
	
	public IrctcHotelForm clickCntn() {
	clickByXpath(prop.getProperty("IrctcHotelForm.clickCntn.Xpath"));
	waitProperty(3000);
	return this;
	}
	
	
	
	public IrctcHotelForm clickAgree() {
		clickByXpath(prop.getProperty("IrctcHotelForm.clickAgree.Xpath"));
		return this;
	}
	
	public IrctcHotelForm clickPayment() {
		clickByXpath(prop.getProperty("IrctcHotelForm.clickPayment.Xpath"));
		return this;
	}
	
	
	public IrctcHotelForm clickVerify() {
		clickByXpath(prop.getProperty("IrctcHotelForm.clickVerify.Xpath"));
		return this;
	}

	public IrctcHotelForm verifyOtp(String option) {
	verifyTextByXpath(prop.getProperty("IrctcHotelForm.verifyOtp.Xpath"), option);
	return this;
	}


}
