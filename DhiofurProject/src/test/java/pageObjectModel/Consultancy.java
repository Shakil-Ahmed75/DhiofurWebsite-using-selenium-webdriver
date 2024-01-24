package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Consultancy {
     WebDriver driver;
     public Consultancy(WebDriver driver) {
    	 this.driver = driver;
    	 PageFactory.initElements(driver,this);	 
     }
     
     @FindBy(xpath = "//div[@class='header__wrap stricky original']//div[@class='container']//div[@class='header__inner ul_li_between']//div[@class='main-menu__wrap ul_li navbar navbar-expand-lg']//nav[@class='main-menu collapse navbar-collapse']//ul//li[@class='menu-item-has-children']//a[@href='#!']")
     WebElement consultancyXpath;
     
     @FindBy(xpath ="/html[1]/body[1]/div[3]/header[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[9]/ul[1]/li[1]/a[1]/span[1]")
     WebElement subConsultancyXpath;
     
     public WebElement consultantion() {
		return consultancyXpath;
	}
     public   WebElement subconsultantion() {
    	 return subConsultancyXpath;
	}
 
}
