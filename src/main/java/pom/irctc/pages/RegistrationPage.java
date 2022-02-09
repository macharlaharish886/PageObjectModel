package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{


	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}

	
	public RegistrationPage enterUserName(String userName) {
		enterByXpath(prop.getProperty("RegistrationPage.enterUserName.Xpath"), userName);
		return this;
	}
	
	public RegistrationPage enterPassword(String pwd) {
		enterByXpath(prop.getProperty("RegistrationPage.enterPassword.Xpath"), pwd);
		return this;
	}
	public RegistrationPage enterConfirmPassword(String cpwd) {
		enterByXpath(prop.getProperty("RegistrationPage.enterConfirmPassword.Xpath"), cpwd);
		return this;
	}
	
	public RegistrationPage clickOnPreferedLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.clickOnPreferedLanguage.Xpath"));
		return this;
	}
	public RegistrationPage clickOnSpecificLanguage(String option) {
		clickByXpath(prop.getProperty("RegistrationPage.clickOnSpecificLanguage.Xpath"),option);
		return this;
	}
	
	public RegistrationPage clickOnSeq() {
		clickByXpath(prop.getProperty("RegistrationPage.clickOnSeq.Xpath"));
		return this;
	}
	
	public RegistrationPage selectSeQ(String option) {
		clickByXpath(prop.getProperty("RegistrationPage.selectSeQ.Xpath"),option);
		return this;
	}
	
	
	public RegistrationPage enterSecAnswer(String answer) {
		enterByXpath(prop.getProperty("RegistrationPage.enterSecAnswer.Xpath"), answer);
		return this;
	}
	
	public PersonalDetails clickContinue() {
		clickByXpath(prop.getProperty("RegistrationPage.clickContinue.Xpath"));
		return new PersonalDetails(driver,test);
	}
	
			
				
}
