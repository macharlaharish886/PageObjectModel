package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Enquiryform extends GenericWrappers{
	
	

	public Enquiryform(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}

	public Enquiryform switchWin() {
		
		switchToLastWindow();
		return this;
	}

	
	public Enquiryform enterName(String name) {
		enterByXpath(prop.getProperty("Enquiryform.enterName.Xpath"), name);
		return this;
	}
	public Enquiryform enterOrganization(String orgtn) {
		enterByXpath(prop.getProperty("Enquiryform.enterOrganization.Xpath"),orgtn);
		return this;
	}
	public Enquiryform enterAddress(String address) {
		enterByXpath(prop.getProperty("Enquiryform.enterAddress.Xpath"), address);
		return this;
	}
	
	public Enquiryform enterMobile(String mobile) {
		enterByXpath(prop.getProperty("Enquiryform.enterMobile.Xpath"), mobile);
		return this;
	}
	public Enquiryform enteremail(String email) {
		enterByXpath(prop.getProperty("Enquiryform.enteremail.Xpath"), email);
		return this;
	}
	public Enquiryform selectRqst(String requstFor) {
		selectVisibileTextByXpath(prop.getProperty("Enquiryform.selectRqst.Xpath"), requstFor);
		return this;
	}
	public Enquiryform enterOriginstn(String originstn) {
		enterByXpath(prop.getProperty("Enquiryform.enterOriginstn.Xpath"), originstn);
		return this;
	}
	public Enquiryform enterDestStn(String destStn) {
		enterByXpath(prop.getProperty("Enquiryform.enterDestStn.Xpath"), destStn);
		return this;
		
	}
	
	
	public Enquiryform enterYearArrvl(String year) {
		
		clickByXpath(prop.getProperty("Enquiryform.enterYearArrvl.Xpath"));
		selectValueByXpath(prop.getProperty("Enquiryform.enterYearArrv.Xpath"), year);
		
	
		return this;
	}
	
	public Enquiryform enterMonthArrvl() {
	//	clickByXpath("(//i[@class='fa fa-angle-right'])[1]");
		return this;
	}
	
	public Enquiryform enterDayArrvl(String option) {
		
		clickByXpath(prop.getProperty("Enquiryform.enterDayArrvl.Xpath"),option);
		
		return this;
		
	}
	
	
	public Enquiryform enterYearDep(String year) {
		
		clickByXpath(prop.getProperty("Enquiryform.enterYearDep.Xpath"));
		selectValueByXpath(prop.getProperty("Enquiryform.enterYearDe.Xpath"), year);
	
		
		return this;
	}
	
	public Enquiryform enterMonthDep() {
		//clickByXpath("(//i[@class='fa fa-angle-right'])[2]");
		return this;
	}
	
	public Enquiryform enterDayDep(String option) {
		
		clickByXpath(prop.getProperty("Enquiryform.enterDayDep.Xpath"),option);
		
		return this;
		
	}
	
	public Enquiryform enterDays(String days) {
		enterByXpath(prop.getProperty("Enquiryform.enterDays.Xpath"), days);
		return this;
	}
	public Enquiryform enterCoach(String coach) {
		enterByXpath(prop.getProperty("Enquiryform.enterCoach.Xpath"), coach);
		return this;
	}
	public Enquiryform enterNumCoach(String nCoach) {
		enterByXpath(prop.getProperty("Enquiryform.enterNumCoach.Xpath"), nCoach);
		return this;
	}
	public Enquiryform enterPassenger(String passenger) {
		enterByXpath(prop.getProperty("Enquiryform.enterPassenger.Xpath"), passenger);
		return this;
	}
	public Enquiryform enterPurpose(String purpose) {
		enterByXpath(prop.getProperty("Enquiryform.enterPurpose.Xpath"), purpose);
		return this;
	}
	public Enquiryform enterServices(String services) {
		enterByXpath(prop.getProperty("Enquiryform.enterServices.Xpath"), services);
		return this;
	}
	public Enquiryform selectSubmit() {
		clickByXpath(prop.getProperty("Enquiryform.selectSubmit.Xpath"));
		return this;
	}
	public Enquiryform verifyMobile(String text) {
		verifyTextByXpath(prop.getProperty("Enquiryform.verifyMobile.Xpath"), text);
		return this;
	}

}


