package pom.fb.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.page.FbHomPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	

	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC009";
		testcaseDescription="To verify the facebook sign up for new user";
		author="Harish";
		category="Fan";
		browser="chrome";
		appName="Facebook";
	
	}
	
	@Test
	public void facebook() {
		new FbHomPage(driver,test)
		.clickNewAcc()
		.enterFname("Haxirh")
		.enterLname("Mzchfrda")
		.enterEmail("Haxirh23@gmail.com")
		.enterRemail("Haxirh23@gmail.com")
		.enterPwd("Haxirh23@m")
		.enterYear("1996")
		.enterMonth("Jan")
		.enterDay("6")
		.selectGender("2")
		;
	}

}
