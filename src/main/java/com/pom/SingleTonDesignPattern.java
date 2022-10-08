package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPattern {
	
	public static WebDriver driver;
	
	public SingleTonDesignPattern(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver2, this);
	
	}

	public  LoginPage getLoginPage() {
		
		LoginPage lp = new LoginPage(driver);
		return lp;
		
		
	}
	
	public  SignUpPage getSignUpPage() {
		
		SignUpPage sup = new SignUpPage(driver);
		return sup;
		
	}

}
