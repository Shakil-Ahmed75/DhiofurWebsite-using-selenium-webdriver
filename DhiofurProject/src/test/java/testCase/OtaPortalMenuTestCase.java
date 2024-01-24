package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.OtaPortal;

public class OtaPortalMenuTestCase {

 public WebDriver driver;
	
	@Test
	public void ota() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://dhiofur.texrootsourcing.com/");
		
		OtaPortal otaportal= new OtaPortal(driver);
		otaportal.otaPortalClick().click();
		Thread.sleep(400);
		driver.quit();
	}
	
	
}
