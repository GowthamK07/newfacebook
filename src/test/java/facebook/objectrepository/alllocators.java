package facebook.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import facebook.base.base;


public class alllocators extends base {
	
	base b = new base ();
	
	public alllocators () {
		
		PageFactory.initElements(b.driver, this);
		
	}
	
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement loginemail ;
	
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement logpass ;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement logclick ;
	
	
	public WebElement getLogpass() {
		return logpass;
	}

	public WebElement getLogclick() {
		return logclick;
	}

	public WebElement getLoginemail() {
		return loginemail;
	}

	

}
