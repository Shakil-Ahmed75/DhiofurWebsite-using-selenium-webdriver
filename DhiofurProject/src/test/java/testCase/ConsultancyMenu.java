package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.Consultancy;


public class ConsultancyMenu {
	
public WebDriver driver;
	
	@Test
	public void myConsultancy() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://dhiofur.texrootsourcing.com/");
		
		Consultancy consultancy= new Consultancy(driver);
		Actions action = new Actions(driver);
		action.moveToElement(consultancy.consultantion()).build().perform();
		Thread.sleep(500);
		action.moveToElement(consultancy.subconsultantion()).click();
		Thread.sleep(500);
		driver.quit();
		
	}
}
