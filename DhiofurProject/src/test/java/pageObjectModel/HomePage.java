package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 WebDriver driver;
	 
	 public HomePage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	 }
	 @FindBy(xpath="//div[@class='header__wrap stricky original']//li[@class='active']//a")
	 WebElement homeload;
	
	public WebElement myhome() {
	 return homeload;

	}
}
