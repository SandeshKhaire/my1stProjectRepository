package basePolicyBazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utilityPolicyBazar.Utility;

public class Base {
	 protected WebDriver driver;
	public void launchBrowser() throws InterruptedException 
	{
	   driver = new ChromeDriver();
	   Reporter.log("Launching browser", false);
	   driver.get("https://www.policybazaar.com/");
	   Utility.waitTime(1000);
	   driver.manage().window().maximize();
	  
	}
	
	public void closeBrowser() throws InterruptedException
	{
		driver.close();
		Utility.waitTime(1000);
	}

}
