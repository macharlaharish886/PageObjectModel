package pom.pancard.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pancard.page.PanCard;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{

	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC007";
		testcaseDescription="To fill a pan card application";
		author="Harish";
		category="PAN";
		browser="chrome";
		appName="pancard";
	
	}
	
	@Test
	public void panCard() {
		
		new PanCard(driver,test)
		.selectTitle("MR.")
		.enterFname("Harish")
		.enterMname("Rao")
		.enterLname("Macharla")
		.enterFfname("Srinu")
		.enterFmname("Rao")
		.enterFlname("Macharla")
		.entermobile("9898676789")
		.enteremail("Harish234@gmail.com")
		.selectIncome("3")
		.selectProff("13")
		.clickcomm()
		.enterDob("06021994")
		.pagDown()
		.enteraddressX("324 lane")
		.enteraddressY("temple street")
		.enterCity("Guntur")
		.selectState("Andhra Pradesh")
		.enterpinCode("522503")
		.enteroName("RRR office")
		.enteroAddressX("333 lane")
		.enteroAddressY("temple lane")
		.enteroCity("Guntur")
		.selectoState("Andhra Pradesh")
		.enteroPinCode("522503")
		.selectId("Aadhar Card issued by UIDAI(In Copy)")
		.selectadProof("PASSPORT (In Copy)")
		.selectDobp("Aadhar Card issued by UIDAI(In Copy)")
		.selectAadhar()
		.clickAdrp()
		.clickAgree()
		.clickSubmit()
		;
	}
}
