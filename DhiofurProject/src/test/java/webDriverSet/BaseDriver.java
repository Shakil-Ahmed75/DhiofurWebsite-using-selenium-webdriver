package webDriverSet;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	public static WebDriver driver;

	@BeforeSuite
	public void googleChromeDriverSetUp() {
		// setup google chrome
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	


	}

	@AfterSuite
	public void closeSetup() {
		driver.quit();

	}

}
