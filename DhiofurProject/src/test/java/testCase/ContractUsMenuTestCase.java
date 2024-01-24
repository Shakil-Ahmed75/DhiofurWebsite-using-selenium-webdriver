package testCase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.ContactUs;
import pageObjectModel.ContractMessage;


public class ContractUsMenuTestCase {

	 public WebDriver driver;
		
		@Test
		public void contract() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			driver.get("https://dhiofur.texrootsourcing.com/");
			
			ContactUs contactus= new ContactUs(driver);
			contactus.contractUsClick().click();
			Thread.sleep(200);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)","");
			
			ContractMessage contractmessage= new ContractMessage(driver);
			contractmessage.name().sendKeys("shakil Ahmed");
			contractmessage.email().sendKeys("shakilahmed@gmail.com");
			contractmessage.phone().sendKeys("0179890244");
			contractmessage.address().sendKeys("53/2 Shukrabad Dhanomdi Dhaka");
			contractmessage.submitted().click();
			driver.quit();
		}
		
	
}
