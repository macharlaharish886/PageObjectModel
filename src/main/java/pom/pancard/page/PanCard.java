package pom.pancard.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanCard extends GenericWrappers {
	

	public PanCard(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}


	public PanCard selectTitle(String title) {
		selectVisibileTextByXpath(prop.getProperty("PanCard.selectTitle.Xpath"), title);
		return this;
	}

	public PanCard enterFname(String fName) {
	
		enterByXpath(prop.getProperty("PanCard.enterFname.Xpath"), fName);
	
		return this;

	}
	
	public PanCard enterMname(String mName) {
		
		enterByXpath(prop.getProperty("PanCard.enterMname.Xpath"), mName);
	
		return this;

	}
	
	public PanCard enterLname(String lName) {
		
		enterByXpath(prop.getProperty("PanCard.enterLname.Xpath"), lName);
	
		return this;

	}
	
	public PanCard enterFfname(String fFName) {
		
		enterByXpath(prop.getProperty("PanCard.enterFfname.Xpath"), fFName);
	
		return this;

	}
	
	public PanCard enterFmname(String fMName) {
		
		enterByXpath(prop.getProperty("PanCard.enterFmname.Xpath"), fMName);
	
		return this;

	}
	
	public PanCard enterFlname(String fLName) {
		
		enterByXpath(prop.getProperty("PanCard.enterFlname.Xpath"), fLName);
	
		return this;

	}public PanCard entermobile(String mobile) {
		
		enterByXpath(prop.getProperty("PanCard.entermobile.Xpath"), mobile);
	
		return this;

	}
	
	public PanCard enteremail(String email) {
		
		enterByXpath(prop.getProperty("PanCard.enteremail.Xpath"), email);
	
		return this;

	}
	
	public PanCard selectIncome(String income) {
	
		selectValueByXpath(prop.getProperty("PanCard.selectIncome.Xpath"), income);
	
		return this;
	}
	
	public PanCard selectProff(String proff) {
	
		selectValueByXpath(prop.getProperty("PanCard.selectProff.Xpath"), proff);
	
		return this;
	}
	
	public PanCard clickcomm() {
		
		clickByXpath(prop.getProperty("PanCard.clickcomm.Xpath"));
		
		return this;
	}
	
	public PanCard enterDob(String dob) {
	
		enterByXpath(prop.getProperty("PanCard.enterDob.Xpath"), dob);

		return this;
	}
	
	public PanCard pagDown() {
		pageDown();
		return this;
	}
	
	public PanCard enteraddressX(String addressX) {
		
		enterByXpath(prop.getProperty("PanCard.enteraddressX.Xpath"), addressX);
	
		return this;

	}
	
	public PanCard enteraddressY(String addressY) {
		
		enterByXpath(prop.getProperty("PanCard.enteraddressY.Xpath"), addressY);
	
		return this;

	}
	
	public PanCard enterCity(String city) {
		
		enterByXpath(prop.getProperty("PanCard.enterCity.Xpath"), city);
	
		return this;

	}
	
	public PanCard selectState(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("PanCard.selectState.Xpath"), state);
	
		return this;

	}
	
	public PanCard enterpinCode(String pinCode) {
		
		enterByXpath(prop.getProperty("PanCard.enterpinCode.Xpath"), pinCode);
	
		return this;

	}
	
	public PanCard enteroName(String oName) {
		
		enterByXpath(prop.getProperty("PanCard.enteroName.Xpath"), oName);
	
		return this;

	}
	
	public PanCard enteroAddressX(String oAddressX) {
		
		enterByXpath(prop.getProperty("PanCard.enteroAddressX.Xpath"), oAddressX);
	
		return this;

	}
	public PanCard enteroAddressY(String oAddressY) {
		
		enterByXpath(prop.getProperty("PanCard.enteroAddressY.Xpath"), oAddressY);
	
		return this;

	}
	
	public PanCard enteroCity(String oCity) {
		
		enterByXpath(prop.getProperty("PanCard.enteroCity.Xpath"), oCity);
	
		return this;

	}
	
	public PanCard selectoState(String oState) {
		
		selectVisibileTextByXpath(prop.getProperty("PanCard.selectoState.Xpath"), oState);
	
		return this;

	}
	
	public PanCard enteroPinCode(String oPinCode) {
		
		enterByXpath(prop.getProperty("PanCard.enteroPinCode.Xpath"), oPinCode);
	
		return this;
	}
	
	public PanCard selectId(String id) {
		
		selectVisibileTextByXpath(prop.getProperty("PanCard.selectId.Xpath"), id);
	
		return this;

	}
	
	public PanCard selectadProof(String adProof) {
		
		selectVisibileTextByXpath(prop.getProperty("PanCard.selectadProof.Xpath"), adProof);
	
		return this;

	}
	
	public PanCard selectDobp(String dobP) {
		
		selectVisibileTextByXpath(prop.getProperty("PanCard.selectDobp.Xpath"), dobP);
	
		return this;

	}
	
	public PanCard selectAadhar() {
		
		clickByXpath(prop.getProperty("PanCard.selectAadhar.Xpath"));
	
		return this;

	}
	
	public PanCard clickAdrp() {
		
		clickByXpath(prop.getProperty("PanCard.clickAdrp.Xpath"));
	
		pageDown();
		waitProperty(2000);
		return this;

	}
	
	
	public PanCard clickAgree() {
		clickByXpath(prop.getProperty("PanCard.clickAgree.Xpath"));
		return this;
	}
	
	public PanCard clickSubmit() {
		clickByXpath(prop.getProperty("PanCard.clickSubmit.Xpath"));
		return this;
	}



}
