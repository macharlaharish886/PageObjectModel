package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {

	public RemoteWebDriver driver;
	public static Properties prop;
	
	public void loadObjects() {
		try {
			prop=new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}
		
	}
	
	public void unloadObjects() {
		prop=null;
	}
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//System.out.println("The browser "+browser+" is been launched using the given "+url+" sucessfully");
			
			reportStep("The browser "+browser+" is been launched using the given "+url+" sucessfully", "pass");
			
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to the error of session not created");
			
			reportStep("The browser "+browser+" is not launched due to the error of session not created", "fail");
			
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to invalid given argument error");
			
			reportStep("The browser "+browser+" is not launched due to invalid given argument error", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			
			reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
			
		}
		}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with Id "+idValue+" is printed with the data "+data+"");
			
			reportStep("The element with Id "+idValue+" is printed with the data "+data+"", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id "+idValue+" is not found in the dom");
			
			reportStep("The element with Id "+idValue+" is not found in the dom","fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+idValue+" is not visible in the application");
			
			reportStep("The element with Id \"+idValue+\" is not visible in the application","fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+idValue+" is not interactable in the application");
			
			reportStep("The element with Id "+idValue+" is not interactable in the application","fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+idValue+" is not stable in the application");
			
			reportStep("The element with Id "+idValue+" is not stable in the application","fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+idValue+" is not printed with data "+data+" due to unknown error");
			
			reportStep("The element with Id "+idValue+" is not printed with data "+data+" due to unknown error","fail");
			
		} 
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with Name "+nameValue+" is printed with the data "+data+"");
			
			reportStep("The element with Name "+nameValue+" is printed with the data "+data+"","pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Name "+nameValue+" is not found in the dom");
			
			reportStep("The element with Name "+nameValue+" is not found in the dom","fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+nameValue+" is not visible in the application");
			
			reportStep("The element with Name "+nameValue+" is not visible in the application","fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+nameValue+" is not interactable in the application");
			
			reportStep("The element with Name "+nameValue+" is not interactable in the application","fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+nameValue+" is not stable in the application");
			
			reportStep("The element with Name "+nameValue+" is not stable in the application","fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+nameValue+" is not printed with data "+data+" due to unknown error");
			
			reportStep("The element with Name "+nameValue+" is not printed with data "+data+" due to unknown error","fail");
			
		} 		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with XPath "+xpathValue+" is printed with data "+data+"");
			
			reportStep("The element with XPath "+xpathValue+" is printed with data "+data+"","pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath "+xpathValue+" is not found in the dom");
			
			reportStep("The element with XPath "+xpathValue+" is not found in the dom","fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathValue+" is not visible in the application");

			reportStep("The element with XPath "+xpathValue+" is not visible in the application","fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathValue+" is not interactable in the application");

			reportStep("The element with XPath "+xpathValue+" is not interactable in the application","fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathValue+" is not stable in the application");

			reportStep("The element with XPath "+xpathValue+" is not stable in the application","fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathValue+" is not printed with data "+data+" due to unknown error");

			reportStep("The element with XPath "+xpathValue+" is not printed with data "+data+" due to unknown error","fail");
			
		} 
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page actualTitle "+actualTitle+" is matched with the title "+title+"");
				 
				reportStep("The title of the page actualTitle "+actualTitle+" is matched with the title "+title+"", "pass");
				
			} else {
				//System.err.println("The tile of the page actualTitle "+actualTitle+" is not matched with the "+title+"");
				
				reportStep("The tile of the page actualTitle "+actualTitle+" is not matched with the "+title+"", "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page is not displayed due to unknown error");
			
			reportStep("The title of the page is not displayed due to unknown error", "fail");
		}
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if (actualText.equals(text)) {
				//System.out.println("The text with the id "+id+" with the actualText "+actualText+" is equal to the expected text "+text+"");
				
				reportStep("The text with the id "+id+" with the actualText "+actualText+" is equal to the expected text "+text+"", "pass");
				
			} else {
				//System.err.println("The text with the id "+id+" with the actualText "+actualText+" is not equal to the expected text "+text+"");
				
				reportStep("The text with the id "+id+" with the actualText "+actualText+" is not equal to the expected text "+text+"", "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text "+text+" with id "+id+" is not found in dom");
			
			reportStep("The text "+text+" with id "+id+" is not found in dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" with id "+id+" is not visible in the application");
			
			reportStep("The text "+text+" with id "+id+" is not visible in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" with id "+id+" is not interactable in the application");
			
			reportStep("The text "+text+" with id "+id+" is not interactable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" with id "+id+" is not stable in the application");
			
			reportStep("The text "+text+" with id "+id+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" with id "+id+" is not displayed with text "+text+" due to unknown error");
			
			reportStep("The text "+text+" with id "+id+" is not displayed with text "+text+" due to unknown error", "fail");
			
		} 
	}
	
	public void verifyTextByName(String name, String text) {
		// TODO Auto-generated method stub
				try {
					String actualText = driver.findElementByName(name).getText();
					if (actualText.equals(text)) {
						//System.out.println("The text with name "+name+" with the actualText "+actualText+" is equal to the expected text "+text+"");
						
						reportStep("The text with name "+name+" with the actualText "+actualText+" is equal to the expected text "+text+"", "pass");
						
					} else {
						//System.err.println("The text with name "+name+" with the actualText "+actualText+" is not equal to the expected text "+text+"");
						
						reportStep("The text with name "+name+" with the actualText "+actualText+" is not equal to the expected text "+text+"", "fail");
						
					}
				} catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//System.err.println("The text "+text+" with name "+name+" is not found in dom");
					
					reportStep("The text "+text+" with name "+name+" is not found in dom", "fail");
					
				} catch (ElementNotVisibleException e) {
					// TODO: handle exception
					//System.err.println("The text "+text+" with name "+name+" is not visible in the application");
					
					reportStep("The text "+text+" with name "+name+" is not visible in the application","fail");
					
				} catch (ElementNotInteractableException e) {
					// TODO: handle exception
					//System.err.println("The text "+text+" with name "+name+" is not interactable in the application");
					
					reportStep("The text "+text+" with name "+name+" is not interactable in the application", "fail");
					
				} catch (StaleElementReferenceException e) {
					// TODO: handle exception
					//System.err.println("The text "+text+" with name "+name+" is not stable in the application");
					
					reportStep("The text "+text+" with name "+name+" is not stable in the application", "fail");
					
				} catch (WebDriverException e) {
					// TODO: handle exception
					//System.err.println("The text "+text+" with name "+name+" is not displayed with text "+text+" due to unknown error");
					
					reportStep("The text "+text+" with name "+name+" is not displayed with text "+text+" due to unknown error", "fail");
					
				} 
				
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) {
				//System.out.println("The text with xpath "+xpath+" with the actualText "+actualText+" is equal to the expected text "+text+"");
				
				reportStep("The text with xpath "+xpath+" with the actualText "+actualText+" is equal to the expected text "+text+"", "pass");
				
			} else {
				//System.err.println("The text with xpath "+xpath+" with the actualText "+actualText+" is not equal to the expected text "+text+"");
				
				reportStep("The text with xpath "+xpath+" with the actualText "+actualText+" is not equal to the expected text "+text+"", "fail");
				
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text "+text+" with xpath "+xpath+" is not found in dom");
			
			reportStep("The text "+text+" with xpath "+xpath+" is not found in dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" with xpath "+xpath+" is not visible in the application");
			
			reportStep("The text "+text+" with xpath "+xpath+" is not visible in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" with xpath "+xpath+" is not interactable in the application");
			
			reportStep("The text "+text+" with xpath "+xpath+" is not interactable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" with xpath "+xpath+" is not stable in the application");
			
			reportStep("The text "+text+" with xpath "+xpath+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" with xpath "+xpath+" is not displayed with text "+text+" due to unknown error");
			
			reportStep("The text "+text+" with xpath "+xpath+" is not displayed with text "+text+" due to unknown error", "fail");
			
		} 
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.contains(text)) {
				//System.out.println("The text with xpath "+xpath+" with the actualText "+actualText+" contains the expected text "+text+"");
				
				reportStep("The text with xpath "+xpath+" with the actualText "+actualText+" contains the expected text "+text+"", "pass");
				
			} else {
				//System.err.println("The text with xpath "+xpath+" with the actualText "+actualText+" does not contain the expected text "+text+"");
				
				reportStep("The text with xpath "+xpath+" with the actualText "+actualText+" does not contain the expected text "+text+"", "fail");
				
				
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text "+text+" with xpath "+xpath+" is not found in dom");
			
			reportStep("The text "+text+" with xpath "+xpath+" is not found in dom", "fail");
			
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" with xpath "+xpath+" is not visible in the application");
			
			reportStep("The text "+text+" with xpath "+xpath+" is not visible in the application", "fail");
			
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" with xpath "+xpath+" is not interactable in the applicaation");
			
			reportStep("The text "+text+" with xpath "+xpath+" is not interactable in the applicaation", "fail");
			
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The text "+text+" with xpath "+xpath+" is not stable in the application");
			
			reportStep("The text "+text+" with xpath "+xpath+" is not stable in the application", "fail");
			
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The text "+text+" with xpath "+xpath+" is not displayed with text "+text+" due to unknown error");
			
			reportStep("The text "+text+" with xpath "+xpath+" is not displayed with text "+text+" due to unknown error", "fail");
			
			
		} 
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
		//	System.out.println("The element with id "+id+" is  clicked successfully");
			
			reportStep("The element with id "+id+" is  clicked successfully", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in dom");
			
			reportStep("The element with id "+id+" is not found in dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			
			reportStep("The element with id "+id+" is not visible in the application", "fail");
			
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not click intercepted in the application");
			
			reportStep("The element with id "+id+" is not click intercepted in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			
			reportStep("The element with id "+id+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked due to unknown error");
			
			reportStep("The element with id "+id+" is not clicked due to unknown error", "fail");
			
		} 
		
	}

	public void clickByPartialLink(String link) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(link).click();
			//System.out.println("The element with PartialLink "+link+" is  clicked successfully");
			
			reportStep("The element with PartialLink "+link+" is  clicked successfully", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with PartialLink "+link+" is not found in dom");
			
			reportStep("The element with PartialLink "+link+" is not found in dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with PartialLink "+link+" is not visible in the application");
			
			reportStep("The element with PartialLink "+link+" is not visible in the application", "fail");
			
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with PartialLink "+link+" is not click intercepted in the application");
			
			reportStep("The element with PartialLink "+link+" is not click intercepted in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with PartialLink "+link+" is not interactable in the application");
			
			reportStep("The element with PartialLink "+link+" is not interactable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with PartialLink "+link+" is not stable in the application");
			
			reportStep("The element with PartialLink "+link+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with PartialLink "+link+" is not clicked due to unknown error");
			
			reportStep("The element with PartialLink "+link+" is not clicked due to unknown error", "fail");
			
		} 
		
	}
	
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
		//	System.out.println("The element with ClassName "+classVal+" is matched and the click has been performed");
			
			reportStep("The element with ClassName "+classVal+" is matched and the click has been performed", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with ClassName "+classVal+" is not found in dom");
			
			reportStep("The element with ClassName "+classVal+" is not found in dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.out.println("The element with ClassName "+classVal+" is not visible in the application");
			
			reportStep("The element with ClassName "+classVal+" is not visible in the application", "fail");
			
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not click intercepted in the application");
			
			reportStep("The element with ClassName "+classVal+" is not click intercepted in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not intercepted in the application");
			
			reportStep("The element with ClassName "+classVal+" is not intercepted in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with ClassName "+classVal+" is not stable in the application");
			
			reportStep("The element with ClassName "+classVal+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not clicked due to unknown error");
			
			reportStep("The element with ClassName "+classVal+" is not clicked due to unknown error", "fail");
			
		} 
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with Name "+name+" is matched and click has been performed");
			
			reportStep("The element with Name "+name+" is matched and click has been performed", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Name "+name+" is not found in dom");
			
			reportStep("The element with Name "+name+" is not found in dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+name+" is not visible in the application");
			
			reportStep("The element with Name "+name+" is not visible in the application", "fail");
			
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with Name "+name+" is not click intercepted in the application");
			
			reportStep("The element with Name "+name+" is not click intercepted in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with Name "+name+" is not intercepted in the application");
			
			reportStep("The element with Name "+name+" is not intercepted in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The elemet with Name "+name+" is not stable in the application");
			
			reportStep("The elemet with Name "+name+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with Nmae "+name+" is not clicked due to unknown error");
			
			reportStep("The element with Nmae "+name+" is not clicked due to unknown error", "fail");
			
		} 
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
		//	System.out.println("The element with LinkText "+name+" is matched and click has been performed");
			
			reportStep("The element with LinkText "+name+" is matched and click has been performed", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText "+name+" is not found in dom");
			
			reportStep("The element with LinkText "+name+" is not found in dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not visible in the application");
			
			reportStep("The element with LinkText "+name+" is not visible in the application", "fail");
			
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with LinkText "+name+" is not click intercepted in the application");
			
			reportStep("The element with LinkText "+name+" is not click intercepted in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not intercepted in the application");
			
			reportStep("The element with LinkText "+name+" is not intercepted in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not stable in the application");
			
			reportStep("The element with LinkText "+name+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The elemet with LinkText "+name+" is not clicked due to unknown error");
			
			reportStep("The elemet with LinkText "+name+" is not clicked due to unknown error", "fail");
			
		} 
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
		//	System.out.println("The element with LinkText "+name+" is matched and the click has been performed");
			
			reportStep("The element with LinkText "+name+" is matched and the click has been performed", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with LinkText "+name+" is not foun in dom");
			
			reportStep("The element with LinkText "+name+" is not foun in dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not visible in the application");
			
			reportStep("The element with LinkText "+name+" is not visible in the application", "fail");
			
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with LinkText "+name+" is not click interceptable in the application");
			
			reportStep("The element with LinkText "+name+" is not click interceptable in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with LinkText "+name+" is not interceptable in the application");
			
			reportStep("The element with LinkText "+name+" is not interceptable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with LinkText "+name+" is not stable in the application");
			
			reportStep("The element with LinkText "+name+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with LinkText "+name+" is not clicked due to unknown error");
			
			reportStep("The element with LinkText "+name+" is not clicked due to unknown error", "fail");
			
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
	//		System.out.println("The element with XPath "+xpathVal+" is matched and the click has been performed");
			
			reportStep("The element with XPath "+xpathVal+" is matched and the click has been performed", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath "+xpathVal+" is not found in the dom");
			
			reportStep("The element with XPath "+xpathVal+" is not found in the dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
	//		System.err.println("The element with XPath "+xpathVal+" is not visible in the application");
			
			reportStep("The element with XPath "+xpathVal+" is not visible in the application", "fail");
			
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with XPath "+xpathVal+" is not click intercepted in the application");
			
			reportStep("The element with XPath "+xpathVal+" is not click intercepted in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with XPath "+xpathVal+" is not interceptable in the application");
			
			reportStep("The element with XPath "+xpathVal+" is not interceptable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathVal+" is not stable in the application");
			
			reportStep("The element with XPath "+xpathVal+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with Xpath "+xpathVal+" is not clicked due to unknown error");
			
			reportStep("The element with Xpath "+xpathVal+" is not clicked due to unknown error", "fail");
			
		}
		
	}
	
	public void clickByXpath(String xpathVal, String option) {
		// TODO Auto-generated method stub
		try {
			if(xpathVal.contains("option")) {
				
			xpathVal = xpathVal.replace("+option+",option);
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with XPath '"+xpathVal+"' has been loacted and clicked");
			reportStep("The element with XPath '"+xpathVal+"' has been loacted and clicked", "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath '"+xpathVal+"' is not located in DOM");
			reportStep("The element with XPath '"+xpathVal+"' is not located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpathVal+"' is not visible in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpathVal+"' is an unstabl element in the application");
			reportStep("The element with XPath '"+xpathVal+"' is an unstabl element in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The element with XPath '"+xpathVal+"' is not clickable in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not clickable in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpathVal+"' is not interactable in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with XPath '"+xpathVal+"' connot be clicked for unkown reason");
			reportStep("The element with XPath '"+xpathVal+"' connot be clicked for unkown reason", "fail");
		}
		
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with Xpath "+xpathVal+" is matched and the click has been performed");
			
			reportStep("The element with Xpath "+xpathVal+" is matched and the click has been performed", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath "+xpathVal+" is not found in the dom");
			
			reportStep("The element with XPath "+xpathVal+" is not found in the dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathVal+" is not visible in the application");
			
			reportStep("The element with XPath "+xpathVal+" is not visible in the application", "fail");
			
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathVal+" is not click intercepted in the application");
			
			reportStep("The element with XPath "+xpathVal+" is not click intercepted in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpathVal+" is not interceptable in the application");
			
			reportStep("The element with Xpath "+xpathVal+" is not interceptable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with XPath "+xpathVal+" is not stable in the application");
			
			reportStep("The element with XPath "+xpathVal+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathVal+" is not clicked due to unknown error");
			
			reportStep("The element with XPath "+xpathVal+" is not clicked due to unknown error", "fail");
			
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualText = null;
		try {
			actualText = driver.findElementById(idVal).getText();
		//	System.out.println("The element with Id "+idVal+" is located and holding the text "+actualText+"");
			
			reportStep("The element with Id "+idVal+" is located and holding the text "+actualText+"", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found in the dom");
			
			reportStep("The element with id "+idVal+" is not found in the dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element witn id "+idVal+" is not visible in the application");

			
			reportStep("The element witn id "+idVal+" is not visible in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not interctable in the application");
			
			reportStep("The element with id "+idVal+" is not interctable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with id "+idVal+" is not stable in the application");
			
			reportStep("The element with id "+idVal+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not returned the text "+actualText+" due to unknown error");
			
			reportStep("The element with id "+idVal+" is not returned the text "+actualText+" due to unknown error", "fail");
			
		}
		
		return actualText;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actualText = null;
		try {
			actualText = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with XPath "+xpathVal+" is located and returning the text "+actualText+"");
			
			reportStep("The element with XPath "+xpathVal+" is located and returning the text "+actualText+"", "pass");
			
			return actualText;
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath "+xpathVal+" is not found in the dom");
			
			reportStep("The element with XPath "+xpathVal+" is not found in the dom", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with XPath "+xpathVal+" is not visible in the application");
			
			reportStep("The element with XPath "+xpathVal+" is not visible in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathVal+" is not interctable in the application");
			
			reportStep("The element with XPath "+xpathVal+" is not interctable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with XPath "+xpathVal+" is not stable in the application");
			
			reportStep("The element with XPath "+xpathVal+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with XPath "+xpathVal+" is not not returned the text "+actualText+" due to unknown error");
			
			reportStep("The element with XPath "+xpathVal+" is not not returned the text "+actualText+" due to unknown error", "fail");
			
		}
		return actualText; 
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementById(id));
			select.selectByVisibleText(value);
			//System.out.println("The element with Id "+id+" is located and selected the value "+value+"");
			
			reportStep("The element with Id "+id+" is located and selected the value "+value+"", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id "+id+" is not found in the dom");
			
			reportStep("The element with Id "+id+" is not found in the dom", "fail");
			
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
		//	System.err.println("The element with Id "+id+" cannot be selected in the application");
			
			reportStep("The element with Id "+id+" cannot be selected in the application", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with Id "+id+" is not visible in the application");
				
				reportStep("The element with Id "+id+" is not visible in the application", "fail");
				
		} catch (ElementNotInteractableException  e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+id+" is not interactable in the application");
			
			reportStep("The element with Id "+id+" is not interactable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+id+" is not stable in the application");
			
			reportStep("The element with Id "+id+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with Id "+id+" is not selected the value "+value+" due to unknown error");
			
			reportStep("The element with Id "+id+" is not selected the value "+value+" due to unknown error", "fail");
			
		}
	}
	
	public void selectVisibileTextByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementByName(name));
			select.selectByVisibleText(value);
		//	System.out.println("The element with name "+name+" is located and selected the value "+value+"");
			
			reportStep("The element with name "+name+" is located and selected the value "+value+"", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the dom");
			
			reportStep("The element with name "+name+" is not found in the dom", "fail");
			
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" cannot be selected in the application");
			
			reportStep("The element with name "+name+" cannot be selected in the application", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with name "+name+" is not visible in the application");
				
				reportStep("The element with name "+name+" is not visible in the application", "fail");
				
		} catch (ElementNotInteractableException  e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			
			reportStep("The element with name "+name+" is not interactable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with name "+name+" is not stable in the application");
			
			reportStep("The element with name "+name+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selected the value "+value+" due to unknown error");
			
			reportStep("The element with name "+name+" is not selected the value "+value+" due to unknown error", "fail");
			
		}
		
	}
	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementByXPath(xpath));
			select.selectByVisibleText(value);
			//System.out.println("The element with Xpath "+xpath+" is located and selected the value "+value+"");
			
			reportStep("The element with Xpath "+xpath+" is located and selected the value "+value+"", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the dom");
			
			reportStep("The element with xpath "+xpath+" is not found in the dom", "fail");
			
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" cannot be selected in the application");
			
			reportStep("The element with xpath "+xpath+" cannot be selected in the application", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with Xpath "+xpath+" is not interactable in the application");
			
			reportStep("The element with Xpath "+xpath+" is not interactable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath "+xpath+" is not stable in the application");
			
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with xpath "+xpath+" is not selected the value "+value+" due to unknown error");
			
			reportStep("The element with xpath "+xpath+" is not selected the value "+value+" due to unknown error", "fail");
			
		} 
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementById(id));
			select.selectByIndex(value);
			//System.out.println("The element with Id "+id+" is loacted and selected the value "+value+"");
			
			reportStep("The element with Id "+id+" is loacted and selected the value "+value+"", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id "+id+" is not found in the dom");
			
			reportStep("The element with Id "+id+" is not found in the dom", "fail");
			
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
		//	System.err.println("The element with Id "+id+" cannot be selected in the application");
			
			reportStep("The element with Id "+id+" cannot be selected in the application", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+id+" is not visibile in the application");
			
			reportStep("The element with Id "+id+" is not visibile in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with Id "+id+" is not interactable in the application");
			
			reportStep("The element with Id "+id+" is not interactable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+id+" is not stable in the application");
			
			reportStep("The element with Id "+id+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with id "+id+" is not selected the value "+value+" due to unknown error");
			
			reportStep("The element with id "+id+" is not selected the value "+value+" due to unknown error", "fail");
			
		} 
	}
	
	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementByXPath(xpath));
			select.selectByValue(value);
			//System.out.println("The element with xpath "+xpath+" is located and selected the value "+value+"");
			
			reportStep("The element with xpath "+xpath+" is located and selected the value "+value+"", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
	//		System.err.println("The element with xpath "+xpath+" is not found in the dom");
			
			reportStep("The element with xpath "+xpath+" is not found in the dom","fail");
			
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.out.println("The element with xpath "+xpath+" cannot be selected in the application");
			
			reportStep("The element with xpath "+xpath+" cannot be selected in the application","fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visibile in the application");
			
			reportStep("The element with xpath "+xpath+" is not visibile in the application","fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			
			reportStep("The element with xpath "+xpath+" is not visible in the application","fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			
			reportStep("The element with xpath "+xpath+" is not stable in the application","fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is noe selected the value "+value+" due to unknown error");
			
			reportStep("The element with xpath "+xpath+" is noe selected the value "+value+" due to unknown error","fail");
			
		} 
	}
	
	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementById(id));
			select.selectByValue(value);
		//	System.out.println("The element with id "+id+" is located and selected the value "+value+"");
			
			reportStep("The element with id "+id+" is located and selected the value "+value+"", "pass");
			
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with id "+id+" is not found in the dom");
			
			reportStep("The element with id "+id+" is not found in the dom", "fail");
			
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.out.println("The element with id "+id+" cannot be selected in the application");
			
			reportStep("The element with id "+id+" cannot be selected in the application", "fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visibile in the application");
			
			reportStep("The element with id "+id+" is not visibile in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			
			reportStep("The element with id "+id+" is not visible in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			
			reportStep("The element with id "+id+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is noe selected the value "+value+" due to unknown error");
			
			reportStep("The element with id "+id+" is noe selected the value "+value+" due to unknown error", "fail");
		}
	}

	public void selectValueByName(String name, String value) {
			// TODO Auto-generated method stub
		
		try {
			Select select = new Select(driver.findElementByName(name));
			select.selectByValue(name);
			//System.out.println("The element with name "+name+" is located and selected the value "+value+"");
			
			reportStep("The element with name "+name+" is located and selected the value "+value+"", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the dom");
			
			reportStep("The element with name "+name+" is not found in the dom", "fail");
			
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" cannot be selected in the application");
			
			reportStep("The element with name "+name+" cannot be selected in the application","fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with name "+name+" is not visibile in the application");
			
			reportStep("The element with name "+name+" is not visibile in the application","fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with name "+name+" is not visible in the application");
			
			reportStep("The element with name "+name+" is not visible in the application","fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application");
			
			reportStep("The element with name "+name+" is not stable in the application","fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is noe selected the value "+value+" due to unknown error");
			
			reportStep("The element with name "+name+" is noe selected the value "+value+" due to unknown error","fail");
		}
			
		} 
		
		
		


	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			for(String eachHandle : windowHandles) {
				driver.switchTo().window(eachHandle);
				break;
			}
	//		System.out.println("The focus of the driver is been changed to the parent window");
			
			reportStep("The focus of the driver is been changed to the parent window", "pass");
			
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The focus of the driver is not changed to the parent window due to no window in the application");
			
			reportStep("The focus of the driver is not changed to the parent window due to no window in the application", "fail");
			
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The focus of the driver is not changed to the parent window due to unknown error");
			
			reportStep("The focus of the driver is not changed to the parent window due to unknown error", "fail");
			
		}
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String eachHandle : windowHandles) {
				driver.switchTo().window(eachHandle);	
			}
			//System.out.println("The focus of the driver is been changed to the children window");
			
			reportStep("The focus of the driver is been changed to the children window", "pass");
			
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The focus of the driver is not changed to the children window due to no window in the application");
			
			reportStep("The focus of the driver is not changed to the children window due to no window in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The focus of the driver is not changed to the parent window due to unknown error");
			
			reportStep("The focus of the driver is not changed to the parent window due to unknown error", "fail");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The focus of the driver is changed into the alert and accepts the alert");
			
			reportStep("The focus of the driver is changed into the alert and accepts the alert", "pass");
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The alert is not found in the application to accept it");
			
			reportStep("The alert is not found in the application to accept it", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not accepted due to unknown error");
			
			reportStep("The alert is not accepted due to unknown error", "fail");
		} 
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
		//System.out.println("The focus of the driver is changed into the alerts and dismisses the alert");
			
			reportStep("The focus of the driver is changed into the alerts and dismisses the alert", "pass");
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The alert is not found in the application");
			
			reportStep("The alert is not found in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The alert is not dismissed due to unknown error");
			
			reportStep("The alert is not dismissed due to unknown error", "fail");
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText = null;
		try {
			alertText = driver.switchTo().alert().getText();
		//	System.out.println("The driver focus is switched to alert and the alertText "+alertText+" is printed");
			
			reportStep("The driver focus is switched to alert and the alertText "+alertText+" is printed", "pass");
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not found in the dom");
			
			reportStep("The alert is not found in the dom", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not printed due to unknown error");
			
			reportStep("The alert is not printed due to unknown error", "fail");
			
		} 
		return alertText;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number=0;
		
		try {
			number= (long)(Math.floor(Math.random()*100000000)+10000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);
			//System.out.println("The screenshot is taken  from browser and saved as snap in dest path");
			
		//	reportStep("The screenshot is taken  from browser and saved as snap in dest path", "pass");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The screenshot is not taken due to input output exception");
			
			reportStep("The screenshot is not taken due to input output exception", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The screenshot is not taken due to unknown error");
			
			reportStep("The screenshot is not taken due to unknown error", "fail");
			
		}	
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
		//	System.out.println("The browser is closed");
			
			reportStep("The browser is closed","pass", false );
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The Broswer is not closed due to unknown error");
			
			reportStep("The Broswer is not closed due to unknown error", "fail", false);
		}
		
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			
			driver.quit();
			//System.out.println("All the browsers are closed");
			
			reportStep("All the browsers are closed", "pass", false);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The broswers are not closed due to unknown error");
			
			reportStep("The broswers are not closed due to unknown error", "fail", false);
			
		} 
		
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("wait property is been used");
			
			reportStep("wait property is been used", "pass");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The wait time is interrupted");
			
			reportStep("The wait time is interrupted", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("There is no wait time due to unknown error");
			
			reportStep("There is no wait time due to unknown error", "fail");
			
		}
	}

	public void pageDown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		//	System.out.println("The page is scrolled down");
			
			reportStep("The page is scrolled down", "pass");
			
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page is not scrolled down due to unknown error");
			
			reportStep("The page is not scrolled down due to unknown error", "fail");
		
	}
	}
	public void pageUp() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_UP);
			//System.out.println("The page is scrolled up");
			
			reportStep("The page is scrolled up", "pass");
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page is not scrolled up due to unknown error");
			
			reportStep("The page is not scrolled down due to unknown error", "fail");
		}
			
		
	}
	
	public void mouseHoverByXPath(String name) {
		
		try {
			WebElement value = driver.findElementByXPath(name);
			
			Actions builder = new Actions(driver);
			
			builder.moveToElement(value).perform();
			
		//	System.out.println("The mouse has been moved to required element"+name+"");
			
			reportStep("The mouse has been moved to required element"+name+"", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+name+" is not found in the dom");
			
			reportStep("The element with xpath "+name+" is not found in the dom", "fail");
			
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+name+" cannot be selected in the application");
			
			reportStep("The element with xpath "+name+" cannot be selected in the application","fail");
			
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+name+" is not visible in the application");
			
			reportStep("The element with xpath "+name+" is not visible in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+name+" is not interactable in the application");
			
			reportStep("The element with Xpath "+name+" is not interactable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+name+" is not stable in the application");
			
			reportStep("The element with xpath "+name+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+name+" is not selected  due to unknown error");
			
			reportStep("The element with xpath "+name+" is not selected  due to unknown error", "fail");
			
		
	}

}
	}