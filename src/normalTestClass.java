import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class normalTestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("7865433221");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//span[@id='central-login-sign-in-with-password-span'])[2]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
	    Thread.sleep(500);
	    String ErrorText=driver.findElement(By.xpath("//span[@id='error-sentotp-in']")).getText();
	System.out.println(ErrorText);
	
	
	}

}
