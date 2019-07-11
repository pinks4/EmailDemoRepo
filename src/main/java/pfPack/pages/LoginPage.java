package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.base.BasePage;
import pfPack.util.Constants;

public class LoginPage extends BasePage {
	
	
	
	@FindBy(id="lid")
	public WebElement emailField;
	
	@FindBy(id="pwd")
	public WebElement passwordField;
	
	@FindBy(id="signin_submit")
	public WebElement signInButton;
	
	public LoginPage(WebDriver driver,ExtentTest eTest){
		
		this.driver=driver;
		this.eTest=eTest;
		
	}
	
	
	
	public boolean doLogin(){
		
		emailField.sendKeys(Constants.USERNAME);
		eTest.log(LogStatus.INFO, "User entered username succesfully");
		passwordField.sendKeys(Constants.PASSWORD);
		eTest.log(LogStatus.INFO, "User entered password succesfully");
		signInButton.click();
		eTest.log(LogStatus.INFO, "User logged in succesfully");
		
		HomePage homepage=new HomePage(driver,eTest);
		PageFactory.initElements(driver, homepage);
		
	boolean displayStatus=homepage.verifyDisplayOfHomepage();
	return displayStatus;
		
		
		
		
	}

}
