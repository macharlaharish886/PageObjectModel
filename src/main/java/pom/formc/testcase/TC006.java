package pom.formc.testcase;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.page.FormcSignUp;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC006";
		testcaseDescription="To verify the formc sign up for new user";
		author="Harish";
		category="Signup";
		browser="chrome";
		appName="Formc";
	
	}

	@Test
	public void formC() {
		
		new FormcSignUp(driver, test)
		.clickSignup()
		.enterId("Ravee249")
		.enterPwd("Raveee@334")
		.enterRePwd("Raveee@334")
		.selectQustn("2")
		.enterAns("Ramesh")
		.enterFirstName("Ravi")
		.selectGender("M")
		.enterDob("1996/01/06")
		.enterDesgn("General Manager")
		.enterEmail("ravee249@gmail.com")
		.enterMobile("8712222222")
		.enterPhone("7878787878")
		.enterName("Tent House")
		.enterCapacity("300")
		.enterAddress("3rd street, mang, 522255")
		.selectState("2")
		.waitforcity(3000)
		.selectDst("6D")
		.selectAccType("GH")
		.selectAccGrade("5s")
		.enterEmailo("ravee234@gmail.com")
		.enterContact("8977324111")
		.enterNameo("Mohan")
		.enterAddresso("4th street, mang, 522255")
		.selectStateo("2")
		.waitforcityo(2000)
		.selectDsto("6D")
		.enteremailo("ravee3221@gmail.com")
		.enterMobileo("9848022228")
		.enterPhoneo("9876987653")
		;
	}
}
