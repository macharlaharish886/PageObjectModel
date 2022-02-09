package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrService extends GenericWrappers{
	
	
public FtrService(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}


	public FtrService switchWin() {
	
	switchToLastWindow();
	return this;
}

	public FtrServiceNewUser clickNewUser() {
		clickByXpath(prop.getProperty("FtrService.clickNewUser.Xpath"));
		return new FtrServiceNewUser(driver,test);
	}
	
	
}
