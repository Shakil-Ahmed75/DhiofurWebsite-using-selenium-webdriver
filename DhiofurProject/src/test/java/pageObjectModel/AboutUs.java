package pageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
     WebDriver driver;
    public AboutUs(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	} 
      @FindBy(xpath="//body/div[@class='body_wrap']/header[@class='site-header header-style-one']/div[@class='header__wrap stricky original']/div[@class='container']/div[@class='header__inner ul_li_between']/div[@class='main-menu__wrap ul_li navbar navbar-expand-lg']/nav[@class='main-menu collapse navbar-collapse']/ul/li[2]/a[1]")
      WebElement aboutUs;
     public WebElement aboutUsReload() {
    	 return aboutUs;
		
	}
}