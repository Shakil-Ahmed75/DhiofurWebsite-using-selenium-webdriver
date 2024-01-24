package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContractMessage {
	WebDriver driver;

	public ContractMessage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}

	@FindBy(xpath ="//input[@placeholder='Enter Your Name']")
	WebElement nameXapth;
	
	@FindBy(xpath ="//input[@placeholder='Enter Your Email']")
	WebElement emailXpath;
	
	@FindBy(xpath ="//input[@placeholder='Enter Your Phone Number']")
	WebElement phoneXpath;
	
	@FindBy(xpath ="//textarea[@placeholder='Enter Your Address']")
	WebElement addressXpath;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement submitXpath;
	
	
	public WebElement name() {
		return nameXapth;
	}
	public WebElement email() {
	 return	emailXpath;	
	}
	
	public WebElement phone() {
		return phoneXpath;	
	}
	
	public WebElement address() {
		return addressXpath;
	}
	
	public WebElement submitted() {
		return submitXpath;
	}
	
	
	
	
	
	
	
	
	
	
	
}
