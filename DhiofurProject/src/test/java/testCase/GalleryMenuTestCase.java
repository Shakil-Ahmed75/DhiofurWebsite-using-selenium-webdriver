 package testCase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.Gallery;

public class GalleryMenuTestCase {
	 public WebDriver driver;
	 @Test
	 public void gallery() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			driver.get("https://dhiofur.texrootsourcing.com/");
			
			Gallery gly= new Gallery(driver);
			gly.galleryClick().click();
			Thread.sleep(400);
			driver.quit();
			
	}
	
}
