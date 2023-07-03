package facebook.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.facebook.frontPage;

import io.github.bonigarcia.wdm.WebDriverManager;



public class base  {
	
  public static WebDriver driver;
	
	
public void  launch () {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	
	
}

public void inputtext (WebElement e,String text) {
	
	e.sendKeys(text);
	
}

public void choose (WebElement e) {
	e.click();
	
}






}
