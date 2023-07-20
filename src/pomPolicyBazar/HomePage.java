package pomPolicyBazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage {
	
  @FindBy(className = "sign-in") 
  private WebElement homePageSignInButton;
  @FindBy(xpath = "(//input[@type='number'])[2]")
  private WebElement mobileNumberField;
  @FindBy(xpath = "(//span[text()='Sign in with Password'])[2]")
  private WebElement signInWithPassword;
  @FindBy(name = "password")
  private WebElement passwordField ;
  @FindBy(xpath = "//a[@id='login-in-with-password']")
  private WebElement signInButton ;
  @FindBy(className = "userprofile")
  private WebElement myAccount ;
  @FindBy(xpath = "//span[text()=' My profile ']")
  private WebElement myProfile;
  
  
  public HomePage(WebDriver driver)
  {
	PageFactory.initElements(driver, this);
  }
  
  
	public void clickHomePageOnSignInButton() 
	{
		Reporter.log("Clicking on homepage signIn Button", true);
        homePageSignInButton.click();
	}
	
	public void enterMobileNumber(String mobNum)
	{
		Reporter.log("Entering Mobile Number", true);
		Reporter.log("Entering Mobile Number.....", true);
		mobileNumberField.sendKeys(mobNum);
	}
	
	public void clickOnSignInWithPassword() 
	{
		Reporter.log("Clicking on signIn with password button", true);
	    signInWithPassword.click();	
	}
	
	public void enterPassword(String password)
	{
	    Reporter.log("Entering Password ", true);	
	    passwordField.sendKeys(password);
	}
	
	public void clickOnSignInButton()
	{
		Reporter.log("clicking on signin button", true);
		signInButton.click();
	}
	
	public void clickOnMyAccount() 
	{
		Reporter.log("clicking on MyAccount", true);
		myAccount.click();
	}
	
	public void clickOnMyOrofile() 
	{
       Reporter.log("Clicking on MyProfile", true);
       myProfile.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
    }
