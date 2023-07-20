package utilityPolicyBazar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {

	public static void takeScreenshot(WebDriver driver, String fileName) throws IOException 
	{
		Reporter.log("Taking Screenshot......", true);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ssampat\\eclipse-workspace\\PracticeSeleniumProj\\TestCaseDataSelenium\\Screenshot\\"+fileName+".png");
	    FileHandler.copy(src, dest);
	    Reporter.log("Taken Screenshot and Saved at -----> " +dest, true );
	
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element) 
	{
		Reporter.log("Scrolling into view", true);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile = new FileInputStream("C:\\Users\\ssampat\\eclipse-workspace\\PracticeSeleniumProj\\TestCaseDataSelenium\\TestCaseData.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	    Reporter.log("Reading Data from Excel "+row+"Cell Number "+cell, true);
		return value;
	}
	
	public static void waitTime(int waitTimeSec) throws InterruptedException 
	{
		Thread.sleep(waitTimeSec);
		Reporter.log("Waiting for "+waitTimeSec+" milisec.....", false);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
