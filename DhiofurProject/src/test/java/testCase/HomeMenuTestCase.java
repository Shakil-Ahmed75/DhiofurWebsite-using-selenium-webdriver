package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.HomePage;

public class HomeMenuTestCase {

	public WebDriver driver;
   
	@Test
	public void homeClick() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://dhiofur.texrootsourcing.com/");
		HomePage homepage = new HomePage(driver);
		 homepage.myhome().click();
		 Thread.sleep(400);
		 driver.quit();
	}
}
