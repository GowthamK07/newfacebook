package com.facebook;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import facebook.base.base;
import facebook.objectrepository.alllocators;


public class frontPage extends base  {
	
	
	
	base b = new base ();
	alllocators l = new alllocators();
	@When("launch {string}")
	public void launch(String string) {
	   
		driver.get(string);
	
	}
	

	
	@When("enter email {string}")
	public void enter_email(String emailv){
	
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		b.inputtext(ele, emailv);
		
	   
	}

	@When("enter password {string}")
	public void enter_password(String passv) {
		
		
		b.inputtext(l.getLogpass(), passv);
	   
	}
	@Then("click login")
	public void click_login() {
		
	WebElement loe = driver.findElement(By.xpath("//button[@name='login']"));
		b.choose(loe);
	    
	}
	


}
