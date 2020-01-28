package qaclickacademy.Mavenjava2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class OpenBrowser {
	WebDriver driver;
	
	@Test //(enabled=false) 
	public void openB() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.linkedin.com");
	}
	
	@AfterTest
	public void closeB() {
		driver.close();
	}
}
