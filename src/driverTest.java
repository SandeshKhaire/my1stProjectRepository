import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	//	WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();

driver.get("https://www.facebook.com/");
Thread.sleep(3000);
driver.manage().window().maximize();
Thread.sleep(2000);
TakesScreenshot ts =(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File desti = new File("C:\\Users\\ssampat\\Pictures\\Sandesh\\sc.png");
org.openqa.selenium.io.FileHandler.copy(source, desti);
Thread.sleep(3000);
//LocalDateTime ldt = new LocalDateTime().now(null)
driver.close();

//driver.close();

	}

}
