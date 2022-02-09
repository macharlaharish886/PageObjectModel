package pom.facebook.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FaceBookSignUP extends GenericWrappers {
	

	public FaceBookSignUP(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
	
		this.driver=driver;
		this.test=test;
	}


	public FaceBookSignUP enterFname(String fName) {
		enterByXpath(prop.getProperty("FacebookSignUp.enterFname.XPath"), fName);
		return this;
	}
	public FaceBookSignUP enterLname(String lName) {
		enterByXpath(prop.getProperty("FacebookSignUp.enterLname.XPath"),lName);
		return this;
	}

	public FaceBookSignUP enterEmail(String email) {
		enterByXpath(prop.getProperty("FacebookSignUp.enterEmail.XPath"), email);
		return this;
	}
	
	public FaceBookSignUP enterRemail(String remail) {
		enterByXpath(prop.getProperty("FacebookSignUp.enterRemail.XPath"),remail);
		return this;
	}

	public FaceBookSignUP enterPwd(String pwd) {
	
		enterByXpath(prop.getProperty("FacebookSignUp.enterPwd.XPath"), pwd);
	
		return this;
	}
	
	public FaceBookSignUP enterYear(String year) {
	//	selectVisibileTextByXpath("//select[@id='year']/option[text()='"+year+"']",year);
		selectVisibileTextByXpath(prop.getProperty("FacebookSignUp.enterYear.XPath"),year);
		return this;
	}
	
	public FaceBookSignUP enterMonth(String month) {
		selectVisibileTextByXpath(prop.getProperty("FacebookSignUp.enterMonth.XPath"),month);
		return this;
	}

	public FaceBookSignUP enterDay(String day) {
		selectVisibileTextByXpath(prop.getProperty("FacebookSignUp.enterDay.XPath"),day);
		waitProperty(2000);
		return this;
	}
	
	public FaceBookSignUP selectGender(String option) {
		clickByXpath((prop.getProperty("FacebookSignUp.selectGender.XPath")), option);
		return this;
	}
	
}
