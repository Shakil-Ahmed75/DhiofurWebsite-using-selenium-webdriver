package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.AboutUs;

public class AboutUsMenuTestCase {

	public WebDriver driver;
	
	@Test
	public void aboutClick() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://dhiofur.texrootsourcing.com/");
		
		AboutUs about = new AboutUs(driver);
		about.aboutUsReload().click();
		Thread.sleep(400);
		driver.quit();
	}
	
	
}
