package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrServiceNewUser  extends GenericWrappers{
	
	
	public FtrServiceNewUser(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}
	
	public FtrServiceNewUser enterUserId(String usrId) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterUserId.Xpath"), usrId);
		return this;
	}
	
	public FtrServiceNewUser enterUsrPwd(String usrPwd) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterUsrPwd.Xpath"), usrPwd);
		return this;
	}
	
	public FtrServiceNewUser enterCnfPwd(String cnfPwd) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterCnfPwd.Xpath"), cnfPwd);
		return this;
	}
	
	public FtrServiceNewUser selectSeqNo(String seqNo) {
		selectVisibileTextByXpath(prop.getProperty("FtrServiceNewUser.selectSeqNo.Xpath"),seqNo);
		return this;
	}
	
	public FtrServiceNewUser enterSecAns(String secAns) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterSecAns.Xpath"), secAns);
		return this;
	}
	
	public FtrServiceNewUser clickDob() {
		clickByXpath(prop.getProperty("FtrServiceNewUser.clickDob.Xpath"));
		return this;
	}
	
	public FtrServiceNewUser enterDobYear(String year) {
		
		selectValueByXpath(prop.getProperty("FtrServiceNewUser.enterDobYear.Xpath"), year);
			return this;
	}
	
	public FtrServiceNewUser enterDobMonth(String month) {
		selectVisibileTextByXpath(prop.getProperty("FtrServiceNewUser.enterDobMonth.Xpath"), month);
		return this;	
	}
	
	public FtrServiceNewUser enterDobDay(String option) {
	
		clickByXpath(prop.getProperty("FtrServiceNewUser.enterDobDay.Xpath"),option);
		return this;
	}
	
	public FtrServiceNewUser selectGender(String option) {
		clickByXpath(prop.getProperty("FtrServiceNewUser.selectGender.Xpath"),option);
		return this;
	}
	
	public FtrServiceNewUser selectStatuss(String option) {
		clickByXpath(prop.getProperty("FtrServiceNewUser.selectStatuss.Xpath"),option);
		return this;
	}
	
	public FtrServiceNewUser enterEmail(String email) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterEmail.Xpath"), email);
		return this;
	}
	
	public FtrServiceNewUser selectOcptn(String ocptn) {
		selectVisibileTextByXpath(prop.getProperty("FtrServiceNewUser.selectOcptn.Xpath"),ocptn);
		return this;
	}
	
	public FtrServiceNewUser enterFirstName(String fName) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterFirstName.Xpath"), fName);
		return this;
	}
	
	public FtrServiceNewUser enterMiddleName(String mName) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterMiddleName.Xpath"), mName);
		return this;
	}
	public FtrServiceNewUser enterLastName(String lName) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterLastName.Xpath"), lName);
		return this;
	}
	
	public FtrServiceNewUser selectNationality(String natnlty) {
		selectVisibileTextByXpath(prop.getProperty("FtrServiceNewUser.selectNationality.Xpath"), natnlty);
		return this;
	}
	
	public FtrServiceNewUser enterDoor(String door) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterDoor.Xpath"), door);
		return this;
	}
	
	public FtrServiceNewUser enterStreet(String street) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterStreet.Xpath"), street);
		return this;
	}
	
	public FtrServiceNewUser enterArea(String area) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterArea.Xpath"), area);
		return this;
	}
	
	public FtrServiceNewUser selectCountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("FtrServiceNewUser.selectCountry.Xpath"), country);
		return this;
	}
	
	public FtrServiceNewUser enterMobile(String mobile) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterMobile.Xpath"), mobile);
		return this;
	}
	
	
	
	public FtrServiceNewUser enterPincode(String pincode) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterPincode.Xpath"), pincode);
		waitProperty(4000);
		pageDown();
		return this;
	}
	
	
	public FtrServiceNewUser selectPostOff(String postOff) {
		
		//clickByXpath("//select[@id='postOffice']");
		selectVisibileTextByXpath(prop.getProperty("FtrServiceNewUser.selectPostOff.Xpath"), postOff);
		waitProperty(2000);
		
		return this;
	}
	
	public FtrServiceNewUser selectNo() {
		clickByXpath(prop.getProperty("FtrServiceNewUser.selectNo.Xpath"));
		waitProperty(1000);
		return this;
	}
	
	public FtrServiceNewUser enterOffDoor(String offdoor) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterOffDoor.Xpath"), offdoor);
		return this;
	}
	
	public FtrServiceNewUser enterOffStreet(String offstreet) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterOffStreet.Xpath"), offstreet);
		return this;
	}
	
	public FtrServiceNewUser enterOffArea(String offarea) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterOffArea.Xpath"), offarea);
		return this;
	}
	
	public FtrServiceNewUser selectOffCountry(String offcountry) {
		selectVisibileTextByXpath(prop.getProperty("FtrServiceNewUser.selectOffCountry.Xpath"), offcountry);
		return this;
	}
	
	public FtrServiceNewUser enterOffMobile(String offmobile) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterOffMobile.Xpath"), offmobile);
		return this;
	}
	
	public FtrServiceNewUser enterPincodeOff(String pincodeoff) {
		enterByXpath(prop.getProperty("FtrServiceNewUser.enterPincodeOff.Xpath"), pincodeoff);
		waitProperty(4000);
		pageDown();
		return this;
	}
	
	
	public FtrServiceNewUser selectOffPostOff(String offpostoff) {
		selectVisibileTextByXpath(prop.getProperty("FtrServiceNewUser.selectOffPostOff.Xpath"), offpostoff);
		return this;
	}
	 
	

}
