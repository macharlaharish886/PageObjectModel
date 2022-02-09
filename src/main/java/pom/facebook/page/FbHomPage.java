package pom.facebook.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FbHomPage extends GenericWrappers{
	
	
	public FbHomPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}

	public FaceBookSignUP clickNewAcc() {

		clickByXpath(prop.getProperty("FacebookHomepage.CreateAccount.XPath"));
		return new FaceBookSignUP(driver,test);
	}

}
