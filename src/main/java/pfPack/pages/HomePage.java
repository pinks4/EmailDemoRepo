package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import pfPack.base.BasePage;

public class HomePage extends BasePage {
	

	
	@FindBy(xpath="(//p[contains(text(),'CRM')])[1]")
	public WebElement crm;
	
	@FindBy(xpath="(//p[contains(text(),'Projects')])[1]")
	public WebElement projects;
	
	@FindBy(xpath="(//p[contains(text(),'Mail')])[1]")
	public WebElement mail;
	
	@FindBy(xpath="//div[@class='tc']/a/span")
	public WebElement cliq;
	
	public HomePage(WebDriver driver, ExtentTest eTest) {
		this.driver=driver;
		this.eTest=eTest;
		
	}
	
	public boolean verifyDisplayOfHomepage(){
		return(isElementPresent(cliq));
		
		
		
	}
	
	
	
	
	
}
