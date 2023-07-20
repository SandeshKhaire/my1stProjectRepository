package pomPolicyBazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProfilePage {
	
@FindBy(xpath = "//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")
private WebElement userName;
@FindBy(className = "h_l")
private WebElement logOutButton;

public ProfilePage(WebDriver driver)
   {
	PageFactory.initElements(driver, this);
   }

public String getActualUserName()
   {
	Reporter.log("getting actual username", true);
    String actualUN=userName.getText();
	return actualUN;
   }

public void clickOnLogOutButton()
   {
	Reporter.log("click on LogOutButton", true);
	logOutButton.click();
   }

}
