package pfPack.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pfPack.pages.LaunchPage;
import pfPack.tests.base.BaseTest;
import pfPack.util.Constants;

//this is login test
public class LoginTest extends BaseTest {
	
	
	    @Test
		public void testLogin(){
			System.out.println("Start TEst");

			eTest = eReports.startTest("Login Test");
			eTest.log(LogStatus.INFO, "Login Test has started");
			openBrowser(Constants.BROWSER_TYPE);
			
			LaunchPage launchpage= new LaunchPage(driver,eTest);
			PageFactory.initElements(driver, launchpage);
			
			boolean loginStatus=launchpage.gotoLoginPage();
			
		if(loginStatus){
			reportPass("LoginTest test case passed");
		}else {
			reportFail("LoginTest test case failed");
		}
			
	}
	
	@AfterMethod
	public void testClosure(){
		
		if(eReports!=null){
			eReports.endTest(eTest);
			eReports.flush();
			
		}
		if(driver!=null){
			driver.quit();
		}
		
	}

}
