package pom.phptravel.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpTravel extends GenericWrappers {
	

	public PhpTravel(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public PhpTravel enterFname(String fName) {
	
		enterByXpath(prop.getProperty("PhpTravel.enterFname.Xpath"), fName);
		return this;
	}


	public PhpTravel enterLname(String lName) {
		
		enterByXpath(prop.getProperty("PhpTravel.enterLname.Xpath"), lName);
		return this;
	}
	
	public PhpTravel enterEmail(String email) {

		enterByXpath(prop.getProperty("PhpTravel.enterEmail.Xpath"), email);
		return this;
	}
	public PhpTravel enterPhone(String phone) {
		enterByXpath(prop.getProperty("PhpTravel.enterPhone.Xpath"), phone);
		return this;
	}
	
	public PhpTravel enterCname(String cname) {
		enterByXpath(prop.getProperty("PhpTravel.enterCname.Xpath"), cname);
		return this;
	}
	
	public PhpTravel enterAdress(String adres) {
		enterByXpath(prop.getProperty("PhpTravel.enterAdress.Xpath"), adres);
		return this;
	}
	
	public PhpTravel enterAdres(String adress) {
		enterByXpath(prop.getProperty("PhpTravel.enterAdres.Xpath"), adress);
		return this;
	}
	
	public PhpTravel enterCity(String city) {
		enterByXpath(prop.getProperty("PhpTravel.enterCity.Xpath"), city);
		return this;
	}
	
	public PhpTravel enterState(String state) {
		enterByXpath(prop.getProperty("PhpTravel.enterState.Xpath"), state);
		return this;
	}
	
	public PhpTravel enterPostalc(String postalc) {
		enterByXpath(prop.getProperty("PhpTravel.enterPostalc.Xpath"), postalc);
		return this;
	}
	
	public PhpTravel enterCountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("PhpTravel.enterCountry.Xpath"), country);
		return this;
	}
	
	public PhpTravel enterMobile(String phone) {
		enterByXpath(prop.getProperty("PhpTravel.enterMobile.Xpath"), phone);
		return this;
	}
	
	public PhpTravel enterPwdx(String pwdx) {
		enterByXpath(prop.getProperty("PhpTravel.enterPwdx.Xpath"), pwdx);
		return this;
	}


	public PhpTravel enterPwdy(String pwdy) {
		enterByXpath(prop.getProperty("PhpTravel.enterPwdy.Xpath"), pwdy);
		return this;
	}
	
	public PhpTravel clickRegister() {
		clickByXpath(prop.getProperty("PhpTravel.clickRegister.Xpath"));
		return this;
	}

}
