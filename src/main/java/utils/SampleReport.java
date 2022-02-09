package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {

	@Test
	public void generateReport() {
		
		//start report
		ExtentReports report = new ExtentReports("./reports/result.html", false);
		
		//start Test
		
		ExtentTest test = report.startTest("TC001", "To verify IRCTC Registration");
		
		test.assignAuthor("");
		test.assignCategory("");
		
		//log test steps
		test.log(LogStatus.PASS, "The browser launched with given url");
		test.log(LogStatus.PASS, "The browser launched with given url");
		test.log(LogStatus.PASS, "The browser launched with given url");
		test.log(LogStatus.PASS, "The browser launched with given url");
		
		
		//end test
		
		report.endTest(test);
		
		//end report
		
		report.flush();
	}
}
