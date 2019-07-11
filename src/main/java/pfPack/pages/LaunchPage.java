package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.base.BasePage;
import pfPack.util.Constants;

public class LaunchPage extends BasePage {
	
	
	@FindBy(className="zh-customers")
	public WebElement customers;
	
	@FindBy(className="zh-login")
	public WebElement login;
	
	@FindBy(className="zh-support")
	public WebElement support;
	
	@FindBy(className="zh-signup")
	public WebElement SignUp;

	
	//any other locators
	
	
	public LaunchPage(WebDriver driver, ExtentTest eTest) {
		this.driver=driver;
		this.eTest=eTest;
		
	}


	public boolean gotoLoginPage(){
		
		driver.get(Constants.APP_URL);
		eTest.log(LogStatus.INFO, "Application is opened");
		login.click();
		eTest.log(LogStatus.INFO, "User is taken to the login page");
		
		LoginPage loginpage=new LoginPage(driver,eTest);
		PageFactory.initElements(driver, loginpage);
		
		boolean loginUpdate=loginpage.doLogin();
		
		return loginUpdate;
		
		//automation scripts for taking user to login page
		
	}
	
	//any other reusable methods
	
}
