package pom.irctc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotels extends GenericWrappers {
	
	
public IrctcHotels(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}


	public IrctcHotels switchWin() {
	
	switchToLastWindow();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return this;
	}


	public IrctcHotels clickLogin() {
		clickByXpath(prop.getProperty("IrctcHotels.clickLogin.Xpath"));
		return this;
	}
	
	public IrctcHotels clickGuest() {
		clickByXpath(prop.getProperty("IrctcHotels.clickGuest.Xpath"));
		return this;
	}
	
	public IrctcHotels enterEmail(String email) {
		enterByXpath(prop.getProperty("IrctcHotels.enterEmail.Xpath"), email);
		return this;
	}
	
	public IrctcHotels enterMobile(String mobile) {
		enterByXpath(prop.getProperty("IrctcHotels.enterMobile.Xpath"), mobile);
		waitProperty(3000);
		return this;
	}
	
	
	public IrctcHotelData clickLogIn() {
		clickByXpath(prop.getProperty("IrctcHotels.clickLogIn.Xpath"));
		return new IrctcHotelData(driver,test);
	}

		
}
