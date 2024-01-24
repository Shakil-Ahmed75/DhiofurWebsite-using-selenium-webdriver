package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blog {
	 WebDriver driver;
	 public Blog(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(xpath = "/html/body/div[3]/header/div[2]/div/div/div[2]/nav/ul/li[5]/a")
     WebElement blogXpath;
	 
	 public WebElement blogClick () {
		 return blogXpath;
		
	}
}
