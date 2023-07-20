package testPolicyBazar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePolicyBazar.Base;
import pomPolicyBazar.HomePage;
import pomPolicyBazar.ProfilePage;
import utilityPolicyBazar.Utility;

public class PB_TC4567_ValidateUserName extends Base{
	
	//pom class che object declare karun thevne
	HomePage home;
	ProfilePage pro;
	
	@BeforeClass
	public void openBrowser() throws InterruptedException
	{
		launchBrowser();
		home = new HomePage(driver);
		pro = new ProfilePage(driver);
	}
	
	@BeforeMethod
	public void loginToPolicyBazaar() throws EncryptedDocumentException, IOException, InterruptedException
	{
	home.clickHomePageOnSignInButton();
	Utility.waitTime(1000);
	home.enterMobileNumber(Utility.readDataFromExcel(0, 0));
	Utility.waitTime(1000);
	home.clickOnSignInWithPassword();
	Utility.waitTime(1000);
	home.enterPassword(Utility.readDataFromExcel(0, 1));
	Utility.waitTime(1000);
	home.clickOnSignInButton();
	Utility.waitTime(2000);
	home.clickOnMyAccount();
	Utility.waitTime(1000);
	home.clickOnMyOrofile();
	Utility.waitTime(1000);
	//we need to switch selenium focus to new tab
	
	Set<String> allID = driver.getWindowHandles();
	ArrayList<String> al = new ArrayList<>(allID);
	String mainTabID = al.get(0);
	String childTabID = al.get(1);
	driver.switchTo().window(childTabID);
	Utility.waitTime(2000);
	}
	
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
  {
	String expUN = Utility.readDataFromExcel(0, 2);  
	String actualUN = pro.getActualUserName();
	Assert.assertEquals(actualUN, expUN,"TC failed, actual and expected username are not matched......!");
    Utility.takeScreenshot(driver, "TCID4567 "+actualUN);
  
  }
  
  @AfterMethod
  public void logOutFromPolicuBazar() throws InterruptedException 
  {
	Utility.waitTime(2000);
	pro.clickOnLogOutButton();
	Utility.waitTime(2000);
  }
  
  @AfterClass
  public void quiteBrowser() throws InterruptedException 
  {
	closeBrowser();  
	Utility.waitTime(3000);
  }
  
  
  
  
}
