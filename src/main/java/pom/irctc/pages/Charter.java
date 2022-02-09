package pom.irctc.pages;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Charter extends GenericWrappers{
	
	
	public Charter(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}

	
	
	
//	public Charter switchHome() {
//		
//		switchToParentWindow();
//		return this;
//	}

	
	
	
	public Charter clickDismiss() {
		clickByXpath(prop.getProperty("Charter.clickDismiss.Xpath"));
		waitProperty(3000);
		return this;
	}
	
	
	public Enquiryform clickEnquiryform() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickByXpath(prop.getProperty("Charter.clickEnquiryform.Xpath"));
		waitProperty(3000);
		return  new Enquiryform(driver, test);
		}
	
	}


