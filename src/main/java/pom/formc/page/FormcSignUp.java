package pom.formc.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormcSignUp extends GenericWrappers {
	
	
public FormcSignUp(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}

	public FormC clickSignup() {
		
		clickByXpath(prop.getProperty("FormCSignUp.clickSignUp.XPath"));
		waitProperty(2000);
		return new FormC(driver,test);

}
}