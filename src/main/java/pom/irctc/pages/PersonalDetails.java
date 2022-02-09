package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PersonalDetails extends GenericWrappers{
	

	public PersonalDetails(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}
	
	public PersonalDetails enterFirstName(String fname) {
		enterByXpath(prop.getProperty("PersonalDetails.enterFirstName.Xpath"), fname);
		return this;
	}
	
	public PersonalDetails enterMiddleName(String mname) {
		enterByXpath(prop.getProperty("PersonalDetails.enterMiddleName.Xpath"), mname);
		return this;
	}
	
	public PersonalDetails enterLastName(String lname) {
		enterByXpath(prop.getProperty("PersonalDetails.enterLastName.Xpath"), lname);
		return this;
	}
	
	public PersonalDetails selectOccuptn() {
		clickByXpath(prop.getProperty("PersonalDetails.selectOccuptn.Xpath"));
		return this;
	}
	
	public PersonalDetails selectOccupton(String option) {
		clickByXpath(prop.getProperty("PersonalDetails.selectOccupton.Xpath"),option);
		return this;
	}
	
	public PersonalDetails clickDob() {
		clickByXpath(prop.getProperty("PersonalDetails.clickDob.Xpath"));
		return this;
	
}
	
	public PersonalDetails selectYear(String year) {
		
		selectValueByXpath(prop.getProperty("PersonalDetails.selectYear.Xpath"), year);
		
		
		return this;
	}
	
	public PersonalDetails selectMonth(String month) {
		
		selectVisibileTextByXpath(prop.getProperty("PersonalDetails.selectMonth.Xpath"), month);
		return this;
	}
	
	public PersonalDetails selectDate(String option) {
		
		clickByXpath(prop.getProperty("PersonalDetails.selectDate.Xpath"),option);
		return this;
	}
	public PersonalDetails selectMaritalStatus() {
		clickByXpath(prop.getProperty("PersonalDetails.selectMaritalStatus.Xpath"));
		return this;
		
	}
	
	public PersonalDetails selectcountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("PersonalDetails.selectcountry.Xpath"), country);
		return this;
		}
	
	public PersonalDetails clickGender() {
		clickByXpath(prop.getProperty("PersonalDetails.clickGender.Xpath"));
		return this;
		
	}
	
	public PersonalDetails enterEmail(String email) {
		enterByXpath(prop.getProperty("PersonalDetails.enterEmail.Xpath"), email);
		return this;
		
	}
	
	public PersonalDetails enterMobile(String mobile) {
		enterByXpath(prop.getProperty("PersonalDetails.enterMobile.Xpath"), mobile);
		return this;
		
	}
	
	public PersonalDetails selectNationality(String nationality) {
		selectValueByXpath(prop.getProperty("PersonalDetails.selectNationality.Xpath"), nationality);
		return this;
		}
	
	public Address clickContnue() {
		clickByXpath(prop.getProperty("PersonalDetails.clickContnue.Xpath"));
		return new Address(driver,test);
	}

}
