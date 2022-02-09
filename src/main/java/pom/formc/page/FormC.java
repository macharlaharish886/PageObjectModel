package pom.formc.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


import wrappers.GenericWrappers;

public class FormC extends GenericWrappers {


	public FormC(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}


	public FormC switchWin() {
		
		switchToLastWindow();
		return this;
	}
	
	public FormC enterId(String id) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 enterByXpath(prop.getProperty("FormC.enterId.Xpath"), id);
	 return this;
	}
	
	public FormC enterPwd(String pwd) {
	 enterByXpath(prop.getProperty("FormC.enterPwd.Xpath"), pwd);
	 return this;
	}
	
	public FormC enterRePwd(String repwd) {
		enterByXpath(prop.getProperty("FormC.enterRePwd.Xpath"), repwd);
		return this;
	}
	 
	public FormC selectQustn(String secqstn) {
	 selectValueByXpath(prop.getProperty("FormC.selectQustn.Xpath"), secqstn);
	 return this;
	}
	
	public FormC enterAns(String ans) {
	
		 enterByXpath(prop.getProperty("FormC.enterAns.Xpath"), ans);
		 return this;
	}
	
	public FormC enterFirstName(String fName) {
	 enterByXpath(prop.getProperty("FormC.enterFirstName.Xpath"), fName);
	 return this;
	}
	
	public FormC selectGender(String gender) {
	 selectValueByXpath(prop.getProperty("FormC.selectGender.Xpath"), gender);
	 return this;
	}
	
	public FormC enterDob(String dob) {
	
	 enterByXpath(prop.getProperty("FormC.enterDob.Xpath"), dob);
	 return this;
	}
	
	public FormC enterDesgn(String designation) {
	 enterByXpath(prop.getProperty("FormC.enterDesgn.Xpath"), designation);
	 return this;
	 }
	
	public FormC enterEmail(String email) {
	 enterByXpath(prop.getProperty("FormC.enterEmail.Xpath"), email);
	 return this;
	}
	
	public FormC enterMobile(String mobile) {
	 enterByXpath(prop.getProperty("FormC.enterMobile.Xpath"), mobile);
	 return this;
	}
	
	public FormC enterPhone(String phone) {
		enterByXpath(prop.getProperty("FormC.enterPhone.Xpath"), phone);
		return this;
	}
	
	public FormC enterName(String name) {
	 enterByXpath(prop.getProperty("FormC.enterName.Xpath"), name);
	 return this;
	  }
	
	public FormC enterCapacity(String capacity) {
	
	
		enterByXpath(prop.getProperty("FormC.enterCapacity.Xpath"), capacity);
		return this;
	}
	 
	public FormC enterAddress(String address) {
	
	 enterByXpath(prop.getProperty("FormC.enterAddress.Xpath"), address);
	 return this;
	}
	

	
	
	
	public FormC selectState(String state) {
	// selectVisibileTextByXpath("//select[@id='state']/option[contains(text(),'"+state+"')]", state);
	 selectValueByXpath(prop.getProperty("FormC.selectState.Xpath"), state);
	 return this;
	}
	
	public FormC waitforcity(long time) {
		
		waitProperty(time);
		return this;
	}
	
	public FormC selectDst(String dst) {
	 selectValueByXpath(prop.getProperty("FormC.selectDst.Xpath"), dst);
	 return this;
	}
	 
	public FormC selectAccType(String accType) {
		
	
	 selectValueByXpath(prop.getProperty("FormC.selectAccType.Xpath"),accType);
	 return this;
	}
	
	public FormC selectAccGrade(String accGrade) {
		
	 selectValueByXpath(prop.getProperty("FormC.selectAccGrade.Xpath"), accGrade);
	 return this;
	}
	
	public FormC enterEmailo(String email) {
		
	
	enterByXpath(prop.getProperty("FormC.enterEmailo.Xpath"), email);
	return this;
	}
	
	public FormC enterContact(String contact) {
	 enterByXpath(prop.getProperty("FormC.enterContact.Xpath"), contact);
	 return this;
	}
	
	public FormC enterNameo(String nameo) {
		enterByXpath(prop.getProperty("FormC.enterNameo.Xpath"),nameo);
		return this;
	}
	
	public FormC enterAddresso(String addresso) {
	 enterByXpath(prop.getProperty("FormC.enterAddresso.Xpath"), addresso);
	 return this;
	}
	
	public FormC selectStateo(String stateo) {
		 selectValueByXpath(prop.getProperty("FormC.selectStateo.Xpath"), stateo);
		 return this;
		}
	
	public FormC waitforcityo(long time) {
		
		waitProperty(time);
		return this;
	}
		
		public FormC selectDsto(String dsto) {
		 selectValueByXpath(prop.getProperty("FormC.selectDsto.Xpath"), dsto);
		 return this;
		}
		
		public FormC enteremailo(String emailo) {
	 enterByXpath(prop.getProperty("FormC.enteremailo.Xpath"), emailo);
	 return this;
		}
		
		public FormC enterMobileo(String mobileo) {
	 enterByXpath(prop.getProperty("FormC.enterMobileo.Xpath"), mobileo);
	 return this;
		}
		
		public FormC enterPhoneo(String phoneo) {
	 enterByXpath(prop.getProperty("FormC.enterPhoneo.Xpath"), phoneo);
	 return this;
		}
}
