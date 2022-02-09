package pom.irctc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelData extends GenericWrappers {
	
	

	public IrctcHotelData(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}
	
	public IrctcHotelData enterDestn(String option) {
		
		waitProperty(3000);
		
		enterByXpath(prop.getProperty("IrctcHotelData.enterDestn.Xpath"), option);
		waitProperty(2000);
		clickByXpath(prop.getProperty("IrctcHotelData.enterDest.Xpath"),option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return this;
	}

	
	public IrctcHotelData enterCheckinYear(String option) {
	
		clickByXpath(prop.getProperty("IrctcHotelData.enterCheckinYear.Xpath"));
		waitProperty(2000);
		clickByXpath(prop.getProperty("IrctcHotelData.enterCheckinYea.Xpath"));
		waitProperty(1000);
		clickByXpath(prop.getProperty("IrctcHotelData.enterCheckinYe.Xpath"),option);
		waitProperty(2000);
		return this;
	}
	
	public IrctcHotelData enterCheckinMonth(String option) {
		
		clickByXpath(prop.getProperty("IrctcHotelData.enterCheckinMonth.Xpath"),option);
		waitProperty(2000);
		return this;
	}
	
	public IrctcHotelData enterCheckinDay(String option) {
		
		clickByXpath(prop.getProperty("IrctcHotelData.enterCheckinDay.Xpath"),option);
		waitProperty(2000);
		return this;
	}
	
	public IrctcHotelData enterCheckoutYear(String option) {
		
		
		clickByXpath(prop.getProperty("IrctcHotelData.enterCheckoutYear.Xpath"));
		waitProperty(2000);
		clickByXpath(prop.getProperty("IrctcHotelData.enterCheckoutYea.Xpath"));
		waitProperty(2000);
		clickByXpath(prop.getProperty("IrctcHotelData.enterCheckoutYe.Xpath"),option);
		waitProperty(2000);
		
		return this;
	}
	
	public IrctcHotelData enterCheckoutMonth(String option) {
		
		clickByXpath(prop.getProperty("IrctcHotelData.enterCheckoutMonth.Xpath"),option);
		waitProperty(2000);
		return this;
	}
	
	public IrctcHotelData enterCheckoutDay(String option) {
		
		clickByXpath(prop.getProperty("IrctcHotelData.enterCheckoutDay.Xpath"),option);
		waitProperty(2000);
		return this;
	}
	
	
	
	public IrctcHotelData enterRooms(String rooms) {
		
		clickByXpath(prop.getProperty("IrctcHotelData.enterRooms.Xpath"));
		waitProperty(2000);
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelData.enterRoom.Xpath"), rooms);
		
	//	selectVisibileTextByXpath("(//option[@value='"+rooms+"'])[1]", rooms);
		return this;
	}
	
	public IrctcHotelData enterGuestsAdult(String guestsAdult) {
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelData.enterGuestsAdult.Xpath"),guestsAdult);
		
		return this;
	}
	
	public IrctcHotelData enterGuestsChild(String guestsChild) {
	
		selectVisibileTextByXpath(prop.getProperty("IrctcHotelData.enterGuestsChild.Xpath"), guestsChild);
		return this;
	}
	
	public IrctcHotelData cllickDone() {
		clickByXpath(prop.getProperty("IrctcHotelData.cllickDone.Xpath"));
		waitProperty(2000);
		return this;
	}
	public IrctcHotelList clickFind() {
		clickByXpath(prop.getProperty("IrctcHotelData.clickFind.Xpath"));
		return new IrctcHotelList(driver,test);
	}
	


}
