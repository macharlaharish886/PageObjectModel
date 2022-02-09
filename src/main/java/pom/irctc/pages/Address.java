package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Address extends GenericWrappers {
	


	public Address(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;

	}
	
	public Address enterDoor(String door) {
		enterByXpath(prop.getProperty("Address.enterDoor.Xpath"), door);
		return this;
		
	}
	
		public Address enterStreet(String street) {
			enterByXpath(prop.getProperty("Address.enterStreet.Xpath"), street);
			return this;
	}
		
		public Address enterArea(String area) {
			enterByXpath(prop.getProperty("Address.enterArea.Xpath"), area);
			return this;
		}
		
	public Address enterPincode(String pincode) {
		enterByXpath(prop.getProperty("Address.enterPincode.Xpath"), pincode);
		return this;
		
	}
	public Address enterState(String state) {
		enterByXpath(prop.getProperty("Address.enterState.Xpath"),state);
		return this;
		}
	
	public Address waitforcity(long time) {
		waitProperty(time);
		return this;
	}
	
	public Address selectCity(String city) {
		selectVisibileTextByXpath(prop.getProperty("Address.selectCity.Xpath"),city);
		return this;
		
	}
	
	public Address selectPostoff(String postoff) {
		selectVisibileTextByXpath(prop.getProperty("Address.selectPostoff.Xpath"), postoff);
		return this;
		
	}
	
		public Address enterPhone(String phone) {
			enterByXpath(prop.getProperty("Address.enterPhone.Xpath"), phone);
			return this;
	}
		
		public Address clickNo() {
			clickByXpath(prop.getProperty("Address.clickNo.Xpath"));
			return this;
		}
		
		public Address enterOffDoor(String offdoor) {
			enterByXpath(prop.getProperty("Address.enterOffDoor.Xpath"), offdoor);
			return this;
			
		}
		
			public Address enterOffStreet(String offstreet) {
				enterByXpath(prop.getProperty("Address.enterOffStreet.Xpath"), offstreet);
				return this;
		}
			
			public Address enterOffArea(String offarea) {
				enterByXpath(prop.getProperty("Address.enterOffArea.Xpath"), offarea);
				return this;
			}
			
		public Address enterOffPincode(String offpincode) {
			enterByXpath(prop.getProperty("Address.enterOffPincode.Xpath"), offpincode);
			waitProperty(3000);
			return this;
			
		}
		
		public Address selectOffCountry(String option) {
			clickByXpath(prop.getProperty("Address.selectOffCountry.Xpath"));
			//clickByXpath("//span[text()='India']");
			clickByXpath(prop.getProperty("Address.selectOffCountr.Xpath"),option);
			waitProperty(3000);
			return this;
			
		}
//		public Address enterOffState(String offstate) {
//			enterByXpath("//input[@id='offState']",offstate);
//			return this;
//			}
		
		public Address selectOffCity(String offcity) {
			enterByXpath(prop.getProperty("Address.selectOffCity.Xpath"),offcity);
			waitProperty(3000);
			return this;
			
		}
		
		public Address enterOffPostoff(String offpostoff) {
			enterByXpath(prop.getProperty("Address.enterOffPostoff.Xpath"), offpostoff);
			return this;
			
		}
		
			public Address enterOffPhone(String offphone) {
				enterByXpath(prop.getProperty("Address.enterOffPhone.Xpath"), offphone);
				return this;

			}


}
